package ocp.generics;
import java.util.*;
// import java.lang.Exception;

/* unobounded and UpperBound genrics make the list immutable*/
interface Flyer{void fly();}
class HangGlider implements Flyer{public void fly(){}}
class Goose implements Flyer{public void fly(){}}

public class UpperBound{
  static class Sparrow extends Bird{}
  static class Bird{}

  private void anyFlyer(List<Flyer> flyer) {}//List<Fly>
  private void groupOfFlyers(List<? extends Flyer> flyer) {}//only List<Goose> and List<Fly>

  public static void main(String[] args){
      List<? extends Bird> birds = new ArrayList<Bird>();
      /*The problem stems from the fact that Java doesn’t know
      what type List<? extends Bird> really is. */
      birds.add(new Sparrow());//does not compile
      // birds.add(new Bird());//does not compile.

    }
}
