package ocp.lambdaEx;

import java.util.*;
import java.util.function.*;


public class TestDogPredicates{
  public static void main(String[] args){
    List<Dog> dogs = new ArrayList<>();

    Dog boi = new Dog("boi", 30 , 6);
    Dog clover = new Dog("clover", 35, 12);
    Dog aiko = new Dog("aiko", 50, 10);
    Dog zooey = new Dog("zooey", 45, 8);
    Dog charis = new Dog("charis", 120, 7);
    dogs.add(boi);
    dogs.add(clover);
    dogs.add(aiko);
    dogs.add(zooey);
    dogs.add(charis);

    Predicate<Dog> name = d -> d.getName().equals("boi"); //a prediacte
    Predicate<Dog> age = d ->{ d =new Dog("aiko", 50, 10);return d.getAge() == 6;};//another predicate
    // Predicate<Dog> nameAndAge = d -> name.and(age).test(d);
    Predicate<Dog> nameAndAge = name.and(age);

    System.out.println("Is boi named 'boi' and age 6? " + nameAndAge.test(boi));
    boi.setAge(7);
    System.out.println("Is boi named 'boi' and age 6? " + nameAndAge.test(boi));

    Predicate<Dog> p = Predicate.isEqual(zooey);
    System.out.println("Is aiko the same object as zooey? " + p.test(aiko));
    System.out.println("Is zooey the same object as zooey? " + p.test(zooey));


  }
}
