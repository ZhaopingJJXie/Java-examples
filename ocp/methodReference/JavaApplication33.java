package ocp.methodReference;
import java.util.function.*;
class Mouse {    }
class Tiger{   }
class Animal {
    public void eat(Mouse m){  System.out.println("instance eat");  }
    public void talk(Mouse m){}
      static void sleep(Mouse m){}
        public void drink(Mouse m){}
      public static void eat(Tiger t, Mouse m){   System.out.println("static  eat");}
    public void look(Animal t, Mouse m){   System.out.println("static look");}

    }

public class JavaApplication33 {
    public static void main(String[] args) {
        //The context does !not! supply any instance of Animal, but it compiles and it uses the instance method eat
        BiConsumer<Animal, Mouse> bC = Animal::eat; //instance eat method
        bC.accept(new Animal(), new Mouse());
        Animal a = new Animal();
        BiConsumer<Animal, Mouse> bc =(b, m) -> b.eat(m);
        BiConsumer<Animal, Mouse> bb = Animal::talk;//instance talk method
        Consumer<Mouse> b = Animal::sleep;//staic sleep method
        Consumer<Mouse> bd = a::drink;//instance drink method
        BiConsumer<Animal, Mouse> bb2 = a::look;
      }
}
