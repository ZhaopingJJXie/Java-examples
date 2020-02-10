package ocp.formatNumbers;
import java.text.*;//java.text.ParseException 
import java.util.*;
/*
once you have a NumberFormat instance, you can use format() to turn a number to a
String ot use parse() to turn a string to a number*/
public class FormatNumbers{
  public static void main(String[] args) throws ParseException{
    int attendeesPerYear = 3_200_000;
    int attendeesPerMonth = attendeesPerYear/ 12;
    NumberFormat us = NumberFormat.getInstance(Locale.US);//266,666
    System.out.println(us.format(attendeesPerMonth));
    NumberFormat g = NumberFormat.getInstance(Locale.GERMANY);//266.666
    System.out.println(g.format(attendeesPerMonth));
    NumberFormat ca = NumberFormat.getInstance(Locale.CANADA_FRENCH);//266 666
    System.out.println(ca.format(attendeesPerMonth));
    NumberFormat deft = NumberFormat.getInstance();
    System.out.println(deft.format(attendeesPerMonth));//266,666

    double price = 48;
    NumberFormat usp = NumberFormat.getCurrencyInstance();
    Locale l = Locale.getDefault();//en_CN
    System.out.println(usp.format(price));//CNY48.00

    String s = "40.50";
    String bad = "x85.3";//unparsebale
    System.out.println(us.parse(s));//40.5
    System.out.println(ca.parse(s));//40
    // System.out.println(us.parse(bad));//thros ParseException


  }
}
