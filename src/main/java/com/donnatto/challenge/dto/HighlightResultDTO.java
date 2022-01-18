package com.donnatto.challenge.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class HighlightResultDTO {
    private AuthorDTO author;
    @JsonProperty("comment_text")
    private CommentTextDTO commentText;
    @JsonProperty("story_title")
    private BaseResultDTO storyTitle;
    @JsonProperty("story_url")
    private BaseResultDTO storyURL;
}
