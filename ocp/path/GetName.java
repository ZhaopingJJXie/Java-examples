package ocp.path;

import java.nio.file.*;
import java.util.*;
public class GetName{
  public static void getPathInfo(Path path) {
    //path.toString() is the string parameter in the get() method
    System.out.println("the path name is: " + path);
    // getFileName() get the farthest element from the root,
    // if it is root, the name is null
    System.out.println("file name: " + path.getFileName());
    // getFileName() get the farthest element from the root,
     // if it is root, the name is null
    System.out.println("file parent: " + path.getParent());
    //getRoot() method returns null if path is relative
    System.out.println("file root: " + path.getRoot());

    // / root is not included in the list of names, getName(int) is zero-indexed
    for (int i = 0; i < path.getNameCount(); i++){
      System.out.println("  element " + i + " is: " + path.getName(i));
    }
  }
  public static void main(String[] args){

    Path path1 = Paths.get("/land/hippo/harrry.happy");//absolute path
    Path path2 = Paths.get("landd/hippo/harry.happy");//realtive path
    Path path3 = Paths.get("/", "Java_example", "ocp");
    Path path4 = Paths.get("/");
    List<Path> paths = new ArrayList<>();
    paths.add(path1);
    paths.add(path2);
    paths.add(path3);
    paths.add(path4);

    paths.stream().forEach(GetName::getPathInfo);



  }
}
