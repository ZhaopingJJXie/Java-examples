package examples.labeledWhileLoop;

public class LabeledWhileLoop{
  public static void main(String args[]){
    int age = 4;
    outer:
      while (age <= 21){
        if (age++ == 16){
          System.out.println("get your driver's licencse");
          continue outer;
        }else{
          System.out.println("Another year");
        }

      }
  }
}
