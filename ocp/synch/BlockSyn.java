package ocp.synch;

public class BlockSyn extends Thread{
  StringBuffer sb;
  BlockSyn(StringBuffer sb){
    this.sb = sb;
  }
  public void run(){
    synchronized(sb){
      for (int i = 0 ; i < 100; i++){
        System.out.println(sb);
      }
      // synchronized(sb){
      char letter = sb.charAt(0);
      char c = (char) (letter + 1);
      sb.setCharAt(0, c);
    }
  }

  public static void main(String[] args){
    StringBuffer sb = new StringBuffer("A");
    BlockSyn bn1 = new BlockSyn(sb);
    BlockSyn bn2 = new BlockSyn(sb);
    BlockSyn bn3 = new BlockSyn(sb);

    bn1.start();
    bn2.start();
    bn3.start();
  }
}
