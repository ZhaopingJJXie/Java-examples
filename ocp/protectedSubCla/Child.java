package ocp.protectedSubCla;
import ocp.protectedSubCla.anotherPackage.*;

public class Child extends Parent{
  int x = 20;//protected member can be redefined, hidden
  public void m1(){
    //super and this can not be reference from a static context
      System.out.println("super.x is: " + super.x);
  }
  public static void main(String[] args){
    Child c = new Child();
    Parent p = new Child();

    System.out.println("c.x is: " + c.x);
    System.out.println("c.y is: " + c.y);
    //default access member can not be accessed outside the package
    // System.out.println("c.z is: " + c.z);
    c.m1();
    //a Parent refernce can not access protected y here
    // System.out.println("p.y is: " + p.y);

  }
}
