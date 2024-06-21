package doa;

import java.sql.*;
import model.Product;

public class ProductDao {

    private String jdbcURL = "jdbc:mysql://localhost/stock_managment_system_db";
    private String user = "root";

    public Integer register(Product pObj) {
        try {
            Connection connection = DriverManager.getConnection(jdbcURL, user, "");
            String sql = "INSERT INTO product(name, category, brand) VALUES (?, ?, ?)";
            PreparedStatement pst = connection.prepareStatement(sql);

            pst.setString(1, pObj.getName());
            pst.setString(2, pObj.getCategory());
            pst.setString(3, pObj.getBrand());

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
            String sql = "SELECT * FROM product";
            PreparedStatement pst = connection.prepareStatement(sql);

            ResultSet rs = pst.executeQuery();
            return rs;

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public Integer update(Product pObj) {
        try {
            Connection connection = DriverManager.getConnection(jdbcURL, user, "");
            String sql = "UPDATE product SET name = ?, category = ?, brand = ? WHERE id = ?";
            PreparedStatement pst = connection.prepareStatement(sql);

            pst.setString(1, pObj.getName());
            pst.setString(2, pObj.getCategory());
            pst.setString(3, pObj.getBrand());
            pst.setInt(4, pObj.getId());

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
            String sql = "DELETE FROM product WHERE id = ?";
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
            String sql = "SELECT * FROM product WHERE name LIKE ?";
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
