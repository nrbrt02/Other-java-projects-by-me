package doa;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import model.StockIn;
import model.StockOut;


public class StockOutDoa {
private String jdbcURL = "jdbc:mysql://localhost/stock_managment_system_db";
    private String user = "root";

    public Integer register(StockOut pObj) {
        try {
            Connection connection = DriverManager.getConnection(jdbcURL, user, "");
            String sql = "INSERT INTO stockout(product, quantity, unityPrice, total, date) VALUES (?, ?, ?, ?, ?)";
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
            String sql = "SELECT * FROM stockout";
            PreparedStatement pst = connection.prepareStatement(sql);

            ResultSet rs = pst.executeQuery();
            return rs;

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public Integer update(StockOut pObj) {
        try {
            Connection connection = DriverManager.getConnection(jdbcURL, user, "");
            String sql = "UPDATE stockout SET product = ?, quantity = ?, unityPrice = ?, total = ?, date = ?  WHERE id = ?";
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

        public Integer updateIn(StockIn pObj) {
        try {
            Connection connection = DriverManager.getConnection(jdbcURL, user, "");
            String sql = "UPDATE stockin SET quantity = ?, total = ?  WHERE id = ?";
            PreparedStatement pst = connection.prepareStatement(sql);

            pst.setInt(1, pObj.getQuantity());
            pst.setInt(2, pObj.getTotal());
            pst.setInt(3, pObj.getId());

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
            String sql = "DELETE FROM stockout WHERE id = ?";
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
            String sql = "SELECT * FROM stockout WHERE product LIKE ?";
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
