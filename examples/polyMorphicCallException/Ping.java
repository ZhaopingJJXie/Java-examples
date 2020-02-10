package examples.polyMorphicCallException;

public class Ping extends Utils{
  public static void main(String[] args) throws Exception {
    Utils u = new Ping();
    //this make a polymorphic call so the compiler knows it
    // might throw an exception. So either main declares to throw an exception
    // or wrap the call in the try catch block
  try{
    System.out.println(u.getInt(args[0]));
  }catch(Exception e){
    System.out.println("catch the exception");
    }
  }
  int getInt(String s){
    return Integer.parseInt(s);
  }
}

class Utils{
  int getInt(String s) throws Exception{
    return 7;
  }
}
