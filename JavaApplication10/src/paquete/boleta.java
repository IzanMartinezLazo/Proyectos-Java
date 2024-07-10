
package paquete;


public class boleta {
    String rutcliente;
    double totalventa;

    public boleta(String rutcliente, double totalventa) {
        this.rutcliente = rutcliente;
        this.totalventa = totalventa;
    }

    public String getRutcliente() {
        return rutcliente;
    }

    public double getTotalventa() {
        return totalventa;
    }

    public void setRutcliente(String rutcliente) {
        this.rutcliente = rutcliente;
    }

    public void setTotalventa(double totalventa) {
        this.totalventa = totalventa;
    }
    
}
