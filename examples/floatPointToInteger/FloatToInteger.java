package examples.floatPointToInteger;

public class FloatToInteger{
  public static void main(String args[]){
    float f1 = 456.45f;
    double d1 = 563.897;
    int i1 = (int)d1;
    byte b1 = (byte)f1;
    float f2 = 234.56f;
    short s = (short)f2;

    System.out.println(i1 + " " +b1);
    System.out.println(s);


  }
}
