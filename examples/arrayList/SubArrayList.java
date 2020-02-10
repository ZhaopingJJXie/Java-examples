package examples.arrayList;

import java.util.*;

public class SubArrayList{
  public static void main(String[] args) {
    List<Integer> al = Arrays.asList(1,2, 3, 4, 5, 6, 7);
    // al.add(8);//UnsupportedOperationException
  List<Integer> al2 = new ArrayList<>(al);
  List<Integer> al3 = al2.subList(2, 6);
  System.out.println(al);
  System.out.println(al2);
  System.out.println(al3);

  al3.add(9);


  System.out.println(al);
  System.out.println(al2);
  System.out.println(al3);



  }
}
