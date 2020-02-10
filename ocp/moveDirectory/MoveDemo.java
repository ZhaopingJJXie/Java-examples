package ocp.moveDirectory;

import java.io.*;
import java.nio.file.*;

public class MoveDemo{
  public static void main(String[] agrs){
    try{
      Files.move(Paths.get("ocp/forkJoin"), Paths.get("coreAPIS/forkJoinCopy"));
    }catch(IOException e){
      System.out.println("IO exception");
    }
  }
}
