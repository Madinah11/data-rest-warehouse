package uz.pdp.dataRest.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.dataRest.entity.*;

import java.util.Set;

@Projection(types = Users.class)
public interface CustomUser {
    Integer getId();

    String getFirstName();

    String getLastName();

    String getPhoneNumber();

    String getCode();

    String getPassword();

    Set<Warehouse> getWarehouseSet();
}
