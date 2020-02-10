package ocp.console;

import java.io.Console;
import java.util.*;

public class ConsoleSample{
  public static void main(String[] args){
    Console console = System.console();
    if(console != null){
      // String userInput = console.readLine();
      // console.writer().println("You entered the following: " + userInput);
      console.format("hello world");//hello world, no new line after it
      console.printf("how are you");//how are you
      console.writer().println();
      console.writer().format("hello world");//hello world
      console.writer().println();
      console.writer().format(new Locale("fr","CA"), "Hello world");//hello world
      console.writer().println();

      console.printf("great day");
      console.writer().println();
      console.writer().printf("another day");
      // console.format("Our zoo has 391 animals and employs 25 people.");
      console.writer().println();
      console.printf("The zoo spans 128.91 acres.").writer().println();
      console.printf(console.readLine());
    }
  }
}
