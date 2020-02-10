package examples.forLoop;

public class ForLoop{
  public static void main(String[] args){
    // for(int i= 0, Sytem.out.println("start"); i < 5; i++){}//mix statement and expression
    // for (int i=0;String str ="j"; ){}//difference types, compilation error
    int j = 5 ;
    for(j = 0, System.out.println("start"); j< 5; j++ ){}
      //j+=5 means you are trying to declare j, but j has been declared
    // for(int i = 0,j += 5; i < j; i++ ){j--;}
    while(false){}
  }
}
