package examples.staticImport ;
/**
class from java.lang can be used directly without import.
while class from java.util.package should be imported explicitly

*/
// import static java.lang.Integer.*;
import static java.util.Arrays.aList;
import static java.lang.Integer.MAX_VALUE;

public class StaticImport {
  public static void main(String[] args){
    System.out.println(Integer.MAX_VALUE);

    //doe not import Arrays, so the following statement does not compile
    // Arrays.asList("one");

  }
}
