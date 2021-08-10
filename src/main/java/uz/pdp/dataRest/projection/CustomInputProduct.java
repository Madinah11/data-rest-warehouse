package uz.pdp.dataRest.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.dataRest.entity.*;
import java.time.LocalDateTime;

@Projection(types = InputProduct.class)
public interface CustomInputProduct {
    Integer getId();

    Product getProduct();

    Double getAmount();
    
    Double getPrice();

    Input getInput();

    LocalDateTime getExpireDate();

}
