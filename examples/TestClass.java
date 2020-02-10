package examples;

import java.util.ArrayList;

class Position {
  public double x;
  public double y;
}
public class TestClass{
  public static void main(String[] args){
    // float value1 = 120.0 ;
// float value2 = (int)120.0;
// float value3 = if * 0.0;
// float value4 = if * (short)0.0;
// float value5 = if * (boolean)0;
    // System.out.println("Hello world!");

    int boxLength = args[0];
    int numOfPar = args[1] * args[1];
    ArrayList<Position> parPosition = new ArrayList<>;
    double space = (double)boxLength / args[1];
    int count = 0 ;
    for (int i = 0; i * space < boxLength; i++){
      for(int j = 0; j * space < boxLength; j++){
        parPosition[count].x = i * space;
        parPosition[count++].y = j * space;
      }

    }
    }
}
