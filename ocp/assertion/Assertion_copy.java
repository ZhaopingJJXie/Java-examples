package ocp.assertion;

public class Assertion_copy{
  public static void main(String[] args){
    int numGuests = -5;
    assert numGuests > 0;
    System.out.println(numGuests);
    // assert numGuests >0 : return true//not a statement
    assert numGuests >0: new String("java");//fine
    // assert numGuests >0: throw new RuntimeException();  //no throw exception

    assert numGuests >0: numGuests = 9;
    assert numGuests >0: numGuests++;
    assert numGuests >0: (1< numGuests ? "Error" : 10);//fine
  }
}
