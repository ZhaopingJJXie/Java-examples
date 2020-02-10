package examples.overloadConflict;

public class IntDoublePara{
  public static double calAve(double d, int i){
    return (d + i)/ 2;
  }
  public static double calAve(int i, double d){
    return (i + d)/2;
  }
  //many overloading method
  // public void m1(int a){
  //   System.out.println("in int");
  // }
  public void m1(Integer a){
    System.out.println("in Integer");
  }
  public void m1(long a){
    System.out.println("in long");
  }
  public void m1(Long a){
    System.out.println("in Long");
  }
  public void m1(Number a){
    System.out.println("in Number");
  }
  public void m1(Object a){
    System.out.println("in Object");
  }
  public void m1(int... a){
    System.out.println("in ...");
  }
  // public
  public static void main(String[] args){
    // calAve(2,3);//compilation errror since both methods match.
    // calAve(2.0, 3);//compiles
    IntDoublePara id = new IntDoublePara();
    int a = 10;
    Integer b = 10;
    int c = new Integer(10);
    long d = 10;
    Long e = new Long(10);
    Number f = 10;
    Object g = 10;
    short h = 10;
    String s = "java";
    id.m1(a);
    // id.m1(b);
    // id.m1(c);
    // id.m1(d);
    // id.m1(e);
    // id.m1(f);
    // id.m1(g);
    //
    // id.m1(h);
    // id.m1(s);
    // id.m1(a);
    // id.m1(a);


  }
}
