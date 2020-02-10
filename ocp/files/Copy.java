/**
Files.copy(path1, path2)
1.throws IOException if file can not be read or
directory/file does not exist in the fil system.
2.copy directory is a shallow copy means the contens in the directory are not copied
3. by default it follows symbolic link, file attributes are not copied, if the destination
already exists, without REPLACE_EXISTING flag, it will throw an exception(FileAlreadyExistsException)

*/
package ocp.files;

import java.nio.file.*;
import java.io.*;

public class Copy{
  public static void main(String[] args) throws IOException{
    try{
      Path p1 = Paths.get("data");
      if(Files.exists(p1)){
        Files.delete(p1);
      }
      Files.createDirectory(p1);

      Path p2 = Paths.get("ocp/locale_copy");
      if(Files.exists(p2)) {
        Files.delete(p2);//shallow copy of directory
      }
      Files.copy(Paths.get("ocp/locale"), p2);

      Path p3 = Paths.get("data/animal.data");
      if(Files.exists(p3)){
        Files.delete(p3);
      }
      Files.copy(Paths.get("animal.data"), p3);
    }catch(IOException e){
      System.out.println("exception caught");
    }
  }
}
