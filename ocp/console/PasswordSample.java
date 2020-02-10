package ocp.console;
import java.io.*;
import java.util.*;

public class PasswordSample{
  public static void main(String[] agrs) throws NumberFormatException, IOException{
    Console console = System.console();
    if(console == null){
      throw new RuntimeException("Console not available");
    }else{
      char[] password = console.readPassword("Enter your password: ");
      console.format("Enter your password again: ");
      console.flush();
      char[] verfy = console.readPassword();
      boolean match = Arrays.equals(password, verfy);
      //immediately clear password from memory
      for (int i = 0; i < password.length; i++){
        password[i] = 'x';
      }
      for (int j = 0; j < verfy.length; j++){
        verfy[j] = 'x';
      }
      console.format("Your password was  "  + (match? "correct": "incorrect"));
    }
  }
}
