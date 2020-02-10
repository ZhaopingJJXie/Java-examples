package ocp.fileCopy;
import java.util.*;
import java.io.*;

public class CopyTextFileSample{

  public static List<String> readFile(File source) throws IOException{
    List<String> data = new ArrayList<>();
    try(
    BufferedReader reader = new BufferedReader(new FileReader(source))
    ){
      String s ;
      while((s = reader.readLine()) != null){
        data.add(s);
      }
    }

    return data;
  }

  public static void writeFile(List<String> data, File destination) throws IOException{
    try(
    BufferedWriter writer = new BufferedWriter(new FileWriter(destination))
    ){
      for (String s: data){
        writer.write(s);
        writer.newLine();
      }
      writer.flush();//can call flush() inside try block
    }
    finally{
      //  writer.close();//compilation error, can not find symbol writer since
      // writer is visiable only in the try clause
    }
  }

  public static void copyFile(File source, File destination) throws IOException{
    try(
    BufferedReader reader = new BufferedReader(new FileReader(source));
    BufferedWriter writer = new BufferedWriter(new FileWriter(destination))
    ){
      String s;
      while((s = reader.readLine() )!= null){
        writer.write(s);
        writer.newLine();
      }
    }
  }
  public static void main(String[] args) throws IOException{
    File source = new File("ocp/forkJoin/SingleThread.java");
    File destination = new File("ocp/forkJoin/SingleTheadCopy.java");
    File destination2 = new File("ocp/forkJoin/SingleTheadCopy2.java");
    List<String> data = new ArrayList<>();
    data = readFile(source);
    for (String s : data){
      System.out.println(s);
    }
    writeFile(readFile(source), destination);
    // copyFile(source, destination2);
  }
}
