package com.servicefiles;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.pojo.files.CreatePojo;


public class ServiceAll {
	
	
	
	
	public static   List<CreatePojo>  getAllRecords( ) throws ClassNotFoundException{  
		    List<CreatePojo> list=new ArrayList<CreatePojo>();  
		   
		    CreatePojo namej=new CreatePojo();  
		        	
		   namej.setName("HI");
		   list.add(namej);  
		          
		      
	           
		     return list;  
		}  
	
	
	public static String create( CreatePojo j) throws ClassNotFoundException{
		
		System.out.println(j);
		return 	validation(j.getName());
	}
	
	public static String validation(String d) throws NullPointerException{

		if((d==null)||d.isEmpty())
		d="Value Cannot be Null";
		else if(d.length()>32)
		d="Length should be below / exact 32 characters ";
		
		
		return d;
		
	}
	

}
