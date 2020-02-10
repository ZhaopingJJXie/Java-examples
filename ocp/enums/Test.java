package ocp.enums;

enum Animals{
  DOG("woof"), CAT("meow"), FISH("burble");
  String sound;
  Animals(String s){
    sound = s;
  }
}
public class Test{
  static Animals a = Animals.DOG ;
  public static void main(String[] args){
    System.out.println(a.DOG.sound+ " " + a.FISH.sound);//woof burble
  }
}
