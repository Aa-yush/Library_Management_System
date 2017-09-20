import java.io.*;  // import input-output package to use serializable class
/* 

Make Books Class which has Instance member variable to store information about Books

*/

public class Books implements Serializable{
	private  String  bid;
	private  String  bname;
	private  String  aname;
/*
Making POJO methods which has setter and getter methods 
setter method for assign the values && getter method to get the values 

*/
	public void setBid ( String bid ) {
		this.bid = bid;
	}
	
	public void setBname ( String bname ) {
		this.bname = bname;
	}
	
	public void setAname ( String aname ) {
		this.aname = aname;
	}
	
	public String getBid() {
		return( bid );
	}
	
	public String getBname() {
		return ( bname );
	}
	
	public String getAname() {
		return ( aname );
	}
/*

Making a parameterized constructor to assign values all values in variables

*/	
	
	public Books ( String bid, String bname, String aname ) {
		this.bid = bid;
		this.bname = bname;
		this.aname = aname;
	}
	
}