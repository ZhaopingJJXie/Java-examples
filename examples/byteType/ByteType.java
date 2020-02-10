package examples.byteType;

public class ByteType{
  final static  public void getTpye(){}
  public static void main(String args[]){
    byte b1 = 12;
    byte b2 = ++b1;//legal
    // byte b3 = b2 + b1;, b3 is type of int needs explicit cast here
    byte b3 = (byte) (b1 + b2);
    // byte b4 = 345;out of range, compile error
    byte b4 = (byte)345; //compiles, but unexpected behavior

    b1 %= 5;//legal, compound assignment implement implicit cast
    byte b5 = 3;
    // char c = b5;//possible lossy conversion from byte to char
    long l1 = b5;
    char c= (char)b5;//explicet cast is legal
    short s = b5;//legal;
    // char c = s; //incompatible types: possible lossy conversion from short to char
    int i = 8;
    double d = 5.9;
    i *= d;
    //it equals to i = (int)(i * d)
    b5 += b1;
    b5 -= i;
    //Byte b6 = new Byte(230);//comlilation error;
    // Byte b6 = new Byte("java");//comiles, but NumberFormatException

    Byte bt1 = new Byte((byte)12);
    Byte bt2 = new Byte((byte)12);
    Byte bt3 = Byte.valueOf((byte)12);
    Byte bt4 = Byte.valueOf((byte)12);
    Byte bt5 = 12;
    Byte bt55 = 12;
    Integer it1 = new Integer (12);
    Integer it2 = new Integer (200);
    int ii = 12;
    int ii2 = 200;

    System.out.println("1 " +  (bt1 == bt2));//false, difference wrapper from new
    System.out.println("2 " + (bt3 == bt4));//true, wrapper "pool"
    System.out.println("3 " + (bt1 == bt3));//false, new wrapper and pool
    System.out.println("4 " + (bt1 == bt5));//false, new wrapper and pool
    System.out.println("5 " + (bt3 == bt5));//true, pool and pool

    System.out.println("6 " + (bt1.equals(it1)));//false; different wrappers will return false
    System.out.println("7 " + (it1.equals(ii)));// true;autoboxing and then value compares
    System.out.println("8 " + (bt1.equals(ii)));//false, ii autoboxing to integer and two
    // wrapper classes are always equals to false.
    System.out.println("9 " + (it1 == ii));//true; unboxing, primitive comparsion
    System.out.println("10 " +( bt5 == ii));//true; unboxing
    System.out.println("11 " + ((bt1 == ii)));//true; unboxing

    // System.out.println(it1==bt1);//compilation error, different wrapper class
    // int it2 = Integer.parseInt("12_3");//NumberFormatException
    System.out.println("12 " + (it2 == ii2));//true
    System.out.println("13 " + (bt55 == bt5));//true, pool and pool

    final short sh1 = 12;
    byte bt6 = sh1;//sh1 needs to be final
    byte bt7 = (byte)sh1;
    byte bt8 = 12;
    long x = 5;
    long y = (x = 3);
    System.out.println("y = " + y + " x = " + x);
    // double d = 13.9;
    // String s  = d > 15? "yes":"no";

    int x1 = 3;
    int y1 = ++x1 * 5 / x1-- + --x1;
    System.out.println("x1is " + x1);
    System.out.println("y1 is " + y1);


    // System.out.println(b6);


  }
}
