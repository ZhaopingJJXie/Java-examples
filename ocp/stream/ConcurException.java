package ocp.stream;

import java.util.*;
import java.util.stream.*;

public class ConcurException{
  public static void main(String[] args) {
    try {
    List<String> listOfStrings =
      new  ArrayList<>(Arrays.asList("one", "two"));
          // List<String> listOfStrings = Collections.synchronizedList(listOfStrings1);

    // This will fail as the peek operation will attempt to add the
    // string "three" to the source after the terminal operation has
    // commenced.

    String concatenatedString = listOfStrings
        .stream()

        // Don't do this! Interference occurs here.
        .peek(s -> listOfStrings.add("three"))

        .reduce((a, b) -> a + " " + b)
        .get();

    System.out.println("Concatenated string: " + concatenatedString);

} catch (Exception e) {
    System.out.println("Exception caught: " + e.toString());
}
  }
}
