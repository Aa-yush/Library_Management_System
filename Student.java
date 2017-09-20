import java.io.*;     // import input-output package to use serializable class
/* 

Make Student Class which has Instance member variable to store information about Student

*/

public class Student implements Serializable {
	private  String  iid;
    private  String  sid;
	private  String  sname;
	private  String  scont;
/*
Making POJO methods which has setter and getter methods 
setter method for assign the values && getter method to get the values 

*/	
	public void setIid ( String iid ) {
		this.iid = iid;
	}	
	
	public void setSid ( String sid ) {
		this.sid = sid;
	}
	
	public void setSname ( String sname ) {
		this.sname = sname;
	}
	
	public void setScont ( String scont ) {
		this.scont = scont;
	}
	
	public String getIid() {
		return ( iid );
	}
	
	public String getSid() {
		return( sid );
	}
	
	public String getSname() {
		return( sname );
	}
	
	public String getScont() {
		return( scont );
	}
/*

Making a parameterized constructor to assign values all values in variables

*/	
	
	public Student ( String iid, String sid, String sname, String scont ) {
		this.iid = iid;
		this.sid = sid;
		this.sname = sname;
		this.scont = scont;
	}
	
}