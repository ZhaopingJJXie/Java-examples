package ocp.intStream;

import java.util.stream.*;
import java.util.*;

public class Test{
  public static void main(String[] args) {
    IntStream  ins = IntStream.range(1,3);  
    ins.peek(a -> System.out.println(a))
                              .forEach(System.out::println);
  }
}
