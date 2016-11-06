package es.webstilos.tocdify.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import es.webstilos.tocdify.service.FileService;

@Controller
public class UploadController {

    @Autowired
    private FileService uploadService;

    @PostMapping("/")
    public String handleFileUpload(@RequestParam("file") MultipartFile file, RedirectAttributes redirectAttributes) {
	uploadService.save(file);
	redirectAttributes.addFlashAttribute("message", "Uploaded " + file.getOriginalFilename() + " succesfully.");
	return "redirect:/";
    }

}
