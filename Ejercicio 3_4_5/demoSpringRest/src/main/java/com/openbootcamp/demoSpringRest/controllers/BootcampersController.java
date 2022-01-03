package com.openbootcamp.demoSpringRest.controllers;

import com.openbootcamp.demoSpringRest.models.Bootcamper;
import com.openbootcamp.demoSpringRest.services.BootcamperService;
import org.springframework.stereotype.Component;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import java.net.URI;
import java.util.List;

@Component
@Path("/")
public class BootcampersController {
    private BootcamperService bootcamperService;

    public BootcampersController(BootcamperService bootcamperService){
        this.bootcamperService=bootcamperService;

        this.bootcamperService.add(new Bootcamper("Jose",Math.random()));
        this.bootcamperService.add(new Bootcamper("Juan",Math.random()));
        this.bootcamperService.add(new Bootcamper("Maria",Math.random()));
    }

    @GET
    @Path("/bootcampers")
    @Produces("application/json")
    public List<Bootcamper> devolverTodos(){
        return bootcamperService.getAll();
    }

    @GET
    @Path("/bootcampers/{nombre}")
    @Produces("application/json")
    public Bootcamper devolverUno(@PathParam("nombre") String nombre){
        return bootcamperService.get(nombre);
    }

    @POST
    @Path("/bootcampers")
    @Produces("application/json")
    @Consumes("application/json")
    public Response meterBootcamper(Bootcamper bootcamper){
        bootcamperService.add(bootcamper);

        return Response.created(
                URI.create("/bootcampers/"+bootcamper.getNombre())
        ).build();
    }

}
