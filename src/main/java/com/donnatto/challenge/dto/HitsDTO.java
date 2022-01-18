package com.donnatto.challenge.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class HitsDTO {

    @JsonProperty("created_at")
    private String createdAt;
    private String title;
    private String url;
    private String author;
    private Integer points;
    @JsonProperty("story_text")
    private String storyText;
    @JsonProperty("comment_text")
    private String commentText;
    @JsonProperty("num_comments")
    private Integer numComments;
    @JsonProperty("story_id")
    private Integer storyId;
    @JsonProperty("story_title")
    private String storyTitle;
    @JsonProperty("story_url")
    private String storyURL;
    @JsonProperty("parent_id")
    private Integer parentID;
    @JsonProperty("created_at_i")
    private Integer createdAtI;
    @JsonProperty("_tags")
    private List<String> tags;
    private String objectID;
    @JsonProperty("_highlightResult")
    private HighlightResultDTO highlightResult;
}
