package ocp.concurrent;

import java.util.*;
public class Concat {
   public String concat1(List<String> values) {
      return values.parallelStream()
            .reduce("a",
                  (x,y)->x+y,
                  String::concat);
   }
   public String concat2(List<String> values) {
      return values.parallelStream()
            .reduce((w,z)->z+w).get();
   }
   public static void main(String... questions) {
      Concat c = new Concat();
      List<String> list = Arrays.asList("Cat","Hat");
      String x = c.concat1(list);
      String y = c.concat2(list);
      System.out.println(x+" "+y);
   }
}
