package uz.pdp.dataRest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.dataRest.entity.OutputProduct;
import uz.pdp.dataRest.projection.CustomOutputProduct;

@RepositoryRestResource(path = "outputProduct",excerptProjection = CustomOutputProduct.class)
public interface OutProductRepository extends JpaRepository<OutputProduct,Integer> {
}
