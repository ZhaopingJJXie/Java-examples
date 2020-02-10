package ocp.generics;

class Gen<T>{
  T ob;
  Gen(T o){
    ob = o;
  }
  T getOb(){
    return ob;
  }
  void showType(){
    System.out.println("type of T is " + ob.getClass().getName() );
  }
}
class Gen2<T> extends Gen<T>{
  Gen2(T o ){
    super(o);
  }
}

public class GenDemo{
  public static void main(String[] args){
    Gen<Integer> iOb;

    iOb = new Gen<Integer>(88);
    iOb.showType();
    int v = iOb.getOb();
    System.out.println("value: " + v);
    Gen<String> strOb = new Gen<String>("Generics Type");
    strOb.showType();
    String str  = strOb.getOb();
    System.out.println("value: " + str);

    Gen raw = new Gen(Double.valueOf(98.6));
    double d  =(Double)raw.getOb();
    // int i = (Integer)raw.getOb();//run-time error;
    //this assignment overrides type safety
    strOb= raw;
    // str = strOb.getOb();//run-time error

    // raw = iOb;
    // d = (Double)raw.getOb();

    Gen2<Integer> iOb2 = new Gen2<Integer>(88);
    Gen2<String> strOb2 = new Gen2<String>("java");
    boolean b1 = (iOb2 instanceof Gen2<?>);
    System.out.println(b1);//true
    System.out.println((iOb2 instanceof Gen<?>));//true
    //
    System.out.println((strOb2 instanceof Gen2<?>));//true
    System.out.println((strOb2 instanceof Gen<?>));//true

    System.out.println((iOb instanceof Gen2<?>));//false
    System.out.println((iOb instanceof Gen<?>));//true
    // no genric informatino at run time, so instanceof would not know if iOb2 is
    // instance of Gen2<Integer> or not
    // System.out.println（iOb2 instanceOf Gen2<Integer>);compilation error






  }
}
