package ocp.stream;

import java.util.stream.* ;
import java.util.*;

public class Person{
  public String name;
  public Integer age;

  public Person(String name, Integer age){
    this.name = name;
    this.age = age;
  }
  public String getName(){return name;}
  public Integer getAge(){return age;}
  public String toString(){return this.name + " is " + this.age +  " years old";}
}
