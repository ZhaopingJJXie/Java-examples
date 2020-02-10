package ocp.fileCopy;
import java.io.*;
/**
InputStream and OutputStream can process both charaters and bytes.
*/
public class CopyFileSample{
  public static void copy(File source, File destination) throws IOException{
    try(//try-with-resource
      InputStream in = new FileInputStream(source);
      OutputStream out = new FileOutputStream(destination);){
      int b;
      while((b = in.read()) != -1){
        out.write(b);
      }
    }
  }

  public static void main(String[] args) throws IOException{
    File source = new File("ocp/assertion/Assertion.java");//.class can also be processed
    File destination = new File("ocp/assertion/Assertion_copy.java");
    copy(source, destination);
  }
}
