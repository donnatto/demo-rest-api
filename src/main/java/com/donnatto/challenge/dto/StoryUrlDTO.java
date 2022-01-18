package com.donnatto.challenge.dto;

import lombok.Data;

import java.util.List;

@Data
public class StoryUrlDTO {
    private String value;
    private String matchLevel;
    private List<String> matchedWords;
}
