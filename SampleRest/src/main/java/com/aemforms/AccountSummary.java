package com.aemforms;

public class AccountSummary {
	String description;
	String current;
	String ytd;
	public void setDescription(String description)
	{
		this.description = description;
	}
	public String getDescription()
	{
		return this.description;
	}
	
	public void setCurrent(String current)
	{
		this.current = current;
	}
	public String getCurrent()
	{
		return this.current;
	}
	
	public void setYtd(String ytd)
	{
		this.ytd = ytd;
	}
	public String getYtd()
	{
		return this.ytd;
	}

}
