package ocp.generics;

import java.util.*;

public class TestBadLegacy{
  public static void main(String[] args){
    List<Integer> myList = new ArrayList<>();
    myList.add(4);
    myList.add(6);
    Inserter in = new Inserter();
    in.insert(myList);
    Integer i2 = myList.get(2);//compiles, but ClassCastException thrown

  }
}

class Inserter{
  public void insert(List list){
    list.add(new String("43"));
  }
}
