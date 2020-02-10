package ocp.stream;

import java.util.*;
import java.util.stream.*;
import ocp.lambdaEx.Dog;
import java.util.concurrent.*;
public class GroupBy{
  public static void main(String[] args) {

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

      Map<Integer, Long> gdog = dogs.parallelStream()
                                  .collect(Collectors.groupingBy((Dog::getAge),
                                  Collectors.counting()));

    System.out.println("**********************************");
    gdog.forEach((k,v) -> System.out.println(k + " " + v));


  }
}
