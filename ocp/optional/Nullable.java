package ocp.optional;

import java.util.*;

public class Nullable{
  public static void main(String[] args) {
    Optional<String> op = Optional.ofNullable(null);//an empty optional
    System.out.println(op.get());//NoSuchElementException for empty optional;
  }
}
