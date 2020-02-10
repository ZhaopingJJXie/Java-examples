package ocp.fileCopy;

import java.io.*;

public class Mark{
  public static void main(String[] args) throws IOException{
    InputStream is = new FileInputStream("ocp/fileCopy/MoveFile.java");
    if(is.markSupported()){
      for (int i = 0; i < 10; i++){
        is.read();
      }
      is.mark(10);
      for(int j = 0; j < 10; j++){
        is.read();
      }
      is.reset();
    }
  }
}
