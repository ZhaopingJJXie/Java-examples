package ocp.enums;

public enum Pets{
  DOG("D"), CAT("C"), FISH("F");
  public static final String prefix = "I am ";
  String name;

  //constructor can only reference static final variables
  Pets(String s){this.name = prefix + s; }
  public String getData(){return name;}

  public static void main(String[] args) {
    Pets p = Pets.DOG;
    System.out.println(p.getData());
    System.out.println(p.name()); 
  }
}
