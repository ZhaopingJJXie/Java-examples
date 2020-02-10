package ocp.stream;

import java.util.stream.*;
import java.util.*;

class Sequential{
  public static void main(String[] args) {

Stream<Integer> strm1 = Stream.of(2, 3, 5, 7, 11, 13, 17, 19); //1
strm1.filter(i->{ return i>5 && i<15; })
                            .forEach(System.out::print);  //2
System.out.println();
 Stream.of(2, 3, 5, 7, 11, 13, 17, 19)
 .parallel().filter(i -> i> 5).filter(i -> i<15).sequential()
.forEach(System.out::print);
System.out.println();
//the following compiles but no returns an empty stream
  IntStream is = IntStream.range(10, 7);
  is.forEach(System.out::println);

// strm2.; //3   Which of the following options can be used to replace line at //2 and still print the same elements of the stream?
  }
}
