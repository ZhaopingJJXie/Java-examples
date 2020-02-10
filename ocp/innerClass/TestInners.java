package ocp.innerClass;

class B{void m(){System.out.println("outer");}}

public class TestInners{
  public static void main(String[] args){
    new TestInners().go();
  }
  void go(){
    new B().m();
    class A{void m(){System.out.println("inner");
    }}

  }
  class A{void m(){System.out.println("middle");}}
}
