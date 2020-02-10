package ocp.methodReference;

import java.util.*;
import java.util.function.*;
public class ListDemo{
  public static void main(String[] args) {
    List<String> list = new ArrayList<>();
  list.add("Atlanta");
  list.add("Chicago");
  list.add("New York");
  String str = "java";
  BiPredicate<String, String> p1 = String::startsWith;
  System.out.println(p1.test("Java", "Ja"));
  Predicate<String> p2 = String::isEmpty;
  Predicate<String> p3 = str::endsWith;

//method refernece
  // list.stream().filter(!(String::isEmpty)).forEach(System.out::println);
  }
}
