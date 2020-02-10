package examples.stringBuilder;

public class SbDemo{
  // static{
  //   throw new NullPointerException();
  // }
  public static void main(String[] args){
    StringBuilder sb1 = new StringBuilder("snorkler");
    StringBuilder sb2 = new StringBuilder("yoodler");
    sb1.replace(3, 4, sb2.substring(4)).append(sb2.append(false));
  Boolean wb = Boolean.FALSE;
  Boolean wb2 = Boolean.FALSE;
  Boolean wb3 = new Boolean("true");
  System.out.println(wb==wb2);//true
  System.out.println(wb.equals(wb2));//true
  System.out.println(sb2.lastIndexOf("o"));
  System.out.println(sb2.lastIndexOf("o", 1));
  StringBuilder sb3 = new StringBuilder("javaGoodWork");
  /*delete will throw StingIndexOutOfBound only if stat is negative or larger than
  end, or greater then the lenght()*/
  System.out.println(sb3.delete(8, 21));
  char[] sat = new char[10];
  sb3.getChars(1, 7, sat, 0 );
  System.out.println(sb3 + ", "  + sat);//sb3 stays the same;
  for (char c : sat){
    System.out.println(c);
  }
  }
}
