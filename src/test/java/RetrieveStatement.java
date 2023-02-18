import java.sql.*;
import java.sql.Statement;

public class RetrieveStatement {
    public RetrieveStatement() {
        // TODO Auto-generated constructor stub
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        try{

            // db parameters
            String url       = "jdbc:mysql://localhost:3306/fsae01";
            String user      = "root";
            String password  = "1870";

            // Class.forName("com.mysql.cj.jdbc.Driver");

            // create a connection to the database
            Connection con = DriverManager.getConnection(url, user, password);

            Statement stmt = con.createStatement();

            ResultSet rs = stmt.executeQuery("select * from ogrenciler");

            ResultSetMetaData rsmd=rs.getMetaData();
            System.out.println("Toplam kolon sayısı :" +rsmd.getColumnCount());
            System.out.println("ilk kolon adı:" +rsmd.getColumnName(1));
            System.out.println("ilk kolon veri tipi :" +rsmd.getColumnTypeName(1));

          /*  while(rs.next())
                System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+"  "+rs.getInt(4));
*/
            con.close();

        }catch(SQLException e){ System.out.println(e);}

    }

}
