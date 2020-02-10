package examples.cast;
/**
casting rulls:
A:in the same tree:
  1; upcasting can be implicitly casted, for instance Subaru to Car
  2; downcasting:
      a, with explicit casting if the object is actually the subclass, no problem,
          otherwise, NullPointerException thrown
      b, without explicit casting, compilation erroe
B: not in the same tree: no matter explicit casted or nor, compilation error
*/
class Car{}
class Subaru extends Car{}

public class MyCars{
  public static void main(String[] args){
  Car car = new Car();
  Car supCar = new Subaru();
  Subaru subru = new Subaru();
  Subaru sub1, sub2;
  // sub1 = (Subaru)car;//ClassCastException;
  // sub2 = car;//compilation error;
  // sub2 = supCar;//compilation error, needs explicit casting
  // String str = (String)car;//compilation error;no the same tree
}
