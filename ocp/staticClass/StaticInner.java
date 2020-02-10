package ocp.staticClass;

public class StaticInner{
  static int a = 10;
  String str = "java";
  static class A{
    static int b = 10 ;
    String name = "ocp";
    public void print(){
      System.out.println(a + name);//10ocp
      // System.out.println(str);//can no t access non-static member of enclosing class
    }
  }
  public static void main(String[] args){
    StaticInner.A sta = new StaticInner.A();
    System.out.println(sta.b + sta.name);//10ocp
    sta.print();


  }
}
