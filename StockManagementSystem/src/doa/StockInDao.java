package doa;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import model.StockIn;

public class StockInDao {

    private String jdbcURL = "jdbc:mysql://localhost/stock_managment_system_db";
    private String user = "root";

    public Integer register(StockIn pObj) {
        try {
            Connection connection = DriverManager.getConnection(jdbcURL, user, "");
            String sql = "INSERT INTO stockin(product, quantity, unityPrice, total, date) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement pst = connection.prepareStatement(sql);

            pst.setString(1, pObj.getProduct());
            pst.setInt(2, pObj.getQuantity());
            pst.setInt(3, pObj.getUnityPrice());
            pst.setInt(4, pObj.getTotal());
            pst.setString(5, pObj.getDate());

            Integer rowAffected = pst.executeUpdate();
            connection.close();
            return rowAffected;

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public ResultSet all() {
        try {
            Connection connection = DriverManager.getConnection(jdbcURL, user, "");
            String sql = "SELECT * FROM stockin WHERE quantity > 0";
            PreparedStatement pst = connection.prepareStatement(sql);

            ResultSet rs = pst.executeQuery();
            return rs;

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public Integer update(StockIn pObj) {
        try {
            Connection connection = DriverManager.getConnection(jdbcURL, user, "");
            String sql = "UPDATE stockin SET product = ?, quantity = ?, unityPrice = ?, total = ?, date = ?  WHERE id = ?";
            PreparedStatement pst = connection.prepareStatement(sql);

            pst.setString(1, pObj.getProduct());
            pst.setInt(2, pObj.getQuantity());
            pst.setInt(3, pObj.getUnityPrice());
            pst.setInt(4, pObj.getTotal());
            pst.setString(5, pObj.getDate());
            pst.setInt(6, pObj.getId());

            Integer rowAffected = pst.executeUpdate();
            connection.close();
            return rowAffected;

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public Integer delete(int theId) {
        try {
            Connection connection = DriverManager.getConnection(jdbcURL, user, "");
            String sql = "DELETE FROM stockin WHERE id = ?";
            PreparedStatement pst = connection.prepareStatement(sql);

            pst.setInt(1, theId);

            Integer rowAffected = pst.executeUpdate();
            connection.close();
            return rowAffected;

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public ResultSet search(String searchtxt) {
        try {
            Connection connection = DriverManager.getConnection(jdbcURL, user, "");
            String sql = "SELECT * FROM stockin WHERE product LIKE ?";
            PreparedStatement pst = connection.prepareStatement(sql);
            pst.setString(1, "%" + searchtxt + "%");

            ResultSet rs = pst.executeQuery();
            return rs;

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }
}
