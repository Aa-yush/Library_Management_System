import java.io.*;    // import input-output package to use serializable class

/* 

Make Librarian Class which has Instance member variable to store information about Librarian

*/

public class Librarian implements Serializable {
	private  String  lid;
	private  String  lname;
	private  String  lpass;
	private  String  ladd;
	private  String  lcity;
	private  String  lcont;
	
/*
Making POJO methods which has setter and getter methods 
setter method for assign the values && getter method to get the values 

*/	

	
	public void setLid ( String lid ) {
		this.lid = lid;
	}
	
	public void setLname ( String lname ) {
		this.lname = lname;
	}
	
	public void setLpass ( String lpass ) {
		this.lpass = lpass;
	}
	
	public void setLadd ( String ladd ) {
		this.ladd = ladd;
	}
	
	public void setLcity ( String lcity ) {
		this.lcity = lcity;
	}
	
	public void setLcont ( String lcont ) {
		this.lcont = lcont;
	}
	
	public String getLid() {
		return ( lid ) ;
	}
	
	public String getLname() {
		return ( lname );
	}
	
	public String getLpass() {
		return ( lpass );
	}
	
	public String getLadd() {
		return ( ladd );
	}
	
	public String getLcity() {
		return( lcity );
	}
	
	public String getLcont() {
		return( lcont );
	}
	
	public Librarian() {
		
	}
/*

Making a parameterized constructor to assign values all values in variables

*/	
	
	public Librarian ( String lid, String lname, String lpass, String ladd, String lcity,String lcont ) {
		this.lid = lid;
		this.lname = lname;
		this.lpass = lpass;
		this.ladd = ladd;
		this.lcity = lcity;
		this.lcont = lcont;
	}
	
}