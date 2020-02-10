package examples.charType;

/* char type is 16-bit unsigned, range 0 - 65355, any literal out of range can
not be directed assigned to a char variable unless a convert is specified*/

public class CharType{
  static char ch1 = (char) -92;//legal, but radiculous
  static char ch2 = (char)70000; //legal, but out of char range

/*the following assignment are illegal
  char ch3 = -92;//illegal
  char ch4 = 7000; // illegal
  */

  public static void main(String args[]){
    System.out.println(ch1);
    System.out.println(ch2);
}
}
