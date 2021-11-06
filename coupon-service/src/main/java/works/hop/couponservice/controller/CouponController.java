package works.hop.couponservice.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import works.hop.couponservice.entity.Coupon;
import works.hop.couponservice.repository.CouponRepository;

@RestController
@RequestMapping("/coupon-api")
@RequiredArgsConstructor
public class CouponController {

    final CouponRepository couponRepository;

    @PostMapping
    public ResponseEntity<Coupon> createCoupon(@RequestBody Coupon coupon){
        return ResponseEntity.ok(couponRepository.save(coupon));
    }

    @GetMapping("/{code}")
    public ResponseEntity<Coupon> getCoupon(@PathVariable String code){
        System.out.println("port 8090");
        return ResponseEntity.ok(couponRepository.findByCode(code));
    }
}
