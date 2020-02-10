package ocp.stream;

import java.util.stream.*;
import java.util.*;

public class ReverseOrder{
  public static void main(String[] args) {
    Stream<String> s = Stream.of("over the river",
    "through the woods",
    "to grandmother's house we go");
s.filter(n -> n.startsWith("t"))
 // .sorted(Comparator::reverseOrder))//does not compile, reverseOrder() is not a comparator implementation
 .sorted(Comparator.reverseOrder()))
 .findFirst()
 .ifPresent(System.out::println);
  }
}
