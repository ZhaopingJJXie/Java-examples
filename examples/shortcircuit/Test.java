package examples.shortcircuit;
/*java parses the expression from left to right. Once it realize
the lefet operand of a condition or is true it will evaluate to true*/
class A{}
class B extends A{}
public class Test{
  static boolean a, b, c;
  public static void main(String[] args){
    boolean bool = (a = true) || (b = true) && (c = true);
    boolean d = null instanceof String;//null is not instance of any class
    String s = null;
    String s1 = null;
    StringBuilder sb = null;
    System.out.println(a + ", " + b + ", " + c + ", " + d);
    System.out.println(s1==s);//true;
    // System.out.println(s1==sb);//compilation error, different classes
    // System.out.println(s1.equals(s));//NullPointerException;
    A a = new A();
    B b = new B();
    System.out.println(a==b);//False
    // (5000>1000)?15:10;//not s statement



  }
}
