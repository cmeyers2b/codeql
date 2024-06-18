package com.webservice.test.service.impl;

import com.webservice.test.constant.SftpHosts;
import com.webservice.test.dto.SftpProperties;
import com.webservice.test.service.IhubService;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.Arrays;
import java.util.Collections;

@Service
public class IhubServiceImpl implements IhubService {

    @Override
    public SftpProperties getConfigurtationData(String host) {

        try {
            RestTemplate restTemplate = new RestTemplate();

            HttpHeaders headers = new HttpHeaders();

            headers.add("user-agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/54.0.2840.99 Safari/537.36");

            headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));

            HttpEntity<String> entity = new HttpEntity<>(host, headers);

            ParameterizedTypeReference<SftpProperties> responseType = new ParameterizedTypeReference<SftpProperties>() {};

            ResponseEntity<SftpProperties> result = restTemplate.exchange("randomHost", HttpMethod.GET, entity, responseType);

            return result.getBody();
        }catch (Exception e){
            return null;
        }
    }
}
