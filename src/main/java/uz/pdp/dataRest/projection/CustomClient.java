package uz.pdp.dataRest.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.dataRest.entity.Client;

@Projection(types = Client.class)
public interface CustomClient {
    Integer getId();

    String getName();

    String getPhoneNumber();


}
