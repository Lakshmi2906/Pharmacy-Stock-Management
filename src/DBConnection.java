import java.sql.Connection;
import java.sql.DriverManager;
public class DBConnection {
    public static Connection getConnection() {
        Connection con = null;
        try {
            String url = "jdbc:mysql://localhost:3306/pharmacydb";
            String user = "root";
            String password = "root@123";
            con = DriverManager.getConnection(url,user,password);

        } catch(Exception e) {
            System.out.println(e);
        }
        return con;
    }
}