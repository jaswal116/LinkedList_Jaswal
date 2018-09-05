package com.jaswal.resale.ticket;

import javax.ws.rs.CookieParam;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Cookie;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.NewCookie;
import javax.ws.rs.core.Response;

@Path("/rc")
public class CookieFunc {

	// add a new cookie via the ResponseBuilder by calling the cookie() method providing a NewCookie object. 
	@Path("cn")
	@POST
	public Response createCookie() {
		return Response
				.ok()
				.cookie(new NewCookie("name1","value1"))
				.build();
	}
	
	//to update an existing cookie, you can simply add a new cookie with the same name. This will override the existing cookie.
	
	@Path("cu")
	@POST
	public Response updateCookie(@CookieParam("name1") Cookie cookie) {
		if(cookie!=null) {
			return Response
					.ok()
					.cookie(new NewCookie("name1","new-value"))
					.build();
		}
		return Response.ok().build();
		
	}
	
	//To delete an existing cookie you can set the maxAge property to 0. This will remove the cookie.
	@Path("/cd")
	@DELETE
	public Response deleteCookie(@CookieParam("name1") Cookie cookie) {
		if (cookie!=null) {
			NewCookie newCookie = new NewCookie(cookie, "delete cookie", 0, false);
			return Response
					.ok()
					.cookie(newCookie)
					.build();
		}
		return Response.ok().build();
	}
	
	//retrieve a list of all cookies by injecting the HttpHeaders with the @Context annotation
	@Path("/cl")
	@GET
	public Response list(@Context HttpHeaders headers) {
		for (String name : headers.getCookies().keySet()) {
			Cookie cookie = headers.getCookies().get(name);
			System.out.println("Cookie : "+ name+"= "+cookie.getValue());
		}
		return Response.ok().build();
	}
	
	//send cookies using the JAX-RS Client API by calling the Builder#cookie(name, value) method. 
	//This will add a request cookie to the HTTP Request
	
	
	
}
