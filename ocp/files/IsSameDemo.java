/**
java.nio.file.Files.isSameFile(path1, path2), follows symbolic link
1. if the two paths are equal, returns true without checking existence
2. if path1.equals(path2) return false
  a. if either path does not exist in the file system, throws IOException
  b. if the two path refer to the same file in the file system, returns ture,
  otherwise, returns false

*/
package ocp.files;

import java.nio.file.*;
import java.io.*;
import java.util.*;

public class IsSameDemo{
  public static void main(String[] args) throws IOException{
    try{
      System.out.println(Files.isSameFile(Paths.get("/user/home/cobra"),
      Paths.get("/user/home/cobra")));//true
      System.out.println(Files.isSameFile(Paths.get("/Users/Jojo/Java_examples/./ocp"),
      Paths.get("/Users/Jojo/Java_examples/ocp")));//true
      //p1.eauals(p2) == false, but refer to the same file on the system


      // System.out.println(Files.isSameFile(Paths.get("/leaves/./giraffe.exe"),
      // Paths.get("/leaves/giraffe.exe")));//FileNotFoundException, because
      // p1.equals(p2) ==false and they don't exist on the file system

      System.out.println((Paths.get("/leaves/./giraffe.exe").
      equals(Paths.get("/leaves/giraffe.exe"))));//false

      System.out.println(Files.isSameFile(Paths.get("./ocp"),
      Paths.get("/Users/Jojo/Java_examples/ocp")));//true

      System.out.println(Files.isSameFile(Paths.get("/cardinal/tail.data"),
      Paths.get("/cardinal/tail.data")));//true
      } catch (IOException e) {
          System.out.println("file not found exception");

  }
  }
}
