import java.sql.*;

public class myClass {
    public static void main(String[] args) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/fsae01","root","1870");
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("select * from ogrenciler");
            rs.next();
            System.out.println();
            System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getInt(4));

            conn.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
