package examples.StringAssignment;

public class StringAss {
  public static void main(String[] args){
    String x = new String("Java");
    String y = x;
    System.out.println("y string = " + y);
    x = x + " Bean";
/* x now refre to another String object, but y still refers to the old string*/
    System.out.println("y string = " + y);//x get changed but not y
/* StringBuilder object is mutable so the same change will reflect
 on both reference variables*/
    StringBuilder sb = new StringBuilder("love");
    StringBuilder sb1 = sb;
    System.out.println("before change " + sb1);
    sb.reverse();
    System.out.println("after change " + sb1);
    String subsb = sb.substring(0,2);
    System.out.println(subsb);
    System.out.println(sb);
/*if no modification is needed, the original string object is returned.*/
    String str2 = "java";
    String str3 = str2.toLowerCase();
    System.out.println(str2 == str3);//true

    String str4 = new String("java");
    String str5 = str4.toLowerCase();
    System.out.println(str4==str5);//true;

    String str6 = "change me";
    String str7  = "you are not going to " + "change me";
    String str8 = "you are not going to change me";
    String str9 = "you are not going to " + str6;
    System.out.println(str8 == str7);//true; compile time
    System.out.println(str8 == str9);//false; string computated at runtime is newly
    // created so it is distinct
    String str10 = str6.replace("d", "e");
    String str11 = str6.replace('d', 'e');
    System.out.println(str6 == str10);//true
    System.out.println(str6 == str11);//true

    String str12 = "hello world";
    String str13 = "    hello world   ".trim();
    System.out.println(str12 == str13);//false, runtime determined, not pooled 

  }
}
