package com.yahyasghayron.youtube_clone_tuto.services;

import java.io.IOException;

import org.springframework.web.multipart.MultipartFile;

public interface FileService {
    public String uploadFile(MultipartFile file) throws IOException;
}
