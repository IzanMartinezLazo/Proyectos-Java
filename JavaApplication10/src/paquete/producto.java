
package paquete;


public class producto {
    String nomprod;
    int stock;
    double precioventa;

    public producto(String nomprod, int stock, double precioventa) {
        this.nomprod = nomprod;
        this.stock = stock;
        this.precioventa = precioventa;
    }

    public String getNomprod() {
        return nomprod;
    }

    public int getStock() {
        return stock;
    }

    public double getPrecioventa() {
        return precioventa;
    }

    public void setNomprod(String nomprod) {
        this.nomprod = nomprod;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void setPrecioventa(double precioventa) {
        this.precioventa = precioventa;
    }
    
    
    
}
