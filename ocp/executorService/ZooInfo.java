package ocp.executorService;

import java.util.concurrent.*;

public class ZooInfo{
  public static void main(String[] args){
    ExecutorService service = null;
    try{
      service = Executors.newSingleThreadExecutor();
      System.out.println("beign");
      service.execute(()-> System.out.println("printing zoo inventory"));
      service.execute(() -> {for(int i = 0; i < 3; i++)
      System.out.println("printing record: " + i);});
      service.execute(() -> System.out.println("print zoo inventory"));
      System.out.println("end");
    }finally{
      if(service !=null) service.shutdown();
    }

  }
}
