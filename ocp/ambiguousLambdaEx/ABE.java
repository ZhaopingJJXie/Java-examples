package ocp.ambiguousLambdaEx;

import java.io.*;
import java.util.function.*;//Supplier
import java.util.concurrent.*;//callable
public class ABE{
  public static void useCallabel(Callable<Integer> expression){}
  public static void useSupplier(Supplier<Integer> expression){}
  public static void use(Callable<Integer> ex){}
  public static void use(Supplier<Integer> ex){}

  public static void main(String[] args){
    useCallabel(() ->{throw new IOException();});//compiles
    // useSupplier(() -> {throw new IOException();});//compilation error
    // use(()-> {throw new IOException();});//reference to use is ambiguous
    use((Callable<Integer>)()-> {throw new IOException();});//compiles
  }

}
