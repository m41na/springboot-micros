package works.hop.couponservice.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import works.hop.couponservice.entity.Coupon;

@Repository
public interface CouponRepository extends CrudRepository<Coupon, Long> {

    Coupon findByCode(String code);
}
