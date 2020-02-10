package ocp.path;
import java.nio.file.*;

class Normalize{
  public static void main(String[] args) {
    Path p = Paths.get("/../../test.txt");//".." with no concerete path element ahead is redundant
    System.out.println(p.normalize().toUri());//file:///test.txt;
    System.out.println(p.getRoot().toString());// "/"
  }
}
