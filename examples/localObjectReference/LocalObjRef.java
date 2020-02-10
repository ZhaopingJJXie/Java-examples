package examples.localObjectReference;

import java.time.LocalDate;
public class LocalObjRef{
  public static void main(String args[]){
/*uninitialized local variable, can not be read*/
    // Date date;
    LocalDate date = null;
    if (date == null){
      System.out.println("equals");
    }
  }


}
