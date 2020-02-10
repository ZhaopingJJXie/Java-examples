package examples.nullRefersMembers;

public class NullString{
  public static void main(String[] args){
    String nullStr = null;

    nullStr += " java";
    System.out.println(nullStr);//compiles and retuens null Java
    String nullStr2;
    nullStr2 += "java";//compilation error, nullStr2 not initialized
  }
}
