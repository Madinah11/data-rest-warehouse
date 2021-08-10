package uz.pdp.dataRest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.pdp.dataRest.entity.AttachmentContent;

public interface AttachmentContentRepository extends JpaRepository<AttachmentContent,Integer> {
}
