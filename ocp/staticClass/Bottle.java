package ocp.staticClass;

public class Bottle {
   public static class Ship {
      private enum Sail {  // w1
         TALL {protected int getHeight() {return 100;}},
         SHORT {protected int getHeight() {return 2;}};
         protected abstract int getHeight();
      }
      public Sail getSail() {
         return Sail.TALL;
      }
   }
   public static int m1(int x){
     return x=3;//this is fine
   }
   public static void main(String[] stars) {
      Bottle bottle = new Bottle();
      //Ship q = bottle.new Ship();  // w2
      Bottle.Ship q = new Bottle.Ship();//fine
      // bottle.Ship q2 = new Bottle.Ship(); compilation error
      Ship q2 = new Bottle.Ship();//fine
      Ship q3 = new Bottle.Ship();
      Ship q4 = new Ship();
      System.out.println(q.getSail());
      System.out.println(m1(2));
   }
}
