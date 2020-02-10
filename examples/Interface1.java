package examples;

public interface Interface1{
int aValue = 10 ;
// abstract public void bounce();
//final modifier is not allowed for static methods
// final static int TheValue( ){
//   return aValue;
// }
default int getValue(){
  return 10;
}
int addValue();
static void print(){//modifier final is not allowed here
  System.out.println("print method");
}
}
