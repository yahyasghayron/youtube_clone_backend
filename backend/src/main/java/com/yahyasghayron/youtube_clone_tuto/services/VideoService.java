package com.yahyasghayron.youtube_clone_tuto.services;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class VideoService {
    public void uploadVideo(MultipartFile file) {
        // upload file to aws s3
        // store video data to database
    }
}
