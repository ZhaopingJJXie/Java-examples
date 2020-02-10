package ocp.fileVisitor;

import java.nio.file.*;
import java.nio.file.attribute.*;
import java.io.*;
public class PrintDirs extends SimpleFileVisitor<Path>{
  public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs){
    System.out.println("pre: " + dir);
    String name = dir.getFileName().toString();
    if(name.equals("child")){
      return FileVisitResult.SKIP_SIBLINGS;
    }
    return FileVisitResult.CONTINUE;
  }
  public FileVisitResult visitFile(Path file, BasicFileAttributes arrts){
    System.out.println("file: " + file);
    return FileVisitResult.CONTINUE;
  }
  public FileVisitResult visitFileFailed(Path file, IOException e){
    return FileVisitResult.CONTINUE;
  }
  public FileVisitResult postVisitDirectory(Path dir, IOException e){
    System.out.println("post: "+ dir);
    return FileVisitResult.CONTINUE;
  }

  public static void main(String[] args) throws Exception{
    PrintDirs dirs = new PrintDirs();
    Files.walkFileTree(Paths.get("parent"), dirs);
  }
}
