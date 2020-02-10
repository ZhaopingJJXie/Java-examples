package ocp.serialization.instanceReferenceTransient;

class Collar {
  private int collarSize;
  public Collar(int size){collarSize = size;}
  public int getCollarSize(){return collarSize;}
}

class Dog implements Serializable{
  transient private Collar theCollar;//not serializable
  private int dogSize;
  public Dog(Collar collar, int size){
    theCollar = collar;
    dogSize = size;
  }
  public Collar getCollar(){return theCollar;}
  private void writeObject(ObjectOutputStream os){
    //throws IOException
    try{
      os.defaultWriteObject();
      os.WriteInt(theCollar.getCollarSize());
    }catch(Exception e){e.printStackTrace();}
  }
  private void readObject(ObjectInputStream is){
    //throw IOException, CLassNotFoundException{
    try{
      is.defaultReadObject();
      theCollar = new Collar(is.readInt());
    }catch(Exception e){e.printStackTrace();}
  }
}

public class SerializeDog{
  public static void main(String[] args){
    Collar c = new Collar(3);
    Dog d = new Dog(c, 5);
    System.out.println("before: collar size is "
                    + d.getCollar().getCollarSize() );
    try{
      ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(
      "serialization/instanceReferenceTransient/dog.ser"));
      os.writeObject(d);
      os.colse();
    }catch(Exception e){e.printStackTrace();}
    try{
      ObjectInputStream is = new ObjectInputStream(new FileInputStream(
      "serialization/instanceReferenceTransient/dog.ser"));
      d = (Dog) is.readObject();
      is.close();
    }catch(Exception e){e.printStackTrace();}

    System.out.println("after: collar size is" + d.getCollar().getCollarSize());
  }
}
