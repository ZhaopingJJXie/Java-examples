package examples.initializer;

public class SmallIni{
  static int x ;
  int y ;
  static {x = 1;}
  {
    /*intance initializer can initializer static variables*/
    x = 2;
    y = 3;
  }
  /* a method can not be defined both abstract and static*/
  // public static abstract int getX (){
  //
  // }


  public static void main(String args[]){
    SmallIni sm = new SmallIni();
    System.out.println(x);
    System.out.println(sm.y);
  }
}
