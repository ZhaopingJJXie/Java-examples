package ocp.arrayList;

import java.util.*;

public class Test{
  public static void main(String[] args) {
    List<String> list = new ArrayList<>();
    list.add("A");
    list.addAll(new ArrayList<>());
    System.out.println(list);
  }
}
