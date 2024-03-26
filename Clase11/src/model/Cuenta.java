package model;

public class Cuenta {
    int numeroCuenta;
    double montoTotal;
    Cliente cliente;

    public Cuenta() {
    }

    public Cuenta(int numeroCuenta, double montoTotal, Cliente cliente) {
        this.numeroCuenta = numeroCuenta;
        this.montoTotal = montoTotal;
        this.cliente = cliente;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(double montoTotal) {
        this.montoTotal = montoTotal;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String mostrarDatos() {
        return "El numero de cuenta es: " + this.getNumeroCuenta() + "\n" 
        + "El monto total de la cuenta es: " + this.getMontoTotal() +"\n" 
        + "El nombre del cliente es: " + this.getCliente().mostrarDatos();
    }

}
