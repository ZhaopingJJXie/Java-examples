package examples.array;

public class ArrayAccess{
  public static void main(String[] args){
  int[] a = {1, 2,3, 4};
  int[] b = {2, 3, 1, 0};
  int[] c = new int[9];
  // c = {1, 2, 3};//not a statement, compilation error
  System.out.println(c[0]);//by default, all elements are initialized to deault values
  c = new int[]{1,2,3}; //annoymos array, fine
  System.out.println(a[(a=b)[3]]);//1
  /*the original a is feteched and rememebered and then assign b to a and
  get the index 3 of a[3]=0, and then a[0] in the original array is 1*/
  l1:
  {
    System.out.println("yes"); break l1;
    // if(a[3] > 0){
    //   break loop;
    // }
  }

  if (a[3] > 2){
    // break; break outside of loop or switch.
  }
}

}
