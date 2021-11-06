package works.hop.productservice.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import works.hop.productservice.model.Coupon;

@FeignClient("gateway-service")
public interface CouponClient {

    @GetMapping("/coupon-api/{code}")
    Coupon getCoupon(@PathVariable String code);
}
