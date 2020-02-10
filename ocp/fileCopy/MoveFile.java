package ocp.fileCopy;

import java.nio.file.*;
import java.io.*;
import static java.nio.file.StandardCopyOption.*;
import static java.nio.file.LinkOption.*;

public class MoveFile{
  public static void main(String[] args) {
    Path source = Paths.get("zoo");
    Path target = Paths.get("examples/zoo");
    try{
      Files.move(source, target,  REPLACE_EXISTING);
    }catch(UnsupportedOperationException e){
      e.getMessage();
    }catch(IOException e){
      e.printStackTrace();
    }
  }
}
