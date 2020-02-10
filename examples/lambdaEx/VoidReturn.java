package examples.lambdaEx;

interface I1{
  public void m1();
}
interface I2{
  public int m3(int a);
}

public class VoidReturn{
  public static void m2(I1 i1){
    i1.m1();
    System.out.println("yes");
  }
  public static int m4(int a, I2 i2){
    return i2.m3(a);
  }
  public static void main(String[] args){
    // String[] args = {"java"};//args are already defined in the parameter list
    // m2(() -> {return System.out.println("in interface");});//"return" is not allowed here
    // m2(() -> {System.out.println("in interface");});
    m2(() -> {return ;});
    m2(() -> {});//valid, return nothing
    //lambda can access local variables providing that they are final or effectively final
    System.out.println(m4(4, a -> {a = 5; return args.length;}));//fine

    // args = new String[] { "java"};
    // System.out.println(m4(4, a -> {a = 5; return args.length;}));//args here is not effectively final now




  }
}
