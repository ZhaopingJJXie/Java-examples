package ocp.console;

import java.io.*;

public class ConsoleReadInputSample{
  public static void main(String[] args) throws NumberFormatException, IOException{
    Console console = System.console();
    if(console == null){
      throw new RuntimeException("console not available");
    }else{
      console.writer().print("How excited are you about trip today?");
      console.flush();
      String excitmentAnswer = console.readLine();
      String name = console.readLine("Please enter your name: ");
      Integer age = null;
      console.writer().print("what is your age?");
      console.flush();
      BufferedReader reader = new BufferedReader(console.reader());
      String value = reader.readLine();
      age = Integer.valueOf(value);
      console.writer().println();
      console.format("Your name is " + name);
      console.writer().println();
      console.format("Your age is " + age);
      console.printf("Your excitment level is: " + excitmentAnswer);
    }
  }
}
