package uz.pdp.dataRest.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.dataRest.entity.*;
import java.sql.Timestamp;

@Projection(types = Input.class)
public interface CustomInput {
    Integer getId();

    Timestamp getDate();

    String getFactureNumber();

    String getCode();

    Warehouse getWarehouse();

    Currency getCurrency();

    Supplier getSupplier();
}
