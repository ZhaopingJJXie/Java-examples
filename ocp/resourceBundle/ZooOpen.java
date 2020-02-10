package ocp.resourceBundle;
import java.util.*;

public class ZooOpen{
  public static void main(String[] args){
    Locale us = new Locale("en", "US");
    Locale france = new Locale("fr", "FR");
    printProperties(us);
    System.out.println();
    printProperties(france);

    ResourceBundle rb1 = ResourceBundle.getBundle("Zoo", us);
    Set<String> keys = rb1.keySet();
    keys.stream().map(k -> k + " " + rb1.getString(k))
                  .forEach(System.out::println);
    Properties props = new Properties();
    rb1.keySet().stream().forEach(k ->  props.put(k, rb1.getString(k)));
  }

  public static void printProperties(Locale locale){
    ResourceBundle rb = ResourceBundle.getBundle("Zoo", locale);
    System.out.println(rb.getString("hello"));
    System.out.println(rb.getString("open"));

  }
}
