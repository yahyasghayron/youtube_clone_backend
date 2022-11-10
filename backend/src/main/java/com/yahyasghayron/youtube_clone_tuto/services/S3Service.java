package com.yahyasghayron.youtube_clone_tuto.services;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class S3Service implements FileService {
    @Override
    public String uploadFile(MultipartFile file) {
        return null;

    }
}
