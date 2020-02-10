package examples.exercise5_4;

class BadFoodException extends RuntimeException{};

public class MyException{
  public static void checkFood(String s) throws BadFoodException{
    if(s.equals("cabbage")){
      throw new BadFoodException();
    }else{
      System.out.println("I like " + s);
    }
  }
  public static void main(String args[]){
    for (String str: args){
      try{
        checkFood(str);
      }catch(BadFoodException be){
        System.out.println("found bad food " + str);
      }catch(RuntimeException re){
        System.out.println("runtime exception caught");
      }
    }
  }

}
