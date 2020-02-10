package examples.checkedException;

import static java.lang.System.out;

class Animal{
  public void eat() throws Exception{
    out.println("animal eats");
  }
}

public class CheckedException extends Animal{
  /*overriding method does not throw checkedException*/
  public void eat() {
    out.println("dog eats");
  }
  public static void main(String args[]) throws Exception{
    CheckedException ce = new CheckedException();
    ce.eat();

    Animal a = new CheckedException();
      a.eat();//comile errot - unrecported exception
  }

}
