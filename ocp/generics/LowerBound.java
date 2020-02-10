package ocp.generics;

import java.io.*;
import java.util.*;

public class LowerBound{
  public static void main(String[] args){
    List<? super IOException> exceptions = new ArrayList<Exception>();
    // we could have a List<IOException> and Exception obj would not fit in there
    // exceptions.add(new Exception());
    exceptions.add(new IOException());
    exceptions.add(new FileNotFoundException());//FileNotFoundException is also an IOException

    //List<Integer> can not be converted in List<Number>
    //List<Number> ln = new ArrayList<Integer>();
// but the following works
    List<Number> ln = new ArrayList<Number>();
    Number n = new Integer(3);//an integer can be casted into a Number
    ln.add(n);



  }
}
