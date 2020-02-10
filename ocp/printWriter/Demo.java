package ocp.printWriter;

import java.io.*;

public class Demo{
  public static void main(String[] args) throws IOException{
    PrintWriter pw = new PrintWriter(new FileWriter("ocp/printWriter/out.txt"));
    pw.println("this is the first line");
    pw.flush();
    pw.close();
  }
}
