package uz.pdp.dataRest.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.dataRest.entity.Client;
import uz.pdp.dataRest.entity.Currency;
import uz.pdp.dataRest.entity.Output;
import uz.pdp.dataRest.entity.Warehouse;
import java.sql.Timestamp;

@Projection(types = Output.class)
public interface CustomOutput {
    Integer getId();

    Timestamp getDate();

    String getFactureNumber();

    String getCode();

    Warehouse getWarehouse();

    Currency getCurrency();

    Client getClient();
}
