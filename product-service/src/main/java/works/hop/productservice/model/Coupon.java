package works.hop.productservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Coupon {

    Long id;
    String code;
    BigDecimal discount;
    LocalDate expDate;
}
