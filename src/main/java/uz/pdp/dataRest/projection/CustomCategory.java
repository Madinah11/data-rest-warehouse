package uz.pdp.dataRest.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.dataRest.entity.Category;


@Projection(types = Category.class)
public interface CustomCategory {
    Integer getId();

    String getName();

    Category getParentCategory();


}
