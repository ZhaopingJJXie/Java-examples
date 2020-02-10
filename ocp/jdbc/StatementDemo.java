package ocp.jdbc;

import java.sql.*;

public class StatementDemo{
  public static void main(String[] args) {
    String url = "jdbc:derby:precipitation";
try (Connection conn = DriverManager.getConnection(url);
   Statement stmt = conn.createStatement(
       ResultSet.CONCUR_READ_ONLY,
       ResultSet.TYPE_SCROLL_INSENSITIVE);
   Boolean b = stmt.execute(       "select total from precip where type = 'rain'")) {
   System.out.println(rs.getString("total"));
}
  }
}
