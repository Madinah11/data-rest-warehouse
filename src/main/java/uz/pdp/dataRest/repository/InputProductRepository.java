package uz.pdp.dataRest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.dataRest.entity.InputProduct;
import uz.pdp.dataRest.projection.CustomInputProduct;


@RepositoryRestResource(path = "inputProduct",excerptProjection = CustomInputProduct.class)
public interface InputProductRepository extends JpaRepository<InputProduct,Integer> {
}
