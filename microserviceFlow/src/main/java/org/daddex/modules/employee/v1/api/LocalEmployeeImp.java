package org.daddex.modules.employee.v1.api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/greeting")
public class LocalEmployeeImp {
	@GET
	@Path("/hello/{name}")
	@Produces(MediaType.TEXT_PLAIN)
	public Response greet(@PathParam("name") String name){
		return Response.ok("method  doGet invoked").build();
	}
}
