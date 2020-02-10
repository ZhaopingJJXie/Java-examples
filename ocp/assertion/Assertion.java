package ocp.assertion;

public class Assertion{
  // public void assert(int k){
  //   System.out.println("k is " + k);
  // }
  public int m1(int a){ 
    assert a >0: return 1;//illegal start of expression
    return 2;
  }
  public static void main(String[] args){
    Assertion a = new Assertion();
  //  a.assert(Integer.parseInt(args[0]));
    int numGuests = -5;
    assert numGuests > 0;
    System.out.println(numGuests);
    // /assert numGuests >0 : return true//not a statements
    assert numGuests >0: new String("java");//fine

    assert numGuests >0: (1< numGuests ? "Error" : 10);//fine
  }
}
