package ocp.concurrent;
/**
lambda expression that throws checked exception should be declared-or-caugjht
*/
import java.util.concurrent.*;
import java.util.stream.*;
public class Line {
   static BlockingDeque<Integer> queue = new LinkedBlockingDeque<>();
   public static void main(String[] participants) throws Exception {
      IntStream.iterate(1, i -> i+1).limit(5)
         .parallel()
         .forEach(s -> {try{queue.offerLast(s,10000,TimeUnit.MILLISECONDS);}catch(Exception e){}});
      IntStream.iterate(1, i -> 5).limit(10)
         .parallel()
         .forEach(s -> {try{queue.pollFirst(10,TimeUnit.SECONDS);}catch(Exception e){}});
      System.out.print(queue.size());
   }
}
