package ocp.innerClass;

public class AnonInner{
  abstract class SaleOnlyTOday{
    abstract void sale();
  }

  public SaleOnlyTOday st = new SaleOnlyTOday(){
    public void sale(){
      System.out.println("salse");
    }
  };  
  public void getSale(){
    String name = "java";
    name += "ocp";
  final SaleOnlyTOday sot = new SaleOnlyTOday(){
    // modifier 'static' is only allowed in constant variable declarations
    static final int age = 10 ;
    void sale(){
      System.out.println("sales today") ;
      // System.out.println(name);//can not access name since it is not effectively final
    }
    // static void m1(){}//static method is not allowed here
  };//this is needed, since we declare a local variable here

  //no interface in the method, not allowed here
  // interface SalesTomorrow{
  //   int dollarOff();
  // }
}
  interface SalesTomorrow{
    int dollarOff();
  }
public int getDollar(int dollar){

  SalesTomorrow st = new SalesTomorrow(){
    //no interface in the anonymous class, not allowed here
    // interface SalesTomorrow{
    //   int dollarOff();
    // }
    public int dollarOff(){//public is mandatory
      return 9;
    }
  };
  return dollar - st.dollarOff();
}
}
