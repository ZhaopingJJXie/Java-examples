package ocp.protectedSubCla.anotherPackage;

public class ChildInPack extends Parent{
  public static void main(String[] args){
    ChildInPack cip = new ChildInPack();
    System.out.println("cip.x is: " + cip.x);
    System.out.println("cip.y is: " + cip.y);
    System.out.println("cip.z is: " + cip.z);

  }
}
