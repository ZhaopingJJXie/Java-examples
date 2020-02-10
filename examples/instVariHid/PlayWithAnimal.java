package examples.instVariHid;

abstract class Animal{
  public String name = "???";
  public void print(){
    System.out.println(name);
  }
  public void printName(){
    System.out.println(name);
  }

public void careFor() {
play();
}
public void play() {
  System.out.println("pet animal");
}
}
class Dog extends Animal{
  public String name = "Dog";
  public void printName(){
    System.out.println(name);
  }
  public void play(){
    System.out.println("play with him");
  }
}
public class PlayWithAnimal{
  public static void main(String[] args){
  Animal a = new Dog();
  a.print();//???
  a.printName();//Dog, printName is overridden, so the name in the subclass is printed
  a.careFor();//play with him,
  System.out.println(null instanceof Dog);//false
}
}
