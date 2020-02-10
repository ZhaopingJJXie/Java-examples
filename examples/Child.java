package examples;

import examples.protectedMember.Parent;

public class Child extends Parent{
    int myValue = 30;
    final String name = "java";
    static final int grade = 10;
    static final void shout(){
      //final modifier is not allowed if the subclass is going to override the mehtod
      System.out.println("child");
    }
    public static void main(String[] args){
        Parent p = new Parent();
        Child c = new Child();
        Parent p1 = new Child();
        Zoo zoo = new Zoo();
        /* equals method can have any Object object as paremeter*/
        System.out.println(zoo.equals(c));

        System.out.println(c.myValue);
        System.out.println(c.getMyValue());

        System.out.println(p1.myValue);//value definde in parent class
        System.out.println(p1.getMyValue());
        /* parent object can nt access protectd instance variables defined in Parent class*/

        //myValue can only be referenced by object reference,
        // it can not be referenced by a static context

        System.out.println(p.myValue);
        System.out.println(c==p1);//false;
        System.out.println(c==p);//false;


    }

    public int getMyValue(){
      return myValue;
    }
}
