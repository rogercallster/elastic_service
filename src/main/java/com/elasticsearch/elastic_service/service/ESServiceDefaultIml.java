package com.elasticsearch.elastic_service.service;

import org.apache.http.HttpHost;
import org.elasticsearch.client.RestClient;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.Map;

@Service
public class ESServiceDefaultIml implements ESService {

    private RestClient restClient;

    public ESServiceDefaultIml() {
        this.restClient =
                RestClient.builder(
                        new HttpHost("localhost", 19200, "http"),
                        new HttpHost("localhost", 19201, "http")).build();
    }

    @Override
    public void setIndex(Map<String, Object> jsonMap) {

        restClient.performRequest();
    }

    @Override
    public Map<String, Object> getIndex(String key) {
        return Collections.EMPTY_MAP;
    }
}
