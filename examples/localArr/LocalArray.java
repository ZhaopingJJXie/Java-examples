package examples.localArr;
import java.util.*;

public class LocalArray{
  public static void main(String args[]){
    int arr[] = new int[3];//arr elements get default value
    int arr1[];
    /** arr1 is not instantiated, arr1 if not null
    if (arr1 == null){
    }
    */
    for (int a : arr){
      System.out.print(a + " ");
    }

    ArrayList<StringBuilder> myList1  = new ArrayList<>();
    myList1.add(new StringBuilder("java"));
    ArrayList<StringBuilder> myList2 = new ArrayList<>(myList1);
    myList1.add(new StringBuilder("oca"));
    myList1.get(0).append(" 8 ");
    System.out.println(myList1);
    System.out.println(myList2);
  }
}
