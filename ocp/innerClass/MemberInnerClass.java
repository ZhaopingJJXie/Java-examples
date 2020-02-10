package ocp.innerClass;
class Outsider{
  public class Inner{}
}
public class MemberInnerClass {
  private int x = 10;
  public  class B {
    //is not allowed to have static members, but static final is allowed
      private static final int x = 20;
      private int age = 30;
      class C {
          private int x = 30;
          private String name = "java";
          public void allTheX() {
              System.out.println(x);//30
              System.out.println(this.x);//30
              System.out.println(B.this.x);//20
              System.out.println(MemberInnerClass.this.x);//10
            }
          }
        }

public static void main(String[] args) {
  MemberInnerClass a = new MemberInnerClass();
  // MemberInnerClass.B b = a.new B();
  B b  = a.new B(); //is also fine
  b.age = 45;
  MemberInnerClass.B.C c = b.new C();
  B.C c2 = b.new C(); //is also fine
  c.allTheX();
  System.out.println(c.name);//inner private member is accessed by enclosing class
  Outsider.Inner in1 = new Outsider().new Inner();
}
}
