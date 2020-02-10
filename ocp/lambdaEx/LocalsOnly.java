package ocp.lambdaEx;

import java.util.function.*;
import java.util.*;
public class LocalsOnly{
  public Predicate<String> getPredicate(StringBuilder banner){
    List<String> words = new ArrayList<>();
    words.add("otto");
    // banner = new StringBuilder("Java");
    // words = new ArrayList<>();
      return str-> words .size()>10 && banner.toString().length() > 5   ;//banner must be final or effectively final
  }
  public static void main(String[] args) {
    StringBuilder banner = new StringBuilder("love");
    LocalsOnly instance = new LocalsOnly();
    Predicate<String> p = instance.getPredicate(banner);
  }
}
