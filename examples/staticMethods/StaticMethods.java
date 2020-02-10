package examples.staticMethods;
/* static method name in superclass and interface can have the same signature*/
class mySuperClass{
  public static int returnInt(){
    return 1;
  }
}

interface myInterface{
  static int returnInt(){
    return 2;
  }
  int num = 5;
}
interface myAnotherInterface{
  static int returnInt(){
    return 4;
  }
  int num = 6;
}

public class StaticMethods extends mySuperClass implements
myInterface, myAnotherInterface{
  static String name = "java";
  // static method can not refer aninstance variable
  public void getName(){
    // return this.name;

  }
  public static int returnInt(){
    return 3;
  }
  public static void main(String[] args){
    System.out.println(myInterface.num);
    System.out.println(myInterface.num);
    System.out.println(returnInt());
    System.out.println(myInterface.returnInt());
    System.out.println(mySuperClass.returnInt());
    System.out.println(name="javacode");
  }

}
