package com.jaswal.resale.ticket;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path(value = "/test")
public class Test {

	
	@Path(value = "/hi")
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String sayHi()
	{
		return "Its working...";
	}
}
