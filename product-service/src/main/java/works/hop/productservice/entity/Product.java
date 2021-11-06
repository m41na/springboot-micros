package works.hop.productservice.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.relational.core.mapping.Table;

import java.math.BigDecimal;

@Table
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {

    @Id
    Long id;
    String name;
    BigDecimal price;
    String description;
    @Transient
    String couponCode;
}
