package examples.staticFinalMethod;

import static java.lang.System.out;

class A{
  public static final void a(){
    out.println("from A");
  }
}

class B extends A {
  /* subclass cannot hide static final methods in superclass*/
  public static void a(int a ){
    out.println("from B");
  }
}

public class StaticFinal {
  public static void main(String args[]){
    B b = new B();
    B.a();
    }
}
