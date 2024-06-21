
package model;

public class StockIn {
    private int id;
    private String product;
    private int quantity;
    private int unityPrice;
    private int total;
    private String date;

    public StockIn() {
    }

    public StockIn(int id, String product, int quantity, int unityPrice, int total, String date) {
        this.id = id;
        this.product = product;
        this.quantity = quantity;
        this.unityPrice = unityPrice;
        this.total = total;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getUnityPrice() {
        return unityPrice;
    }

    public void setUnityPrice(int unityPrice) {
        this.unityPrice = unityPrice;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    
    
    
}
