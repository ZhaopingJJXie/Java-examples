package ocp.serialization;

import java.io.*;
/**
general rules:
1. transient variables are not Serialized, constructors are not called, initialization
blocks are not called. the first non-serializable super class constructor called
2. static variables are not serialized
3. instance variables inherited from non-serializable super class get super class value
4. static variables inherited from superclass get super class values
*/
public class DeserializationClass {
	public static void main(String[] args) {
		Employee emp = null;
		try {
			FileInputStream fileIn = new FileInputStream("./employee.txt");
			ObjectInputStream in = new ObjectInputStream(fileIn);
			emp = (Employee) in.readObject();
			in.close();
			fileIn.close();
		} catch (IOException i) {
			i.printStackTrace();
			return;
		} catch (ClassNotFoundException c) {
			System.out.println("Employee class not found");
			c.printStackTrace();
			return;
		}
		System.out.println("Deserializing Employee...");
		System.out.println("First Name of Employee: " + emp.firstName);
		System.out.println("Last Name of Employee: " + emp.lastName);
		System.out.println("Company Name: "+emp.companyName);
		System.out.println("Company CEO: "+emp.companyCEO);
		System.out.println("Company Address: "+emp.address);
    System.out.println("color: "+emp.color);

	}
}
