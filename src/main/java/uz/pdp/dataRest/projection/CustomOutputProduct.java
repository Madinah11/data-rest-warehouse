package uz.pdp.dataRest.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.dataRest.entity.*;

@Projection(types = OutputProduct.class)
public interface CustomOutputProduct {
    Integer getId();

    Product getProduct();

    Double getAmount();

    Double getPrice();

    Output getOutput();

}
