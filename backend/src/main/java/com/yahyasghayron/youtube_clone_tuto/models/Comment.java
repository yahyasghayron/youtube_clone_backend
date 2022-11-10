package com.yahyasghayron.youtube_clone_tuto.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Comment {
    @Id
    private String Id;

    private String text;
    private String authorId;
    private Integer likes;
    private Integer disLikes;

}
