package com.nest.res.bop.domain;


import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import com.nest.res.domain.Policy;

public class State    extends Policy  {
	private String Id;
	private String Name;
	
	
	
	public  State (String Id, String Name)  {
	  this.Id = Id;
		this.Name = Name;
	  
	}
	
	
	
	


	public String  getName() {
		return this.Name;
	}
	public String  getId() {
		return this.Id;
	}
	
	public void setId(String Id) {
		this.Id = Id;
	}
	public void setName(String Name) {
		this.Name = Name;
	}
}