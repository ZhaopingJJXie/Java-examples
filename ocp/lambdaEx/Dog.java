package ocp.lambdaEx;

public class Dog{
  private String name;
  private int age;
  private int weight;

  public Dog(String name, int weight, int age){
    this.name = name;
    this.weight = weight;
    this.age = age;
  }

  public String toString(){
    return this.name + " is " + this.age + " years old and weights " +
    this.weight + " pounds";
  }
  public void setName(String name){this.name = name;}
  public String getName(){return name;}
  public void setAge(int age){this.age = age;}
  public int getAge(){return age;}
  public void setWeight(int weight){this.weight = weight;}
  public int getWeight(){return weight;}

  public void bark(){System.out.println("woof");}

}
