package ocp.immutableClass;
import java.util.*;

public final class Animal{
  //all  instance varaibles are private and final
  private final String species;
  private final int age;
  private final List<String> favouriteFoods;

  //public constructor to set up all instance variables
  public Animal(String species, int age, List<String> favouriteFoods){
    this.species = species;
    this.age = age;
    if(favouriteFoods == null){
    throw new RuntimeException("favourite food is required.");
  } //never use a referce to refer to the original mutable variables
    this.favouriteFoods = new ArrayList<String>(favouriteFoods);//this is important
    // this.favouriteFoods = favouriteFoods;//this vilate the design principle of immutable class
  }
  //no setters 
  public String getSpecies(){
    return species;
  }

  public int getAge(){
    return age;
  }

  public int getFavouriteFoodCount(){
    return favouriteFoods.size();
  }

  public String getFavouriteFood(int index){
    return favouriteFoods.get(index);
  }
}
