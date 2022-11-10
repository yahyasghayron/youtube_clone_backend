package com.yahyasghayron.youtube_clone_tuto.services;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Date;

import org.springframework.web.multipart.MultipartFile;

public class StorageServise implements FileService {

    @Override
    public String uploadFile(MultipartFile file) throws IOException {
        String folder = "/javaStore/youtube_clone/videos/";
        String fileName = new Date().toString();
        Path path = Paths.get(folder + fileName);
        Files.write(path, file.getBytes());
        // upload file to a storage folder and return its path
        return null;
    }

}
