package es.webstilos.tocdify.service;

import java.nio.file.Path;

import org.springframework.web.multipart.MultipartFile;

public interface RenamerService {

    Path getPath(MultipartFile multipartFile);

}
