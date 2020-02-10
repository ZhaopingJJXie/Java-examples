package examples;

import coreAPIS.dateTime.Myclass;

public class Zoo extends Myclass{
  public static final int numOfAnimal;
   final public static int myValue = 12;
   public final int numOfEmp ;//it has to be initialized in every constructor
  //Myclass has to be public or in the same package of Zoo,
  // otherwise Myclass is not accessible here
  /*static final variables don't get default values,
  it has to be initilized by declaration or in static initilization blocks */
  static{
    numOfAnimal = 4 ;
  }

  /*instance initialization block*/
  // {numOfEmp = 23;}

  /*no-argument constructor*/
  public Zoo(){
    numOfEmp = 23;
  }

  public Zoo(int num ){
    /* constructor can not initialize static final variable*/
    // numOfAnimal = 4;
    numOfEmp = num;
  }
  public static void main(String args[]){
    // Zoo zoo = new Zoo(4);
    System.out.println(args[0]);
    System.out.println(args[1]);
   //System.out.println("Hello World");
  }
}
