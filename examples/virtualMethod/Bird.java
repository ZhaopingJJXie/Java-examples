package examples.virtualMethod;
/**
non-final, non-static and non-private are virtual methods.
They can be overridden and they perform polymorphism.
dynamic binding at runtime, but not other methods.
*/

/* in this examples, fly() is private in the super class, the
subclass defines it's own version of fly(). It is legal but the fly()
method is not dynamic binding for :
Bird bird = new Pelican();*/

public class Bird{
  private void fly(){
    System.out.println("A bird can fly");
  }
  public static void main(String args[]){
    Bird bird = new Pelican();
    bird.fly();//A bird can fly
  }
}
class Pelican extends Bird{
  protected void fly(){
    System.out.println("A pelican can fly");
  }
}
