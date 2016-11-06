package es.webstilos.tocdify.service.impl;

import java.io.IOException;
import java.nio.file.Files;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import es.webstilos.tocdify.service.FileService;
import es.webstilos.tocdify.service.RenamerService;

@Service
public class FileSystemServiceImpl implements FileService {

    @Autowired
    private RenamerService renamerService;

    @Override
    public void save(MultipartFile multipartFile) {
	if (multipartFile.isEmpty()) {
	    throw new IllegalArgumentException("File is empty!");
	}
	try {
	    Files.copy(multipartFile.getInputStream(), renamerService.getPath(multipartFile));
	} catch (IOException e) {
	    throw new RuntimeException("Can't copy file in this path");
	}
    }

}
