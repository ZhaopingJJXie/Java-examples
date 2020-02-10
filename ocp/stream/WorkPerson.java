package ocp.stream;

import java.util.*;
import java.util.stream.*;

public class WorkPerson{
  public static void main(String[] args){
    Person beth = new Person("Beth", 30);
    Person eric = new Person("Eric",31);
    Person deb = new Person("Deb", 31);
    Person liz = new Person("Liz", 30);
    Person wendi = new Person("Wendi", 34);
    Person kathy = new Person("Kathy", 35);
    Person bert = new Person("Bert", 32);
    Person bill = new Person("Bill", 34);
    Person robert = new Person("Robert", 38);
    Person bill2 = new Person("Bill", 40);
    Person beth2 = new Person("Beth", 45);
    Person bert2 = new Person("Bert", 38);

    List<Person> people = new ArrayList<>();
    people.add(beth);
    people.add(eric);
    people.add(deb);
    people.add(liz);
    people.add(wendi);
    people.add(kathy);
    people.add(bert);
    people.add(bill);
    people.add(robert);
    people.add(bill2);
    people.add(beth2);
    people.add(bert2);
//no guarantee what list you are going to get
    List<Person> age34 = people.stream()
                        .filter(p -> p.getAge() == 34)
                        .collect(Collectors.toList());
    System.out.println("people whose age is 34: ");
    age34.forEach(System.out::println);
    System.out.println("******************************");
    //if you want to reduce to an ArrayList,
    // use collect(Collectors.toCollection(Supplier<C> collectionFactory))
    // eg. Collectors.toCollection(ArrayList::new)

    List<Person> nameStrB = people.stream()
                            .filter( p -> p.getName().startsWith("B"))
                             .collect(Collectors.toCollection(ArrayList::new));
    System.out.println("name starts with 'B': " + nameStrB);
    System.out.println("******************************");

    //group by age

    Map<Integer, List<Person>> byAge = people.stream()
                                      .collect(Collectors.groupingBy(Person::getAge));

  System.out.println("group by name: ");
  byAge.entrySet().forEach(System.out::println);
  System.out.println("******************************");
//group by age and then count the number

  Map<Integer, Long> countAge = people.stream()
                                .collect(Collectors.groupingBy(Person::getAge,
                                          Collectors.counting()));
System.out.println("group by age " + countAge);
System.out.println("******************************");

//group by age and return a value of List<String> rather than List<Person>
  Map<Integer, List<String>> ageName = people.stream()
                              .collect(Collectors.groupingBy(Person::getAge,
                              Collectors.mapping(
                              Person::getName,
                              Collectors.toList()
                              )
                                )
                                  );
      System.out.println("group by age and get name: "+ ageName );
      System.out.println("******************************");

// partitioning by age
Map<Boolean, List<Person>> olderThan34 = people.stream()
                                        .collect(Collectors.partitioningBy( p -> p.getAge() >34));

System.out.println("group by age more than 34: " + olderThan34);
System.out.println("******************************");

//partitioning by age then group by name
Map<Boolean, List<String>> nameMorethan34 = people.stream()
                                            .collect(Collectors.partitioningBy(
                                            p -> p.getAge()> 34,
                                            Collectors.mapping(
                                            Person::getName,
                                            Collectors.toCollection(ArrayList::new)
                                            )
                                              )
                                                );

System.out.println("group by age more than 34 by name: " + nameMorethan34);
System.out.println("******************************");

Map<Boolean, Long> countMorethan34 = people.stream()
                                            .collect(Collectors.partitioningBy(
                                            p -> p.getAge()> 34, Collectors.counting()));

System.out.println("group by age more than 34 and counting: " + countMorethan34);
System.out.println("******************************");

//count total age use Collectors.summingInt() method

Integer totalAge = people.stream()
                  .collect(Collectors.summingInt( p -> p.getAge()));
System.out.println("total age is: " + totalAge);
System.out.println("******************************");

//count agverage age using Collectors.averagingInt()

Double ariAve = people.stream()
                .collect(Collectors.averagingInt( p -> p.getAge()));
System.out.println("aveage age is: " + ariAve);
System.out.println("******************************");
//filter name  starts with B then group by name sum age
Map<String, Integer> sumOfName = people.stream()
                                .filter(p -> p.getName().startsWith("B"))
                                .collect(Collectors.groupingBy(Person::getName,
                                Collectors.summingInt(Person::getAge)));
System.out.println("group by name thrn sum age: " + sumOfName);
System.out.println("******************************");

// calculate average age

Map<String, Double> aveName = people.stream()
                                    .filter(p -> p.getName().startsWith("B"))
                                    .collect(Collectors.groupingBy(Person::getName,
                                                        Collectors.averagingInt(Person::getAge)));
System.out.println("average age is: " + aveName);
System.out.println("******************************");

Map<String, Long> countName = people.stream()
                                    .filter(p -> p.getName().startsWith("B"))
                                    .collect(Collectors.groupingBy(Person::getName,
                                    Collectors.counting()));

System.out.println("count name starts with 'B'" + countName);
System.out.println("******************************");
//joining(), joining(CharSequence, cq), joining(CharSequence cq, CharSequence prefix, CharSequence suffix)

String s1 = people.stream()
                  .filter( p -> p.getAge() > 34)
                  .map(Person::getName)
                  .collect(Collectors.joining(",", "@@@", "%%%"));
System.out.println("older than 34: " + s1);
System.out.println("******************************");

//maxBy(Comparetor<T>), minBy(Comparetor<T>)
Optional<Person> maxAge = people.stream()
                          .collect(Collectors.maxBy(
                          (p1, p2) -> p1.getAge() - p2.getAge()
                            )
                          );

maxAge.ifPresent(System.out::println);
System.out.println("******************************");

//use max(Comparetor<T>) is equivalent
Optional<Person> minAge = people.stream()
                          .min((p1, p2) -> p1.getAge()- p2.getAge());
minAge.ifPresent(System.out::println);
Comparator<Person> sortbyName = Comparator.comparing(Person::getName);
Comparator<Person> sortbyAge = Comparator.comparing(Person::getAge);
List<Person> lp = people.stream()
                  // .sorted((p1, p2) -> p1.getAge() - p2.getAge())//correct
                  .sorted(sortbyAge.thenComparing(sortbyName))//correct
                  .collect(Collectors.toCollection(ArrayList::new));
lp.forEach(System.out::println);
System.out.println("******************************");
people.forEach(System.out::println);
// people.stream().collect(Collectors.groupingBy(Person::getAge)).forEach(System.out::println);

// String sss= people.stream().collect(Collectors.joining());//compilation error
  }

}
