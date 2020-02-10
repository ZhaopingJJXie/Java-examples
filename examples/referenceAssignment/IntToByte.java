/**
int -> Integer -> Number (optional), String -> Object, autoboxing followed by optional widdening
int -> long, widdening
Integer -> int -> long, unboxing followed by optional widdeing
*/
package examples.referenceAssignment;

public class IntToByte{
  public static long returnByte(long b){
    return b;
  }
  public static void main(String args[]){
    int in1 = 3;
    Integer ii = 3;
    Number n = ii;
    final int i2 = 4;
    Byte b1= i2;
    System.out.println(returnByte(ii));
  }
}
