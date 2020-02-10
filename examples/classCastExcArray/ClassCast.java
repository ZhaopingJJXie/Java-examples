package examples.classCastExcArray;

import java.util.Arrays;
public class ClassCast{
  public static void main(String[] args){
    int[][] a = {{1, 2}, {3, 4}};
    int[] b1 = (int[]) a[1];
    Object o1 = a;
    int[][] a2 = (int[][])o1;
    // int[] b2 = (int[])o1; //ClassCastException raised
    int[] b3 = (int[]) a; //compile error
  }
}
