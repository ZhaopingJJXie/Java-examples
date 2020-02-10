package examples.thisSuperConstructor;

class Vehicle{
  String type = "4W";
  int maxSpeed = 100;

  Vehicle(String type, int maxSpeed){
    this.type = type;
    this.maxSpeed = maxSpeed;
  }
}

public class Car extends Vehicle{
  String trans;
  Car(String trans, String type, int maxSpeed){
    super(type, maxSpeed);
    this.trans = trans;
  }

  Car(String type, int maxSpeed, String trans){
    // super(type, maxSpeed);
    this(trans);
  }
}
