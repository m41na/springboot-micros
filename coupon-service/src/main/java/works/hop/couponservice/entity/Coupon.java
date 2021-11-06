package works.hop.couponservice.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import java.math.BigDecimal;
import java.time.LocalDate;

@Table
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Coupon {

    @Id
    Long id;
    String code;
    BigDecimal discount;
    LocalDate expDate;
}
