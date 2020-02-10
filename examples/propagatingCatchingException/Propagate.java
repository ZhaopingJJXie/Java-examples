package examples.propagateCatchingException;

// import java.lang.IOException;
import java.io.IOException;
public class Propagate{
  public static void main(String args[]) throws Exception{
    try{
      reverse(args[0]);
    // }catch(Exception e)
    // {
    //   System.out.println("exception caught in main");
    }finally{
      System.out.println("main finish");
    }
  }
  public static String reverse(String s) throws Exception{
    if(s.length() == 0 ){
      throw new IOException();
    }else{
    StringBuilder sb = new StringBuilder(s);
    sb.reverse();
    s = sb.toString();
    return s;
  }
  }
}
