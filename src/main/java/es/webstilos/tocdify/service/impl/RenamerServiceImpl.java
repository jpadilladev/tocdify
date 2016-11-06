package es.webstilos.tocdify.service.impl;

import java.nio.file.Path;
import java.nio.file.Paths;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import es.webstilos.tocdify.service.RenamerService;

@Service
public class RenamerServiceImpl implements RenamerService {

    @Override
    public Path getPath(MultipartFile multipartFile) {
	// TODO This will be done different!!
	return Paths.get("/" + multipartFile.getOriginalFilename());
    }

}
