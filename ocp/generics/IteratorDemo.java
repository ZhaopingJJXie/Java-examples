package ocp.generics;
import java.util.*;
public class IteratorDemo{

  public static <T extends Exception, J> void execute(List<J> jobs) {
    try {
        for (J job : jobs)

    } catch (T e) {   // compile-time error
      
    }
}
  public static void main(String[] args){
    LinkedList<String> list = new LinkedList<>();
    list.add("Grapes of Wrath");
    list.add("1984");

    list.forEach(System.out::println);

    Iterator it = list.iterator();
    while (it.hasNext())
      System.out.println(it.next());
  }

}
