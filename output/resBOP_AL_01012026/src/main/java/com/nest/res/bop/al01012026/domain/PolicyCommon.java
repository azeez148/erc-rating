package com.nest.res.bop.al01012026.domain;


import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import com.nest.res.common.domain.Policy;

public class PolicyCommon    extends Policy  {
	private List<com.nest.res.bop.al01012026.domain.BOP> BOP;
	private List<State> State;
	private String StateId;
	private Date EffDate;
	private String Id;
	
	
	
	public  PolicyCommon ()  {
	  	State = new ArrayList<State>();
		State.add(new State("5139D77F-251C-48A6-8E48-0C5D4714DEA7","ALBAMA"));
		State.add(new State("{5239D77F-251C-48A6-8E48-0C5D4714DEA7}","ALASKA"));

	  
	}
	
	
	
	
	@Override
	public List<Policy> getChilds() {
		List<Policy> childs=new ArrayList<Policy>();
		
		if(null != BOP) {
			childs.addAll(BOP);
		}
		if(null != State) {
			childs.addAll(State);
		}
		return childs;
	}


	public List<com.nest.res.bop.al01012026.domain.BOP> getBOP() {
		return this.BOP;
	}
	public String  getStateId() {
		return this.StateId;
	}
	public Date  getEffDate() {
		return this.EffDate;
	}
	public List<State> getState() {
		return this.State;
	}
	public String  getId() {
		return this.Id;
	}
	
	public void setEffDate(Date EffDate) {
		this.EffDate = EffDate;
	}
	public void setStateId(String StateId) {
		this.StateId = StateId;
	}
	public void setBOP(List<com.nest.res.bop.al01012026.domain.BOP> BOP) {
		this.BOP = BOP;
	}
	public void setState(List<State> State) {
		this.State = State;
	}
	public void setId(String Id) {
		this.Id = Id;
	}
}