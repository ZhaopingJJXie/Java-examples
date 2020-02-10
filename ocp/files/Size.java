package ocp.files;

import java.nio.file.*;
import java.io.*;

public class Size{
  public static void main(String[] args){
    Path path1 = Paths.get("ocp");//system dependent and not defined
    Path path2 = Paths.get("ocp/fileClass/ReadFileInfo.java");
    try{
      System.out.println(Files.size(path1));
      System.out.println(Files.size(path2));

    }catch(IOException e){
      System.out.println(e.getMessage());
    }
  }
}
