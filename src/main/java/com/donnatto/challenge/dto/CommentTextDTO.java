package com.donnatto.challenge.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class CommentTextDTO extends BaseResultDTO {
    private Boolean fullyHighlighted;
}
