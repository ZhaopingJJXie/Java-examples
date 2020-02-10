package ocp.fileClass;
import java.io.*;

public class ReadFileInfo{
  public static void main(String[] args) throws IOException {
    File file = new File("/Users/jojo/Java_examples/ocp/forkJoin");
    System.out.println("File exists: " + file.exists());
    if(file.exists()){
      System.out.println("Absolute Path: " + file.getAbsolutePath());
      System.out.println("Is Directory: " + file.isDirectory());
      System.out.println("Parent Path: " + file.getParent());//anything except the last name sequence
      System.out.println("File name: " + file.getName());//the last nanme in the namepath
    }
    if(file.isFile()){
      System.out.println("File size: " + file.length());
      System.out.println("File LastModified: " + file.lastModified());
    }else{
      for (File subfile: file.listFiles()){
        System.out.println("\t" + subfile.getName());
      }
    }

    File myDir = new File("mydir");
    // mydir.mkdir();
    File myFile = new File(myDir, "myFile.txt");
    try{
      myFile.createNewFile();
    }catch(IOException e){
      e.printStackTrace();//no such file or diresctory
    }
  }
}
