package examples;

interface Bozo{
  int type = 0;
  public void jump();
}
public class Type1Bozo implements Bozo{
  // int type = 1; //redefine is fine
  public Type1Bozo(){
    int type = 1;//assign to another value is not ok, since type is final
  }
  public void jump(){
  System.out.println("jumping..."+type);
          }
  public static void main(String[] args){
   Bozo b = new Type1Bozo();
    b.jump();

  
  }

}
