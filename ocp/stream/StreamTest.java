package ocp.stream;

import ocp.lambdaEx.Dog;
import java.util.stream.*;
import java.util.*;

public class StreamTest{
  public static int add(int a, int b){
    System.out.println("a is: "+a);
    return a + b;
  }
  public static void main(String[] args){
    int c = add(1, 2);

    List<Dog> dogs = new ArrayList<>();
    Dog boi = new Dog("boi", 30 , 6);
    Dog clover = new Dog("clover", 35, 12);
    Dog aiko = new Dog("aiko", 50, 10);
    Dog zooey = new Dog("zooey", 45, 8);
    Dog charis = new Dog("charis", 120, 8);
    dogs.add(boi);
    dogs.add(clover);
    dogs.add(aiko);
    dogs.add(zooey);
    dogs.add(charis);

  Optional<Dog> opd = dogs.stream()
                  // .filter(r -> r.getWeight() > 45)
                  .peek(System.out::println)
                  .findAny();
                  System.out.println("**********************************");

    System.out.println("????????????????????????????????????");

  Stream<Dog> sd= dogs.stream().peek(System.out::println);
  System.out.println("**********************************");

  long opdNum = dogs.stream()
                .peek(System.out::println)
                .count();
    System.out.println("num of dogs is: " + opdNum);
    opd.ifPresent(System.out::println);
    System.out.println("**********************************");

  boolean b1 = dogs.stream()
                .sorted((d1, d2) -> d1.getAge() - d2.getAge())
                .sorted((d1, d2) -> d1.getName().compareTo(d2.getName()))
                .peek(System.out::println)
                .allMatch( r -> r.getAge() > 5);
                System.out.println("**********************************");

    // System.out.println("are there any dog weights more than 50 and starts with 'c'?"  +b1);
    Comparator<Dog> byAge = Comparator.comparing(Dog::getAge);
    Comparator<Dog> byWeight = Comparator.comparing(Dog::getWeight);
    Comparator<Dog> byName = Comparator.comparing(Dog::getName);
    Comparator<Dog> AgeAndName = byAge.thenComparing(byName);
    Comparator<Dog> reverseWeight = byWeight.reversed();
//     System.out.println("**********************************");
     dogs.stream().sorted(byAge).forEach(System.out::println);
    System.out.println("if the original dog list sorted as well, no ");
     System.out.println("**********************************");
     dogs.forEach(System.out::println);

     List<Dog> ldog = dogs.stream()
                      .filter( d ->  d.getWeight() >=50 )
                      .collect(Collectors.toList());
     System.out.println("**********************************");
    ldog.forEach(System.out::println);
    
    }
              }
