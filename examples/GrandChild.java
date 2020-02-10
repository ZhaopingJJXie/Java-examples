package examples;
import java.util.*;

/*variables are not overridden, you can hide the variables in the super class.*/
public class GrandChild extends Child{
  static String name = "javaChild";
  int grade = 20;
  public int getMyValue(){
    return Child.grade;
  }
  public void callDefault(int a ){

  }
  // static void shout(){//can not override final methods
  //   System.out.println("Grandchild");
  // }

  public static void main(String[] args){
  List str = null;
  Object obj;
  obj = str;

}
}
