package com.yahyasghayron.youtube_clone_tuto.models;

import java.util.List;
import java.util.Set;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.yahyasghayron.youtube_clone_tuto.enumerations.VideoStatus;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(value = "Video")
public class Video {
    @Id
    private String id;
    private String title;
    private String description;
    private String userId;
    private Integer likes;
    private Integer disLikes;
    private Set<String> tags;
    private String url;
    private VideoStatus videoStatus;
    private String viewCount;
    private String thumbnailUrl;
    private List<Comment> comments;

}
