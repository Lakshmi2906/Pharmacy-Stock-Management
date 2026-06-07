import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Inventory {

    public void addMedicine(Medicine m) {

        try {

            Connection con = DBConnection.getConnection();

            String sql = "INSERT INTO medicine VALUES(?,?,?,?,?)";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, m.getId());
            ps.setString(2, m.getName());
            ps.setInt(3, m.getQty());
            ps.setDouble(4, m.getPrice());
            ps.setString(5, m.getExpiry());

            ps.executeUpdate();

            System.out.println("Medicine Added Successfully");

        } 
        catch(Exception e) {
            System.out.println(e);
        }
    }

    public void updateStock(int id,int nqty) {

        try {

            Connection con = DBConnection.getConnection();

            String sql = "UPDATE medicine SET quantity=? WHERE id=?";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1,nqty);
            ps.setInt(2,id);

            int rows = ps.executeUpdate();

            if(rows>0)
                System.out.println("Stock Updated Successfully");
            else
                System.out.println("Medicine Not Found");

        }
        catch(Exception e){
            System.out.println(e);
        }
    }

    public void showAll() {

        try {

            Connection con = DBConnection.getConnection();

            Statement st = con.createStatement();

            ResultSet rs = st.executeQuery("SELECT * FROM medicine");

            while(rs.next()) {

                System.out.println(
                        "Medicine[ID = "+rs.getInt("id")+
                        ", Name = "+rs.getString("name")+
                        ", Qty = "+rs.getInt("quantity")+
                        ", Price = "+rs.getDouble("price")+
                        ", Expiry = "+rs.getString("expiry")+"]"
                );
            }

        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}