package examples;
class AnotherClass{}
  /* an interface refernce variable can refer to any class object with an
  explicit casting without compilation error. But if the class does not
  implement the specific interface, ClassCastException will thrown*/
public class InterfaceExample implements Interface1 {
   int aValue = 20;//aValue can be both static and non-static
   // void print(){
   //  System.out.println("print method in implementing class");}
  public int getValue(){//override the default method
    Interface1.print();
    return  Interface1.aValue;
  }
  public  void callGetValue(){
    getValue();
    Interface1.super.getValue();
  }
  public void callDefault(){
    System.out.println(Interface1.super.getValue());
  }
  public int addValue(){
    return aValue + 10 ;}
  public static final void main(String args[]){
    /*interface variable are inherited*/
  InterfaceExample ie = new InterfaceExample();
  System.out.println(ie.aValue);//20
  System.out.println(ie.getValue());//value from interface1
  System.out.println(ie.addValue());//30, 20 + 10
  // System.out.println(Interface1.super.getValue());//not an enclosing class
  Interface1 intf1;
  AnotherClass ac = new AnotherClass();
  // intf1 = (Interface1)(new AnotherClass());//ClassCastException
  // intf1 = ac; does not compile
  // System.out.println(super.getValue());

  }
}
