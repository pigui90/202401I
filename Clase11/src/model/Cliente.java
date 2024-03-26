package model;

public class Cliente {
    String nombre;
    int anios;
    Boolean tieneTarjeta;

    public Cliente() {
    }

    public Cliente(String nombre, int anios, Boolean tieneTarjeta) {
        this.nombre = nombre;
        this.anios = anios;
        this.tieneTarjeta = tieneTarjeta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAnios() {
        return anios;
    }

    public void setAnios(int anios) {
        this.anios = anios;
    }

    public Boolean getTieneTarjeta() {
        return tieneTarjeta;
    }

    public void setTieneTarjeta(Boolean tieneTarjeta) {
        this.tieneTarjeta = tieneTarjeta;
    }

    public String mostrarDatos() {
        String respuesta = "NO";
        if(getTieneTarjeta()){
            respuesta = "SI";
        }
        return "El nombre del cliente es: " + this.getNombre() + "\n" 
        + "Los años del cliente son: " + this.getAnios()+ "\n" 
        + "¿Tiene tarjeta?: " + respuesta;
    }

}
