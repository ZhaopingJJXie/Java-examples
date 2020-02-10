package ocp.iostream;

import java.io.*;

public class WriterAppend{
  public static void main(String[] args) throws IOException{
    Writer fw = new FileWriter("ocp/iostream/out.txt");
    Writer w1 = fw.append('c');
    w1.write('d');
    // w1.flush();      
    w1.close();

  }
}
