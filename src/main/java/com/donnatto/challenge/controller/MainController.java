package com.donnatto.challenge.controller;

import com.donnatto.challenge.dto.AlgoliaResponseDTO;
import com.donnatto.challenge.service.FetchService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    private final FetchService fetchService;

    public MainController(FetchService fetchService) {
        this.fetchService = fetchService;
    }

    @GetMapping("/search")
    public ResponseEntity<AlgoliaResponseDTO> fetchURL() {
        return fetchService.fetchURL();
    }
}
