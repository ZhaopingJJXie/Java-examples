package ocp.generics;


import java.util.*;
class UtilitiesTest {
     public static void main(String []args) {
         List<Integer> intList = new LinkedList<>();
         List<Double> dblList = new LinkedList<>();
         System.out.println("First type: " + intList.getClass());
         System.out.println("Second type:" + dblList.getClass());
         List<Integer> l1= new ArrayList<>();
        // ArrayList<Number> an = (List<Number>)l1;//compilation error
         // ArrayList<? > an = (List<Integer>)l1;//compilation error

         List<String> l2 = new ArrayList<String>();
         ArrayList<String> l3 = (ArrayList<String>)l2;
         ArrayList<?> an = new ArrayList<String>();

} }
