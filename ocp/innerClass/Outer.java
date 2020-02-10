package ocp.innerClass;
import ocp.enums.* ;

public class Outer{
  private String hi = "Hi";
  protected class Inner{
    //no static methods, but can have static final contants, primitives, Strings
    //  declared final and initialized with a compile-time constant expression
    public static final String farewell = "Bye bye";
    public int reapeat = 3;
    public void go(){
      for (int i = 0; i < reapeat; i++){
        System.out.println(hi);
        System.out.println(farewell);
        }
    }
  }

  public void callInner(){
    Inner in = new Inner();
    in.go();
  }

  public static void main(String[] args){
    Outer outer = new Outer();
    Inner inner = outer.new Inner();
    // outer.Inner = outer.new Inner();
    outer.callInner();
    inner.go();
    TestEnum te = new TestEnum();
    System.out.println(te.ataA);
  }
}
