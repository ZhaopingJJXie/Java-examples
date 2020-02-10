package examples.lambdaEx;
interface I1{
  boolean m1(String str1, String str2);
}
public class Parameter{
  int i = 0 ;
  public static boolean test(I1 i1, String a, String b){
    return i1.m1(a, b);
  }
  public static void main(String[] args){
    // String a = "str";
    boolean b1 = test((String a, String b) -> a == b, "java", "Java" );
  // boolean b1= I1.m1("Java", "java");
  System.out.println(b1);
  // int i = 0 ;
  for (int i =3; i >0; i--){

  }
}
}
