package ocp.thread;

public class TestSleep{

  public static void main(String[] args){
    Runnable r = () -> {
      for (int i = 1; i <= 100; i++){
        try{
          Thread.sleep(1 * 1000);//sleep for 1 second for every count
        }catch(InterruptedException e){
          e.printStackTrace();
        }

        if(i % 10 == 0){
          System.out.println("count 10 numbers");
        }
      }
    };
    Thread t = new Thread(r);
    t.start();
  }
}
