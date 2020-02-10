package ocp.concurrent;

import java.util.concurrent.*;
import java.util.*;
import java.time.*;
import java.util.stream.*;

public class ParallelStream {
  public static void main(String[] agrs){
    LongStream ins = LongStream.of(1, 2, 3, 4, 5, 6, 7, 8, 9,10, 11, 12,
    13, 14, 15, 16, 17, 18, 19, 20);
    long result1, result2;
    long start1, end1, start2, end2, duration1, duration2;
    start1 = Instant.now().toEpochMilli();
    result1 = ins.unordered()
                  .peek(System.out::print)
                  .parallel()
                .reduce(1, (i1, i2) -> i1 * i2);
    end1 = Instant.now().toEpochMilli();
    duration1 = end1 - start1;
    System.out.println("result from parallel is: " + result1);
    System.out.println("time costs in parallel is: "  + duration1);

    // IntStream ins2 = IntStream.range(1, 21);
    LongStream ins2 = LongStream.of(1, 2, 3, 4, 5, 6, 7, 8, 9,10, 11, 12,
    13, 14, 15, 16, 17, 18, 19, 20);
    start2 = Instant.now().toEpochMilli();

    result2 = ins2.reduce(1, (i1, i2) -> i1 * i2);
    end2 = Instant.now().toEpochMilli();
    System.out.println("star at: " + start2);
    System.out.println("end at: " + end2);
    duration2 = end2 - start2;
    System.out.println("result from sequential is: " + result2);
    System.out.println("time costs in sequential is: "  + duration2);

    

  }
}
