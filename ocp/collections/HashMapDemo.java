package ocp.collections;

import java.util.*;

public class HashMapDemo{
  public static void main(String[] args) {
    Map<Integer, String> m = new HashMap<>();
    m.put(1, "java");
    m.put(2, "OCP");
    m.put(3, "OCA");

    for(Integer s: m.keySet()){
      // m.put(s + 3, "program");//concurrentModificationException
      // m.remove(s);//concurrentModificationException  
    }

    System.out.println(m);

  }
}
