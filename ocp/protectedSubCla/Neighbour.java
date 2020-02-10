package ocp.protectedSubCla;

import ocp.protectedSubCla.anotherPackage.*;

public class Neighbour{
  public static void main(String[] args){
    Child c = new Child();
    //protected memer is not visiable here
    // System.out.println("c.y is: " + c.y);
  }
}
