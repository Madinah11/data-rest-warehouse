package uz.pdp.dataRest.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.dataRest.entity.Supplier;


@Projection(types = Supplier.class)
public interface CustomSupplier {
    Integer getId();

    String getName();

    String getPhoneNumber();


}
