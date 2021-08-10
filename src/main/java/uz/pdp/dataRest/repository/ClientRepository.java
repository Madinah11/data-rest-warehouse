package uz.pdp.dataRest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.dataRest.entity.Client;
import uz.pdp.dataRest.projection.CustomClient;

@RepositoryRestResource(path = "client",excerptProjection = CustomClient.class)
public interface ClientRepository extends JpaRepository<Client,Integer> {
}
