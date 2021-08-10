package uz.pdp.dataRest.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.dataRest.entity.*;

@Projection(types = Product.class)
public interface CustomProduct {
    Integer getId();

    String getCode();

     String getName();

    Category getCategory();

    Attachment getPhoto();

    Measurement getMeasurement();
}
