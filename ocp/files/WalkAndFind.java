package ocp.files;

import java.nio.file.*;
import java.io.*;
import java.util.stream.*;

public class WalkAndFind{

  public static void main(String[] args) throws IOException{
    Path p = Paths.get("/Users/jojo/Java_examples/ocp/serialization");
    Files.walk(p)
    .map( z -> z.toAbsolutePath().toString())
    .filter(s -> s.endsWith(".java"))
    .collect(Collectors.toList())
    .forEach(System.out::println);

    System.out.println("*****************************");

    Files.find(p, Integer.MAX_VALUE,
              (w, a ) -> w.toAbsolutePath().toString().endsWith(".java"))
              .collect(Collectors.toList())
              .forEach(System.out::println);
  }
}
