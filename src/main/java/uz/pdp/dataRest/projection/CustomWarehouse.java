package uz.pdp.dataRest.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.dataRest.entity.Warehouse;

@Projection(types = Warehouse.class)
public interface CustomWarehouse {

    Integer getId();

    String getName();

    boolean getActive();
}
