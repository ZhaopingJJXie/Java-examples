/**
toAbsolutePath() wotk on relative path object will return a new path object,
while if returns the same object on absolute path object
*/

package ocp.path;

import java.nio.file.*;
import java.io.*;

public class AbsoluteRelative{

  public static void main(String[] args){
    Path path1 = Paths.get("/Users/jojo/./Java_examples/ocp/path");
    Path path2 = Paths.get("bytecode/ocp");

    System.out.println("path1 is absolute? " + path1.isAbsolute());
    System.out.println("path2 is absolute? " + path2.isAbsolute());
    Path path3 = path1.toAbsolutePath();
    Path path4 = path2.toAbsolutePath();
    System.out.println("path1 equals path3? " + path1.equals(path3));//true
    System.out.println("path1 == path3? " + (path1==path3));//true

    System.out.println("path2 equals path4? " + path2.equals(path4));//false
    Path p1 = Paths.get("/leaves/./giraffe.exe");
    Path p2 = Paths.get("/leaves/giraffe.exe");
    System.out.println("p1 equals p2?"  + p1.equals(p2));//false

    System.out.println("subpath from 0 to 3 is: " + path1.subpath(0, 3));
    System.out.println("subpath from 1 to 3 is: " + path1.subpath(1, 3));
    System.out.println("subpath from 2 to 3 is: " + path1.subpath(2, 3));

    //IllegalArgumentException
    // System.out.println("subpath from 0 to 3 is: " + path1.subpath(1, 1));
    // System.out.println("subpath from 0 to 3 is: " + path1.subpath(0, 4));

    Path path5 = Paths.get("/Java_examples/ocp/console/PasswordSample");
    System.out.println(path5.relativize(path1));
    //relativize() method requires both path are absoulte or relative path,
    // otherwise IllegalArgumentException will be thrown
    // System.out.println(path1.relativize(path2));

    final Path path6 = Paths.get("/cats/../panther");
    final Path path7 = Paths.get("food");
    //resolve(path) does not call normalize(), path1.resolve(path2), if path2 is absolute
    // path2, will be returned.
    Path path8 = path6.resolve(path1);
    System.out.println(path6.resolve(path7));// /cats/../panther/food
    System.out.println("path8 == path1" + (path8 == path1));// return the absolute path passed

    /**
    toRealPath() calls normalize( ) by default, follows symbolic link
     returns an absolute path if it exists in the file system,
     otherwise, it throws IOException
    */

    Path absolute1 = Paths.get("/home/java");
    Path absolute2 = Paths.get("/home/java/temp/music.map3");
    System.out.println("abs2.relative(abs1): " + absolute2.relativize(absolute1));

    try{
        System.out.println(path1.toRealPath());
        System.out.println(Paths.get(".").toRealPath());
        // System.out.println(path6.toRealPath());
      }catch(IOException e){
          System.out.println("file does not exist");
          }

    // path8.resolve(null);//reference to resolve i/s ambiguous
    // path.resolve(String) and path.resolve(Path)
  }
}
