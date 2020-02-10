package examples.lambdaEx;
import java.util.function.*;

interface Runner{
  public void run();
}
/*since there is only one interface with one method, it is ok even if
the body of the lambda expression returns a value as illustrated by the following code.
The return type of the lambda expression is important if there are multiple interfaces*/
interface Runner2{
  public int run();
}
public class TestClass1{
  public static void main(String[] args){
    run(() -> voidMethod());//will invoke run(Runner ) method
    run(() -> intMethod());//will not invoke run(Runner ) method
  }
  public static void run(Runner x){
    x.run();
  }
  public static void voidMethod(){
    System.out.println("voidMethod");
  }
  public static int intMethod(){
    System.out.println("intMethod");
    return 0;
  }
}
