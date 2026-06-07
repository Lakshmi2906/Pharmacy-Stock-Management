import java.sql.Connection;
import java.sql.DriverManager;
public class DBConnection {
    public static Connection getConnection() {
        Connection con = null;
        try {
            String url = "jdbc:mysql://localhost:3306/pharmacydb";
            String user = "YOUR_LOCALHOST_USERNAME";
            String password = "YOUR_LOCALHOST_PASSWORD";
            con = DriverManager.getConnection(url,user,password);

        } catch(Exception e) {
            System.out.println(e);
        }
        return con;
    }
}
