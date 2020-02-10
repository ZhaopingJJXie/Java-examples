package ocp.files;

import java.io.*;
import java.nio.file.*;

public class MoveDemo{
  public static void main(String[] args) throws IOException{
    try{
      // Files.move(Paths.get("coreAPIS/forkJoinCopy"), Paths.get("forkJoinCopy"));
      if(Files.exists(Paths.get("ocp/jojo")) == false)
        Files.createDirectory(Paths.get("ocp/jojo"));
      Files.move(Paths.get("coreAPIS/dateTime/Myclass.java"), Paths.get("ocp/jojo/Myclass.java"));
    }catch(IOException e){
      System.out.println(e.getMessage());
    }
  }
}
