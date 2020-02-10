package ocp.console;

import java.io.*;

public class NewConsole{
  public static void main(String[] args){
    String name = "";
    Console c = System.console();
    if(c != null){
      char[] pw = c.readPassword("%s", "pw: ");
      for (char ch : pw){
        c.format("%c", ch);
      }
      c.format("\n");
      MyUtility mu = new MyUtility();
      while(true){
        name = c.readLine("%s", "input?: ");
        c.format("output: %s \n", mu.dostuff(name));

      }
    }
  }
}

class MyUtility{
  String dostuff(String arg1){
    return "result is "+ arg1;
  }
}
