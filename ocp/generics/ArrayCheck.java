package ocp.generics;

import java.util.*;

class Animal{}
class Dog extends Animal{}
class Cat extends Animal{}

public class ArrayCheck{
  public static void foo(){
    Dog[] dogs = { new Dog(), new Dog()};
    addAnimal(dogs);
    Cat[] cats  = {new Cat(), new Cat()};
    addAnimal(cats);
  }
  public static void addAnimal(Animal[] animals){
    // animals[0] = new Dog();//ArrayStoreException for cats
  }
  public static void main(String[] args){
    foo();
    Object ob = new Object();
  }
}
