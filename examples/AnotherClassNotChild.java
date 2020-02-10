package examples;

import examples.protectedMember.Parent;

public class AnotherClassNotChild {
  public static void main(String args[]){
      Child c = new Child();
        /* System.out.println(c.myValue);
        myValue is not visible in
        in the outside package  class that is not a subclass */

  }
}
