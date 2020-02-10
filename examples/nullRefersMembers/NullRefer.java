package examples.nullRefersMembers;
/*always keep in mind about local variables need to be initialized before read the value*/
public class NullRefer{
  static NullRefer snf;//snf is initialized as null
  static int age;
  int salary;
  static int getAge(){
    return age;
  }
  int getSalary(){
    return salary;
  }
  public static void main(String[] args){
    // NullRefer nf ;
    /* nf is not initialized as null here so it can
     not be used to access members, compilation error*/
    // System.out.println(nf.age);
    // System.out.println(nf.salary);
    System.out.println(snf.getAge());
    // System.out.println(nf.getSalary());



  }
}
