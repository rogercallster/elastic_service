package com.elasticsearch.elastic_service.service;

import org.springframework.stereotype.Service;

import java.util.Map;

public interface ESService {

    void setIndex (Map<String, Object> jsonMap);

    Map<String, Object> getIndex(String key);




}
