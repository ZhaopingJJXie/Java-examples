package examples.stringConcat;

public class StringAdd{
  public static void main(String[] args){
    String x = "java";
    x = x + false;
     x += 1;
    System.out.println(x);
    String str = "JavajJojo";
    System.out.println(str.lastIndexOf("J", 7));
    
    /*if no occurrence found, the original string is returned*/
    String str1 = str.replace('c', 'd');
    System.out.println(str1== str);
    //enhanced for loop only works for arrays or iterable obj
    // for (char c: x){
    //   System.out.println(c);
    // }
  }
}
