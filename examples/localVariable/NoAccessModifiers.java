package examples.localVariable;

public class NoAccessModifiers{
    public static void main(String args[]){
      /*can not apply access modifier to local variables*/
      // private int a = 10;
      int i = 0;
      int[] iA = {10, 20};
      iA[i]= i = 30;
      // iA[i] = i = 30 ; => iA[0] = i = 30 ; => i = 30 ; iA[0] = i ; => iA[0] = 30;
      System.out.println("" + iA[0] + " " + iA[1] + " " + i);
      // loop: int i2 = 3; //can not label declarartions
    labelIf:
          if(i > 0 ){
            System.out.println("less than zero");
          }else{
            System.out.println("bigger than zero");
            break labelIf;
          }

    // int j = 0 ;
    for (int j = 1; j < 10 ; j++){
      //j is already declared, can not be declared again!
    }
    }

}
