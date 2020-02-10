package ocp.generics;
import java.util.*;

    class Wash<T> {
   T item;
   public void clean(T item) {
      System.out.println("Clean " + item);
   }
 }

public class RawTypeCompile {
   public static void main(String[] args) {
     Wash wash = new Wash();//this is fine
     Wash wash1 = new Wash<String>(); //also,no compilation warning
     Wash <String>  wash2= new Wash<>();//the best way to instantiate
     wash2 = wash;//compile with warining
      wash2.clean("socks");
      List l1= new ArrayList<String>();
      List<Integer> l2 = new ArrayList<Integer>();  
      l2= l1;
      l1 = l2;
   }
}
