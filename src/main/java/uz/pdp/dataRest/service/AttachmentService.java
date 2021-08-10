package uz.pdp.dataRest.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import uz.pdp.dataRest.entity.Attachment;
import uz.pdp.dataRest.entity.AttachmentContent;
import uz.pdp.dataRest.payload.Result;
import uz.pdp.dataRest.repository.AttachmentContentRepository;
import uz.pdp.dataRest.repository.AttachmentRepository;
import java.io.IOException;
import java.util.Iterator;
@Service
public class AttachmentService {
    @Autowired
    AttachmentRepository attachmentRepository;
    @Autowired
    AttachmentContentRepository attachmentContentRepository;

    public Result uploadFile(MultipartHttpServletRequest request) throws IOException {
        Iterator<String> fileNames = request.getFileNames();
        MultipartFile file = request.getFile(fileNames.next());
        Attachment attachment=new Attachment(null,file.getOriginalFilename(),file.getSize(),file.getContentType());
        Attachment attachment1 = attachmentRepository.save(attachment);
        AttachmentContent attachmentContent=new AttachmentContent(null,file.getBytes(),attachment1);
        attachmentContentRepository.save(attachmentContent);
        return new Result("File saved ",true,attachment1.getId());


    }
}
