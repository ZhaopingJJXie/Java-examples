package examples.wrapperClass;
/* keep in mind that wrapper classes are immutable*/
public class WrapperClass{
  public static void main(String[] args){
    Integer y = 567;
    Integer x = y;
    System.out.println(x==y);//true
    y++;
    //y refers to a new Integer object, while x strill refer to the old object
    System.out.println("x = " + x + " , y = " + y);

    Integer it1 = 1000;
    Integer it2 = 1000;
    System.out.println(it1 == it2);//false
    System.out.println(it1.equals(it2));//true;

/*Integer range between [-128 - 127] are compared as primitives*/
    Integer it3 = 34;
    Integer it4 = 34;
    System.out.println(it3 == it4);//true
    System.out.println(it3.equals(it4));//true
  }
}
