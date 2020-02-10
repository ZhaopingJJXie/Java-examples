package ocp.stream;

import java.util.stream.*;
import java.util.*;
public class ComparatorInSorted{
  public static void main(String[] args) {
    Stream<String> s = Stream.of("over the river",
                                  "through the woods",
                                  "to grandmather's house we go");

    s.filter(n -> n.startsWith("t"))
    .peek(System.out::println)
      // .sorted(Comparator::reversedOrder)//invalid comparator =
      // .findFirst()
      // .ifPresent(System.out::println);
      .forEach(System.out::println);
  }
}
