package ocp.suppressedException;

public class JammedTurkeyCage implements AutoCloseable{
  public void close() throws IllegalStateException{
    System.out.println("ready to close");
    throw new IllegalStateException("Cage door does not close");
  }

  public static void main(String[] args) throws Exception{
    try(JammedTurkeyCage t = new JammedTurkeyCage()){
      System.out.println("put turkeys in");
      throw new IllegalStateException("turkeys ran off");
    }catch(IllegalStateException e){//only catch primary exception
      // System.out.println("caught: " + e.getMessage());
      throw new RuntimeException();
      // for (Throwable t : e.getSuppressed())
      //   System.out.println(t.getMessage());
      }
        //put turkeys in
        // ready to close
        //caught: turkeys ran off
        // cage door does not close


    // try(JammedTurkeyCage t1 = new JammedTurkeyCage()){
    //   throw new RuntimeException("turkeys fly");
    // }catch(IllegalStateException e){//primary exception not caught
    //   System.out.println("caught" + e.getMessage());
    //   for (Throwable t : e.getSuppressed())
    //     System.out.println("get one suppressed" + t.getMessage());
    // }
    // Exception in thread "main" java.lang.RuntimeException: turkeys fly
    // 	Suppressed: java.lang.IllegalStateException: Cage door does not close
		// at ocp.suppressedException.JammedTurkeyCage.close(JammedTurkeyCage.java:6)
		// at ocp.suppressedException.JammedTurkeyCage.main(JammedTurkeyCage.java:25)
    // try(JammedTurkeyCage t1 = new JammedTurkeyCage()){
    //   // throw new RuntimeException("turkeys fly");
    // }catch(IllegalStateException e){// exception from the recource as primary exception
    //   System.out.println("caught " + e.getMessage());
    //   for (Throwable t : e.getSuppressed())
    //     System.out.println(t.getMessage());
    // }
    //ready to close
// caught Cage door does not close
  }

}
