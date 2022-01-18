package com.donnatto.challenge.service.impl;

import com.donnatto.challenge.dto.AlgoliaResponseDTO;
import com.donnatto.challenge.service.FetchService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class FetchHackerNews implements FetchService {

    private final RestTemplate restTemplate;
    @Value("${hacker.news.url}")
    private String url;

    public FetchHackerNews(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public ResponseEntity<AlgoliaResponseDTO> fetchURL() {
        ResponseEntity<AlgoliaResponseDTO> response;
        try {
            HttpHeaders headers = new HttpHeaders();
            headers.add("user-agent", "Application");
            HttpEntity<Void> entity = new HttpEntity<>(headers);
            response = restTemplate.exchange(url, HttpMethod.GET, entity, AlgoliaResponseDTO.class);
            if (response.getStatusCode() == HttpStatus.MOVED_PERMANENTLY && response.getHeaders().getLocation() != null) {
                response = restTemplate.exchange(response.getHeaders().getLocation(), HttpMethod.GET, entity, AlgoliaResponseDTO.class);
            }
        } catch (Exception e) {
            response = ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
        return response;
    }
}
