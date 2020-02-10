package ocp.files;

import java.nio.file.*;
import java.io.*;

public class CheckAttr{
  public static void main(String[] args){
    Path path1 = Paths.get("Java/jojo");
    try{//isHidden throws IOException
      System.out.println(Files.isHidden(path1));//false
    }catch(IOException e){
      System.out.println(e.getMessage());
    }
    System.out.println(Files.isDirectory(path1));//false
  }
}
