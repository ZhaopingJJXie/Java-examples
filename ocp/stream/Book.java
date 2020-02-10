package ocp.stream;
import java.util.stream.*;
import java.util.*;
public class Book{
  String isbn;
  String title;

  public Book(String isbn, String title){
    this.isbn = isbn;
    this.title = title;
   }

   public  String getIsbn(){return isbn;}
public static List<Book> getBooksByAuthor(String title){
  List<Book> al = new ArrayList<>();
  al.add(new Book("123", "Big Bang"));
  return al;
  }
    public static void main(String[] args) {
    List<Book> books = getBooksByAuthor("Ludlum");
    books.stream().sorted().forEach(b->System.out.println(b.getIsbn()));}
  }
