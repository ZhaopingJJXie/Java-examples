package examples.array;

import java.util.*;
/*first sort the array and then choose the index range. If two arrays contain the
same elements, the binarysearch method will retunrn the same result*/
public class BinarySearchDemo{
  public static void main(String[] args){
    char[] chArr = {'s', 'k', 'r', 'y', 'a', 'f', 'c'};
    System.out.println(chArr);
    Arrays.sort(chArr);//chArr has been changed!
    char[] ch2 = {'y', 'k', 's', 'c', 'r', 'a', 'f'};
    Arrays.sort(ch2);
    char[] ch3 = {'s', 'k', 'r', 'y', 'a', 'f', 'c'};
    int pos1 = Arrays.binarySearch(chArr, 3, 6, 'e');
    int pos2 = Arrays.binarySearch(ch2, 3, 6, 'e');
    System.out.println(pos1 + " " + pos2);
    System.out.println(chArr.equals(ch3));//false, not the same array
    System.out.println(Arrays.equals(chArr, ch3));
    System.out.println(chArr);
  int[] iarr1= {1};
  int[] iarr2 = {1};
  System.out.println(iarr1.equals(iarr2));//false，
  System.out.println(Arrays.equals(iarr1, iarr2));
  System.out.println(iarr1);
  

  }
}
