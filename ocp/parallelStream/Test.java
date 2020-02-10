package ocp.parallelStream;

import java.util.*;
public class Test{
  public static void main(String[] args) {
    List<String> vals = Arrays.asList("a", "b");
    String join = vals.stream().reduce("_", (a, b) -> a.concat(b));
    System.out.println(join);

  }
}
