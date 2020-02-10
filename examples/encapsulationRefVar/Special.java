package examples.encapsulationRefVar;
/**
for mutable object, you don't have encapsulation since the
getter returns a copy of the reference varibale. The copy of the object itself
should be returned to ensure encapsulation
*/
public class Special{
  private StringBuilder s = new StringBuilder("java");
  //bad encapsulation of mutable object
  // StringBuilder getSb(){
  //   return s;
  // }
  // good encapsulation should return a copy of the orignial object not a copy of the reference
  StringBuilder getSb(){
    return new StringBuilder(s.toString());
  }
  void printSb(){
    System.out.println(s);
  }
  public static void main(String[] args){
    Special sp = new Special();
    StringBuilder sb = sp.getSb();
    // both s and sp now refer to the "java"
    sb.append("oracle");
    // sp.printSb();// javaoracle now
    sp.println();//java
  }
}
