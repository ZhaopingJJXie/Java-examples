package ocp.locale;
import java.util.*;

public class LocaleDemo{
  public static void main(String[] args){
    Locale locale = Locale.getDefault();
    System.out.println(locale);//en_CN

    System.out.println(Locale.GERMAN);//de
    System.out.println(Locale.GERMANY);//de_DE

    System.out.println(new Locale("fr"));
    System.out.println(new Locale("hi", "IN"));

    Locale l1 = new Locale.Builder().setLanguage("en").setRegion("US").build();
    Locale l2 = new Locale.Builder().setRegion("US").setLanguage("en").build();
    
  }
}
