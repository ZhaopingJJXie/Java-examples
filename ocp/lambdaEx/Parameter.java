package ocp.lambdaEx;
import java.util.function.*;
interface Iex {
  void get(double m);
}
public class Parameter{
  public static void printIt(DoubleToLongFunction dtl){

    double m = 30;
    // dtl.applyAsLong(s);
    dtl.applyAsLong(m);
  }
  public static void main(String[] args) {
    //incompatible paremeter type
    // BiFunction<Integer,Double,Integer> bf = (int n, double e) -> (int)(n + e);
    // DoubleToLongFunction dtl = (Double s) -> s.longValue();
    // System.out.println(dtl.applyAsLong(12));
    Iex iex = (double i ) -> System.out.println(i);//no problem
    // Iex iex = (Double i ) -> System.out.println(i);//incompatible parameter type
    // Iex iex = (int i ) -> System.out.println(i);//no problem
    DoubleToLongFunction dtl = (double m) -> {long p = (long)m;  return p; };
    System.out.println(dtl.applyAsLong(30));
    iex.get(10);
  }
}
