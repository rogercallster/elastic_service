package com.elasticsearch.elastic_service;

import com.elasticsearch.elastic_service.service.ESService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


import java.util.HashMap;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ElasticServiceApplicationTests {

    @Autowired
    private ESService esService;

    @Mock
    Map<String, Object> map;

    @Test
    public void contextLoads() {
//        Mockito.when(map.get(Mockito.anyString())).thenReturn("hello");
//        esService.setIndex(map);
//        esService.getIndex("key");

    }

}
