package ocp.comparator;

import java.util.*;

class Book{
  String name;
  Book(String name){this.name = name;}
}
class ClassException{
  public static void main(String[] args) {
    List<Book> l1 = new ArrayList<>();
    l1.add(new Book("Java"));
    l1.add(new Book("C++"));

      List l2 = new ArrayList<>();
      l2.add(new Book("Java"));
      l2.add(new Book("C++"));
    // Collections.<Book>sort(l1);   //comparation error
      Collections.sort(l2);//ClassCastException



  }
}
