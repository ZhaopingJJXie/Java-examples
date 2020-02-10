package ocp.immutableClass;
import java.util.*;

public class CallAnimal{
  public static void main(String[] args){
    ArrayList<String> favouriteFoods = new ArrayList<>();
    favouriteFoods.add("apples");
    favouriteFoods.add("bananas");
    favouriteFoods.add("pears");
    favouriteFoods.add("plams");
    favouriteFoods.add("peaches");
    String species = "monkey";
    int age = 10;
    //if this.favouriteFoods =favouriteFoods is in the constructor, print 5 banans and 6 nuts
    //if this.favouriteFoods = new ArrayList<String>(favouriteFoods), print
    Animal a = new Animal (species, age, favouriteFoods);
    System.out.println("before modification, size is " + a.getFavouriteFoodCount() );
    System.out.println("before modification, index 1 is " + a.getFavouriteFood(1));
    favouriteFoods.add("cabbage");
    favouriteFoods.set(1, "nuts");
    System.out.println("after adding, size is " + a.getFavouriteFoodCount());
    System.out.println("after adding, index 1 is " + a.getFavouriteFood(1));
    //String is immutable, so the the copy array is not changed
    ArrayList<String> strList = new ArrayList<>();
    strList.add("a");
    strList.add("b");
    strList.add("c");
    ArrayList<String> strListCopy = new ArrayList<>(strList);
    strList.set(1, "d");//only modifies strList.get(1), not the copy
    System.out.println(strListCopy.get(1));//b

//StringBuilder is mutable, so changes to the exisiting elements will be reflected on the copied arraylist
    ArrayList<StringBuilder> sbList = new ArrayList<>();
    sbList.add(new StringBuilder("a"));
    sbList.add(new StringBuilder("b"));
    ArrayList<StringBuilder> sbListCopy = new ArrayList<>(sbList);
    sbList.get(0).append("c");
    System.out.println(sbListCopy.get(0));//ac
    sbListCopy.get(0).append("d");
    System.out.println(sbList.get(0));//acd






  }
}
