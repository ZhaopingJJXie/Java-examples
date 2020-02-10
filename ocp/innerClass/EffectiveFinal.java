package ocp.innerClass;

public class EffectiveFinal{
  private int length  = 5;
  static String name = "java";
  public void isFinal(int width){
     //  width is effectively final if it is not changed
    int one = 1;//effectively final
    int two = one;//not effectively final
    two++;
    int three;//effectively final
    if(one == 4) three = 3;
    else three = 4;
    int four = 4;//not effectively final
    class A{
      //local class can not delcare static members, unless the they are constant variables
      public static final String farewell = "Bye bye";//ok
      //illegal static method here
      // public static void print(int a){
      //   System.out.println(a);
      // }

      //no interface in the anonymous class, not allowed here
      // interface SalesTomorrow{
      //   int dollarOff();
      // }
      public void print(){
        // System.out.println(one + " " + two + " "  +three + " " + four);
        System.out.println(one + " " +three + " " );
        System.out.println(length * one);
        //can access the parameter from the enclosing method
        System.out.println(length * width);
      }
    }
    A a = new A();
    a.print();
    four = 5;

  }

  static public void getName(){
    class D{
      public void print(){
        System.out.println(name);
        // System.out.println(lenght);//can not access non-static member of enclosing class
      }
    }

    D d = new D();
    d.print();
  }
    public static void main(String[] args){
      EffectiveFinal ef = new EffectiveFinal();
      ef.isFinal(3);
      ef.getName();
    }
}
