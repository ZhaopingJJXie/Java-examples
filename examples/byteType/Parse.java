package examples.byteType;

public class Parse{
final protected int Thursday = 4;
  public static void main(String[] args){
    // Integer a = 13;

    int a = Integer.parseInt("123");//compiles, but NumberFormatException
    System.out.println(a);
  }
}
