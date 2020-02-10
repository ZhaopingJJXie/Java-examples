package ocp.suppressedException;

public class PrimaryNotCaught implements AutoCloseable{
  public void close() throws IllegalStateException{

    throw new IllegalStateException("Cage door does not close");
  }
  public static void main(String[] args){
    try(PrimaryNotCaught t = new PrimaryNotCaught()){
      System.out.println("put turkeys in");
      throw new RuntimeException("turkeys ran off");
    }catch(IllegalStateException e){
      System.out.println("caught: " + e.getMessage());
      for (Throwable t : e.getSuppressed())
        System.out.println(t.getMessage());

    }
  }
}

/**
put turkeys in
Exception in thread "main" java.lang.RuntimeException: turkeys ran off
	at ocp.suppressedException.PrimaryNotCaught.main(PrimaryNotCaught.java:10)
	Suppressed: java.lang.IllegalStateException: Cage door does not close
		at ocp.suppressedException.PrimaryNotCaught.close(PrimaryNotCaught.java:5)
		at ocp.suppressedException.PrimaryNotCaught.main(PrimaryNotCaught.java:11)
*/
