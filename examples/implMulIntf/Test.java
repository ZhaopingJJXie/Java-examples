package examples.implMulIntf;
interface House{
  public default String getAdd(){
    return "101 main str";
  }
}
interface Bungalow extends House{
  public default String getAdd(){
    return "101 smart str";
  }
}
//it if fine for MyHouse to implememnt both interfaces since Bungalow already
// override the default method
class MyHouse implements Bungalow, House{
}
public class Test{
  public static void main(String[] args){
    House ci = new MyHouse();
    System.out.println(ci.getAdd());
  }
}
