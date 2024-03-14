package model;

public class Persona {
    String nombre;
    String lugarResidencia;
    String estadoCivil;
    String nacionalidad;
    int edad;
    int cedula;

    public Persona(){
        this.nombre = "";
        this.lugarResidencia = "";
        this.edad = 0;
        this.estadoCivil = "";
        this.nacionalidad = "";
        this.cedula = 0;
    }

    public Persona(String nombre, String lugarResidencia, String estadoCivil, String nacionalidad, int edad, int cedula){
        this.nombre = nombre;
        this.lugarResidencia = lugarResidencia;
        this.cedula = cedula;
        this.estadoCivil = estadoCivil;
        this.nacionalidad = nacionalidad;
        this.edad = edad;
    }

    public String getNombre(){
        return this.nombre;
        
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getLugarResidencia() {
        return lugarResidencia;
    }

    public void setLugarResidencia(String lugarResidencia) {
        this.lugarResidencia = lugarResidencia;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    
}
