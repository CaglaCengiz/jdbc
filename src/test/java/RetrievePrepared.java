import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class RetrievePrepared {
    public static void main(String args[]){
        //prepareStatement: uygulama içinde bircok kez calıstırılacak sorgular için kullanılır
        try{
            // db parameters
            String url       = "jdbc:mysql://localhost:3306/fsae01";
            String user      = "root";
            String password  = "1870";

            // Class.forName("com.mysql.cj.jdbc.Driver");

            // create a connection to the database
            Connection con = DriverManager.getConnection(url, user, password);

            PreparedStatement stmt=con.prepareStatement("select * from ogrenciler where id=? and sinav_notu= ?");

            stmt.setInt(1,121);
            stmt.setInt(2,85);
            ResultSet rs=stmt.executeQuery();

            while(rs.next()){
                System.out.println(rs.getInt(1)+" "+rs.getString(2));
            }

            con.close();

        }catch(Exception e){ System.out.println(e);}

    }

}
