package examples.byteType;

public class TestConstructor{
  public static void main(String[] args){
  // Byte b1 = new Byte(12);//compilation error, should be (byet)12
  int a = 0_123;
  float b = 0_123.0f;
  Integer c;
  System.out.println(a);//83
  System.out.println(b);//123.0
  System.out.println((c = 12));//12


}
void m1(){
  // return System.out.println("yes");//incompatible type
  System.out.println("yes");
}
}
