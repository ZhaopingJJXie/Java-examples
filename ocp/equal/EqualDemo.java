package ocp.equal;
/**
== compares if the two reference refer to the same onject
equals(Object obj) compares equal meaning
*/
public class EqualDemo{
  public static void main(String[] args) {
    String s1 = new String("Java");
    String s2 = new String("Java");
    String s3 = "Java";
    System.out.println(s1==s2);//false
    System.out.println(s1==s3);//false

    System.out.println(s1.equals(s2));//ture
    System.out.println(s1.equals(s3));//ture


  }
}
