package uz.pdp.dataRest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import uz.pdp.dataRest.payload.Result;
import uz.pdp.dataRest.service.AttachmentService;

import java.io.IOException;

@RestController
public class AttachmentController {
    @Autowired
    AttachmentService attachmentService;

    @PostMapping
    public Result upload(MultipartHttpServletRequest request) throws IOException {
        Result result = attachmentService.uploadFile(request);
        return result;
    }
}
