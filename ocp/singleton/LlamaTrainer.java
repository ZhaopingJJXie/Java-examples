package ocp.singleton;

public class LlamaTrainer{
  public boolean feedLlamas(int numberOfLlamas){
    int ampountNeeded = 5 * numberOfLlamas;
    HayStorage hayStorage = HayStorage.getInstance();
    if(hayStorage.getHayQuantity() < ampountNeeded){
      hayStorage.addHay(ampountNeeded + 10 );
    }
    boolean fed = hayStorage.removeHay(ampountNeeded);
    if(fed){
      System.out.println("Llamas have been fed.");
    }
    return fed;
  }
  public static void main(String[] args){
    LlamaTrainer lt = new LlamaTrainer();
    lt.feedLlamas(7);
  }
}
