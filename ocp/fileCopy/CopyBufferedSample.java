package ocp.fileCopy;

import java.io.*;

public class CopyBufferedSample{
  public static void copy(File source, File destination) throws IOException{
    try
    (
      // InputStream ins = new BufferedInputStream("ocp/files/checkAttr.java");   
        InputStream in = new BufferedInputStream(new FileInputStream(source));
        OutputStream out = new BufferedOutputStream(new FileOutputStream(destination))

        ){
          byte[] buffer = new byte[1024];
          int lengthRead;
          while((lengthRead = in.read(buffer))>0){
            out.write( lengthRead);
            out.flush();
          }
        }
  }
  public static void main(String[] args) throws IOException{
    File source = new File("bytecode/ocp/assertion/Assertion.class");
    File destination = new File("bytecode/ocp/assertion/Assertion_copy_buffer_1.class");
    copy(source, destination);
  }
}
