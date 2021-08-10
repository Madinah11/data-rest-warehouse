package uz.pdp.dataRest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.dataRest.entity.Users;
import uz.pdp.dataRest.projection.CustomUser;

@RepositoryRestResource(path = "user",excerptProjection = CustomUser.class)
public interface UserRepository extends JpaRepository<Users,Integer> {
}
