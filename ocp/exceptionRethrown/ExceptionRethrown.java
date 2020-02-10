package ocp.exceptionRethrown;
import  java.io.*;
import java.sql.*;

public class ExceptionRethrown{
  public static void couldfThrowAnException() throws IOException,
                                                      SQLException{}

 public static void rethrow() throws IOException, SQLException {
   try{
     couldfThrowAnException();
     // The compiler is treating Exception as
     // “any exceptions that the called methods happen to throw.”
   }catch(Exception e){
     e.getMessage();
     e = new IOException();
     // throw e;  can not rethrown a caught Exception e
   }
 }

 public static void main(String[] args) throws SQLException, IOException{
   rethrow();
 }
}
