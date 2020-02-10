package ocp.files;

import java.nio.file.*;
import java.io.*;

public class StreamCopy{
  public static void main(String[] args){
    try(InputStream in = new FileInputStream("ocp/files/Copy.java");
    OutputStream out = new FileOutputStream("ocp/files/copy_generics.java")){
      Files.copy(in, Paths.get("ocp/files/Copy_copy.java"));
      //this does not support optional args
      Files.copy(Paths.get("ocp/generics/GenDemo.java"), out);
    }catch(IOException e){
      System.out.println(e.getMessage());
    }
  }
}
