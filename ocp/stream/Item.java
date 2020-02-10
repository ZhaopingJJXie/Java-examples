package ocp.stream;

import java.util.*;

public class Item{
  private String name;
  private String category;
  private double price;
  public Item(String name, String category, double price){
                this.name = name;
                this.category = category;
                this.price = price;         }
                 //accessors not shown }  What will the following code print?
     public static void main(String[] args) {
       List<Item> items = Arrays.asList(
       new Item("Pen", "Stationery", 3.0),
        new Item("Pencil", "Stationery", 2.0),
        new Item("Eraser", "Stationery", 1.0),
        new Item("Milk", "Food", 2.0),
        new Item("Eggs", "Food", 3.0) );
        ToDoubleFunction<Item> priceF = Item::getPrice; //1
        items.stream()
        .collect(Collectors.groupingBy(Item::getCategory)) //2
        .forEach((a, b)->{//this is a froeach from a Map!, it takes a Biconsumer
          double av = b.stream().collect(Collectors.averagingDouble(priceF)); //3
         System.out.println(a+" : "+av);         });

     }
