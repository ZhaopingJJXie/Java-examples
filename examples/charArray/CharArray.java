package examples.charArray;

import java.util.Arrays;
public class CharArray{
  public static void main(String[] args){
    char[] charArr = {0x4e, '\u004e', 78};
    char ch = 0x34;
    byte b = 0x35;
    byte b1 = 0b01111111;
    // byte b3 = 234;
    System.out.println((charArr[0] == charArr[1]) + " " + (charArr[0] == charArr[2]));
  }
}
