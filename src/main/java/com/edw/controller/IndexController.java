package com.edw.controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * <pre>
 *     com.edw.controller.IndexController
 * </pre>
 *
 * @author Muhammad Edwin < edwin at redhat dot com >
 * 06 Agt 2020 10:32
 */
@Path("/")
public class IndexController {
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String hello() {
        return "{\"Hello World\":\"Using Quarkus\"}";
    }
}
