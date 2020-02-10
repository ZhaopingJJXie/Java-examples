package ocp.serializable;
/**
the no-arg constructor of first non-serializable super class will be callled in deserialization
so the first non-serilizable super class should have a non-arg constructor,
otherwise the class is serializable, but not deserializable
*/
class Fruit {
  private Season ripe;

  public Fruit (Season ripe) {}
  public void setRipe(Season ripe) {}
  public Season getRipe() {}
}

public class Raspberry extends Fruit
        implements Serializable {  // Noncompliant; nonserializable ancestor doesn't have no-arg constructor
  private static final long serialVersionUID = 1;

  private String variety;

  public Raspberry(Season ripe, String variety) { }
  public void setVariety(String variety) { }
  public String getVarity() { }
}
