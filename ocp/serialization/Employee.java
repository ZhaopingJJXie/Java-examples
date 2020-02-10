package ocp.serialization;

import java.io.*;

public class Employee extends superEmployee implements Serializable {
	public String firstName;
	private static final long serialVersionUID = 5462223600l;
  public static String color = "RED";
  
}

class superEmployee  {
	public String lastName = "Jojo";
	static  String companyName ="Fargo";
	transient  String address;
	static transient String companyCEO = "Tine";
}
