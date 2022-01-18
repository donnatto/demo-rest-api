package com.donnatto.challenge.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AlgoliaResponseDTO {

    private List<HitsDTO> hits;
    private Integer nbHits;
    private Integer page;
    private Integer nbPages;
    private Integer hitsPerPage;
    private Boolean exhaustiveNbHits;
    private Boolean exhaustiveTypo;
    private String query;
    private String params;
    private Object renderingContent;
    private Integer processingTimeMS;
}
