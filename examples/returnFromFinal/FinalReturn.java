package examples.returnFromFinal;
/** the finally block always execute right after the return statement is encountered
and before the return executes. So return in finally block will change the return
from the method.*/
import java.io.*;
public class FinalReturn{
  public static void doStuff(int i ) throws IOException{
    if (i == 0){
      throw new IOException();
    }else{
    System.out.println("fine");}
  }
  public static String doMoreStuff(int i){
    String str = "java";
    try{
      doStuff(i);
    }catch (IOException e){
      return str + " good";
    }finally {
      return str + " bad";
    }
    // System.out.println("end of the method");//compilation error, unreachable code
  }
  public static void main(String args[]){
    /*main method does not have to declarento throw exception
    since the doMoreStuff() method does not throw an exception*/
    int a = 0 ;
      System.out.println(doMoreStuff(a));//java bad

  }
}
