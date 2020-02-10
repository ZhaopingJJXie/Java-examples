package ocp.concurrent;

import java.util.concurrent.*;

public class CopyOnWriteDemo{
  public static void main(String[] args) {
    CopyOnWriteArrayList<Integer> c = new CopyOnWriteArrayList<>();
    c.add(1);
    c.add(2);
    c.add(3);
    c.add(4);

    for(Integer it : c){
      c.add(1);
      System.out.println(it);
    }

    for(Integer it: c){
      System.out.println(it);
    }
  }
}
