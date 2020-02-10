package examples.stringBuilder;

public class CapacityDemo{
  public static void main(String[] args){
    StringBuilder sb = new StringBuilder("JavaOracle");
    System.out.println(sb.capacity());
    sb.ensureCapacity(20);
    System.out.println(sb.capacity());
    System.out.println(sb);
  }
}
