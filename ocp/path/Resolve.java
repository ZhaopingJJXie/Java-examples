package ocp.path;

import java.nio.file.*;

public class Resolve{
  public static void main(String[] args) {
    Path p1 = Paths.get("\\photos\\vacation");
    Path p2 = Paths.get("\\yellowstone");
    System.out.println(p1.resolve(p2)+ " "+ p1.relativize(p2));
  }
}
