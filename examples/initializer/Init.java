package examples.initializer;

import static java.lang.System.out;

class SuperInit{
  static{out.println("1st super static init" );}
  {out.println("1st super instance init");}
  {out.println("2nd super instanece init");}
  static{out.println("2nd super static init");}
  SuperInit(){
    System.out.println("no argument super const");
  }
}
public class Init extends SuperInit{
  Init(int a){out.println("1-argument const");}
  Init(){out.println("no argument const");}
  static{out.println("1st static init");}
  {out.println("1st instance init");}
  {out.println("2nd instance init");}
  static{out.println("2nd static init");}

  public static void main(String args[]){
    // new Init(1);
    // new Init();
  }
}
