package examples.labeledWhileLoop;

public class LableDemo{
  public static void main(String[] args){
    int a = 10;
    l1:{System.out.println("l1");//label define is fine
    // break;//break can not stay outside of loop or switch
  }
    // if(a > 10){break; }//break is not allowed without being incuded by a switch or loop
    l2 :{int b = 3; }//fine, declaration in a block;
    // l3: int c = 20; //compilation error, label can not be followed by a single declaration
    l4: System.out.println("l4");//single statement is fine here
    l5: return; 
  }



}
