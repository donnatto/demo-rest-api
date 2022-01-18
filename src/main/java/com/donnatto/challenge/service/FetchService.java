package com.donnatto.challenge.service;

import com.donnatto.challenge.dto.AlgoliaResponseDTO;
import org.springframework.http.ResponseEntity;

public interface FetchService {

    ResponseEntity<AlgoliaResponseDTO> fetchURL();
}
