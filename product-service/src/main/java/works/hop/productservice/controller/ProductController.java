package works.hop.productservice.controller;

import io.github.resilience4j.retry.annotation.Retry;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import works.hop.productservice.client.CouponClient;
import works.hop.productservice.model.Coupon;
import works.hop.productservice.entity.Product;
import works.hop.productservice.repository.ProductRepository;

@RestController
@RequestMapping("/product-api")
@RequiredArgsConstructor
@RefreshScope
public class ProductController {

    final ProductRepository productRepository;
    final CouponClient couponClient;
    @Value("${some.random.prop}") String someProp;

    @PostMapping
    @Retry(name = "product-api", fallbackMethod = "createProductError")
    public ResponseEntity<Product> createProduct(@RequestBody Product product){
        Coupon coupon = couponClient.getCoupon(product.getCouponCode());
        product.setPrice(product.getPrice().subtract(coupon.getDiscount()));
        return ResponseEntity.ok(productRepository.save(product));
    }

    public ResponseEntity<Product> createProductError(Product product, Exception error){
        System.err.printf("createProductError - %s\n", error.getMessage());
        return ResponseEntity.status(400).body(product);
    }

    @GetMapping("/{name}")
    public ResponseEntity<Product> getProduct(@PathVariable String name){
        return ResponseEntity.ok(productRepository.findByName(name));
    }

    @GetMapping("/prop")
    ResponseEntity<String> someRandomProp(){
        return ResponseEntity.ok(this.someProp);
    }
}
