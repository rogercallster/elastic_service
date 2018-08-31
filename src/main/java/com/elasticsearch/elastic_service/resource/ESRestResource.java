package com.elasticsearch.elastic_service.resource;

import com.elasticsearch.elastic_service.service.ESService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


@RestController
@RequestMapping(value = "/es")
@Consumes({MediaType.APPLICATION_JSON})
@Produces({MediaType.APPLICATION_JSON})

public class ESRestResource {

    private final ESService esService;

    @Autowired
    public ESRestResource(ESService esService) {
        this.esService = esService;
    }

    @GET
    @RequestMapping(value = "/id")//, method = RequestMethod.GET
    public Response getESResponse() {
        return Response.ok().entity(esService.getIndex()).build();
    }


}
