package examples.unreachableException;

import java.io.IOException;

public class UnreachableException{
  public static void  eat() {}
  public static void main(String[] args) {
    try{
      System.out.println("work real hard");
      eat();
    }catch (Exception e){}
    //   catch(IOException e){
    // }//method in the body doe not declare to throw any chekced exception
    // so there is no need to catch a IOException because this code is unreachable
    // for (int i = 0 ; false; i++){
      // int j = 3;//unreachable statement
    // }
    long l = 0b11010l;
    byte b = 0b110;
    short s = 02230;//1176
    // short s2 = 0898;//error
    double d = 02230D;//2230.0
    double d4 = 0223;//147.0
    float f = 01110f;
    double d1 = 0110d;//110.0
    double d2 = 0x11029d;//1114781.0
    System.out.println(s + " " + d + " " + f + " " + d2 + " "+ d4);
    // double d = 0b10110f;//compilation errr

  }


}
