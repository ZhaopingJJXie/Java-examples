package ocp.serialization;

import java.io.*;
public class Valve implements Serializable {
   private int chambers = -1;
   private transient Double size = null;
   private static String color;
   public Valve() {
      this.chambers = 3;
      color = "BLUE";
   }

   public static void main(String[] love) throws Throwable {
      try (ObjectOutputStream o = new ObjectOutputStream(
            new FileOutputStream("scan.txt"))) {
         final Valve v = new Valve();
         v.chambers = 2;
         v.size = 10.0;
         v.color = "RED";
         o.writeObject(v);
      }
      new Valve(); //case one
      // new Valve();
      try (ObjectInputStream o = new ObjectInputStream(
            new FileInputStream("scan.txt"))) {
         Valve v = (Valve)o.readObject();
         System.out.print(v.chambers+","+v.size+","+v.color);
         //case one output: 2, null, RED
        //if new Valve() i s not comment, output 2 ,null, BLUE
      }
   }
   { chambers = 4; }
}
