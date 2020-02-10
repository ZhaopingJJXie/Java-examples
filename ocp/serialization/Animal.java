package ocp.serialization;
import java.io.Serializable;
/**
constructors and default inintializations are ignored during deserialization.
transient instance variables are not serialized.
transient static variables is not part of the object,  thre is no impact on static
variables using transient keyword. And transient final variables are serialized directly
by their values, no impact of declaring transient final variables
*/
public class Animal implements Serializable{
  private static final long seriaVersionUID = 1L;
  private String name;
  private int age;
  private char type;
  private transient int number = 30;
  private static int id = 30;
  private static transient double salary = 3000;
  private transient final String pos = "office";


  public Animal(String name, int age, char type, int id, double salary ){
    this.name = name;
    this.age  = age;
    this.type = type;
    this.id = id;
    this.salary = salary;
  }
  public String getName(){return name;}
  public int getAge(){return age;}
  public char getType(){return type;}

  public String toString(){
    return "Animal [name=" + name + ", age="+ age + ", type="+ type + ", id=" +
    id + ", salary=" + salary+ ", pos=" + pos+ ", number=" + number+ "]" ;
  }
}
