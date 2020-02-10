package ocp.stackOverflowError;

public class ErrorDemo{
  public void go(){
    doStuff();
  }
  public void doStuff(){
    go();
  }

  public static void main(String[] args){
    // new ErrorDemo().go();//stackOverflowError 
  }
}
