package examples.privateMember;

class MyClass{
  private String name;
  public String getName(){
    MyClass mc3 = new MyClass();
    return mc3.name;//private members are only visiable in the same class
  }
}
public class PrivateMember{
  public static void main(String[] args){
    MyClass mc1 = new MyClass();
    MyClass mc2 = new MyClass();
    // String str1 = mc1.name;//not in the same class, not visiable
  }
}
