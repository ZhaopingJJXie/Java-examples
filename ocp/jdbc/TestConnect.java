package ocp.jdbc;
import java.sql.*;

public class TestConnect{
  public static void main(String[] args) throws SQLException {
    try(
     Connection conn = DriverManager.getConnection("jdbc:derby:zoo");
     Statement stmt = conn.createStatement();
     ResultSet rs = stmt.executeQuery("select name from animal")){
       System.out.println(conn);
     while (rs.next()) System.out.println(rs.getString(1));
}
     // Connection conn = DriverManager.getConnection(
// "jdbc:postgresql://localhost:5432/ocp-book", "username",
// "password");

}
}
