package com.java.sourcefiles;

import java.sql.SQLException;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.pojo.files.CreatePojo;
import com.servicefiles.ServiceAll;

@Path("/base")
public class Create {

	
	@GET
	@Path("/read")
	@Produces({ MediaType.APPLICATION_JSON })
	@Consumes({ MediaType.APPLICATION_JSON})
	public List<CreatePojo> getAllRecords() throws ClassNotFoundException
	{  
	        return ServiceAll.getAllRecords();
       
	}
	
	
	@POST
	@Path("/create")
	@Produces({MediaType.APPLICATION_JSON})
	@Consumes({MediaType.APPLICATION_JSON})
	public String create(CreatePojo cj) throws ClassNotFoundException
	{

		return ServiceAll.create(cj);
		
		
	}
	
	


}
