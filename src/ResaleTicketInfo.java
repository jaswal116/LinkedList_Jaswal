package com.jaswal.resale.ticket;


import javax.ws.rs.BeanParam;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.MatrixParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.jaswal.pojo.UserInput4Bean;

@Path("/rt")
public class ResaleTicketInfo {
	
	@Path("/insert/{ticket_type}/{date}/{time}/{name}/{location}/{price}")
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String receiveTicketInfo(
			@PathParam("ticket_type") String type_,
			@PathParam("date") String date_,
			@PathParam("time") String time_,
			@PathParam("name") String name_,
			@PathParam("location") String location_,
			@PathParam("price") String price_
			) 
	{
		if(type_!=null && date_!=null && time_!=null && name_!=null && location_!=null && price_!=null) 
		{
		System.out.println(type_ +"\t"+date_ +"\t"+time_+"\t"+name_+"\t"+location_+"\t"+price_);
		return "SUCCESS";
		}else {
			return "FAIL";
		}
		
	}
	
	@Path("/query")
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public String insertQuery(
			@QueryParam("ticket_type") String type_,
			@QueryParam("date") String date_,
			@QueryParam("time") String time_,
			@QueryParam("name") String name_,
			@QueryParam("location") String location_,
			@QueryParam("price") String price_
			)
	{
		if(type_!=null &&date_!=null && time_!=null && name_!=null && location_!=null &&  price_!=null) 
		{
		System.out.println(type_ +"\t"+date_ +"\t"+time_+"\t"+name_+"\t"+location_+"\t"+price_);
		return "<result><status>SUCCESS</status></result>";
		}else {
			return "<result><status>FAIL</status></result>";
		}
	}
	
	@Path("/matrix")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String matrix(
			@MatrixParam("ticket_type") String type_,
			@MatrixParam("date") String date_,
			@MatrixParam("time") String time_,
			@MatrixParam("name") String name_,
			@MatrixParam("location") String location_,
			@MatrixParam("price") String price_
			)
	{
		if(type_!=null &&date_!=null && time_!=null && name_!=null && location_!=null &&  price_!=null) 
		{
		System.out.println(type_ +"\t"+date_ +"\t"+time_+"\t"+name_+"\t"+location_+"\t"+price_);
		return "{\"status\",\"SUCCESS\"}";
		}else {
			return "{\"status\",\"FAIL\"}";
		}
	}
	
	@Path("form")
	@POST
	@Produces(MediaType.TEXT_HTML)
	public String form(
			@FormParam("ticket_type") String type_,
			@FormParam("date") String date_,
			@FormParam("time") String time_,
			@FormParam("name") String name_,
			@FormParam("location") String location_,
			@FormParam("price") String price_
			)
	{
		if(type_!=null &&date_!=null && time_!=null && name_!=null && location_!=null &&  price_!=null) 
		{
		System.out.println(type_ +"\t"+date_ +"\t"+time_+"\t"+name_+"\t"+location_+"\t"+price_);
		return "<html><body bgcolor='#054' text='white'><h1>SUCCESS</h1></body></html>";
		}else {
			return "<html><body bgcolor='#054' text='white'><h1>FAIL</h1></body></html>";
		}
	}
	
	@Path("/header/1")
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String header(
			@HeaderParam("user-agent") String userAgent,
			@HeaderParam("accept") String accept,
			@HeaderParam("accept-encoding") String encoding,
			@HeaderParam("accept-language") String lang
			)
	{	
		if(userAgent!=null&&accept!=null && encoding!=null && lang!=null) 
		{
		System.out.println(userAgent +"\t"+accept +"\t"+encoding+"\t"+lang );
		return "<html><body bgcolor='#054' text='white'><h1>SUCCESS</h1></body></html>";
		}else {
			return "<html><body bgcolor='#054' text='white'><h1>FAIL</h1></body></html>";
		}
		/*Map<String, String> map = new HashMap<>();
		map.put("user-agent", userAgent);
		map.put("accept", accept);
		map.put("accept-encoding", encoding);
		map.put("accept-language", lang);
		return Response.ok(map).build();
		*/
		/*StringBuilder responseString = new StringBuilder();
		responseString.append("user-agent").append(userAgent)
		.append("accept").append(encoding)
		.append("accept-encoding").append(userAgent)
		.append("accept-language").append(lang);
		return Response.status(200)
				.entity(responseString.toString())
				.build();*/
		
	}
	
	@Path("/rb")
	@POST
	@Produces(MediaType.TEXT_HTML)
	public String createCustomer(@BeanParam UserInput4Bean userinput) {
		if(userinput!=null) 
		{
		System.out.println(userinput );
		return "<html><body bgcolor='#054' text='white'><h1>SUCCESS</h1></body></html>";
		}else {
			return "<html><body bgcolor='#054' text='white'><h1>FAIL</h1></body></html>";
		}
	}
	
	
}
