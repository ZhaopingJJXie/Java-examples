package ocp.innerClass;

 class Outsider {
    public class Insider{ } }
public class TestClass {
  public static void main(String[] args)    {
    Outsider os = new Outsider();
    Outsider.Insider in = os.new Insider();//
    os.Insider in2 = os.new Insider();//this means package os
    // Insider in = os.new Insiders();//compilation error


}}
