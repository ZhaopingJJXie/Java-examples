package examples.array;

// import java.util.Arrays;
import java.util.ArrayList;
class Car{}
class Subaru extends Car{};
public class ArrayDemo{
  int[] a = new int[]{1,2,3};
  int b[] = new int[6];
  // int[] c = new int[2]{0, 1}//doesn't compile
  int[] d = new int[]{2, 3};
  public static void foo(int ...args){
    for (int ii : args){
      System.out.println(ii);
    }
  }
  public static void main(String[] args){
    // foo({1,2});
    // foo(2,3);
    int[] b1 = {1,2};
    int[] b2 = {3};
    b2 = b1;//no problem
    // b1 = b2;//no problem
    System.out.println(b2[1]);//2
    foo(new int[]{4, 5});
    String[] strArr = {"java", "oca"};
    Object[] objArr;
    objArr = strArr;
    Subaru[] subArr = {new Subaru(), new Subaru()};
    Car[] carArr;
    carArr = subArr;
    ArrayList<Subaru> subList1 = new ArrayList<>();
    ArrayList<Subaru> subList2 = new ArrayList<>();
    ArrayList<Car> carList = new ArrayList<>();
    // carList = subList;
    // ArrayList<Subaru> cannot be assgined to ArrayList<Car> reference variable
    //arrayList equals compare elements equals() by order
    subList1.add(new Subaru());
    subList2.add(new Subaru());
    System.out.println(subList1.equals(subList2));//not equal

    ArrayList<String> strList1 = new ArrayList<>();
    ArrayList<String> strList2 = new ArrayList<>();
    ArrayList<String> strList3 = new ArrayList<>();

    strList1.add("java");
    strList2.add("java");
    strList3.add(new String("java"));
    System.out.println(strList1.equals(strList2));//true
    System.out.println(strList1.equals(strList3));//true

    ArrayList<StringBuilder> sbList1 = new ArrayList<>();
    ArrayList<StringBuilder> sbList2 = new ArrayList<>();
    ArrayList<StringBuilder> sbList3 = new ArrayList<>();

    sbList1.add(new StringBuilder("java"));
    sbList2.add(new StringBuilder("java"));
    sbList3.add(new StringBuilder("java"));
    System.out.println(sbList1.equals(sbList2));//false
    System.out.println(sbList1.equals(sbList3));//false
    
  }

}
