package examples.underscore;

public class UnderscoreNum{
  public static void main(String[] args){
    int i1 = 0_345;//legal;
    // int i2 = 0b_1010;//illegal undercosre right next to 0b
    // byte i3 = 0b11111111; //as an int literal.it means 256, outside of byte range!
    byte i4 = -1;//legal
    byte i5 = 0b1101;
    // double l1 = 10_d;//not next to l, d, f

    System.out.println(i3);
    // int i4 = 0x_10;
  }
}
