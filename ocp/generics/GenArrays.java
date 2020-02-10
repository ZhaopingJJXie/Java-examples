package ocp.generics;

class Gen<T  extends Number>{
  T ob;
  T vars[];
  Gen(T t, T[] nums){
    vars = nums;
  }
  // static T obt;no static variables;
  //non-static type variable T cannot be referenced from a static context
  // static T get(){}
  static <T> T getOb(){}
}

public class GenArrays{
  public static void main(String[] args){
    Integer[] n = { 1, 2, 3, 4, 5};
    Gen<Integer> iob = new Gen<Integer>(50, n);
    Gen<?> gens[] = new Gen<?>[10];
    // Gen<Integer> gens[] = new Gen<Integer>[10];compilation error
  }
}
