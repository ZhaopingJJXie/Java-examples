package ocp.generics;
import java.io.*;
// class MyGenClass<T, V>{//does not compile
// class MyGenClass<T, V super Number>{ does not complie
class MyGenClass<T, V extends Number> {//almost ok, this class compiles
  T obj1;
  V obj2;

  void set(T o ){
    obj1 = o;
  }
  void set(V o){
    obj2 = o;
  }
}
//subclass of Throwable can not have a generic type parameter
// class GenException<T> extends Exception{} does not compile
class GenException<T extends Exception>{}//this is fine
public class AmbiguityError{
  public static void main(String[] args){
  // MyGenClass<String, String> obj = new MyGenClass<>("Java", "ocp");compilation error
  MyGenClass<String, Integer> obj =new MyGenClass<>();//compiles
  // MyGenClass<Intger, Integer> obj =new MyGenClass<>();//compilation error
  GenException<Exception> ge1= new GenException<Exception>();
}
}
