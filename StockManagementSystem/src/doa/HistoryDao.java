package doa;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import model.History;


public class HistoryDao {
    private String jdbcURL = "jdbc:mysql://localhost/stock_managment_system_db";
    private String user = "root";

    public Integer register(History pObj) {
        try {
            Connection connection = DriverManager.getConnection(jdbcURL, user, "");
            String sql = "INSERT INTO history(product, quantity, unityPrice, total, date, action) VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement pst = connection.prepareStatement(sql);

            pst.setString(1, pObj.getProduct());
            pst.setInt(2, pObj.getQuantity());
            pst.setInt(3, pObj.getUnityPrice());
            pst.setInt(4, pObj.getTotal());
            pst.setString(5, pObj.getDate());
            pst.setString(6, pObj.getAction());

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
            String sql = "SELECT * FROM history ORDER BY id DESC";
            PreparedStatement pst = connection.prepareStatement(sql);

            ResultSet rs = pst.executeQuery();
            return rs;

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }


    public ResultSet search(String searchtxt) {
        try {
            Connection connection = DriverManager.getConnection(jdbcURL, user, "");
            String sql = "SELECT * FROM history WHERE product LIKE ? ORDER BY id DESC";
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
