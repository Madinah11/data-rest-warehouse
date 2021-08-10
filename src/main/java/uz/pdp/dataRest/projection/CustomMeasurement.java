package uz.pdp.dataRest.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.dataRest.entity.Measurement;

@Projection(types = Measurement.class)
public interface CustomMeasurement {
    Integer getId();

    String getName();
}
