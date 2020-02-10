package examples.switchExample;
/**
a constant expression is an expression that yeilds a primitive type or
String type and whose value is evaluated at compile time to a literal
final variables do not get default values. They must be initialized in static
initialization blocks(for static final variables) or insrance initialization
blocks/constructors (for final instance variables)
*/
import static java.lang.System.out;
public class SwitchDemo{
  // public static final num;//num does not get default values, need to be initialized
  public static void main(String args[]){
    char ch = 'd';
    switch (ch){
      default:{out.println("default"); }
      case 'b':{out.println("b"); }
      case 'c':{out.println("c"); }
      case 'a':{out.println("a"); }
    }
      Integer b = 12;
      final Integer iFour = 4; //not a constant expression
      final int iFive = 5;//constant expression

      switch (b){//brackets in a case is not mandatory
        default:{out.println("default"); break;}
        case 10:{out.println(10); break;}
        case 12:{out.println(12); break;}
        case 13:{out.println(13); break;}
        // case iFour:{out.println(4);break;}//does not compile
        case iFive:{out.println(5); break;}
    }
/* for object reference, both statement expression and labled cases can not be null.
statement case be null will reuslt to NullTimeException, while the case be null
will not compile*/
    String str = "Java";
    String StringNull = null;
    out.println(StringNull);
    //out.println(null);will not compile;
    switch(str){
      // switch(StringNull){//NullPointerException
      default: {out.println("default");}
      // case null: {out.println(StringNull);}
    }
  }
}
