package com.elasticsearch.elastic_service.search.elasticsearch.clients;

import org.elasticsearch.client.RestClient;
import org.springframework.stereotype.Component;

@Component
public class ESRestClient  {
    private  RestClient restClient;

    public  ESRestClient() {
//        restClient.setHosts(new Host);
    }
}