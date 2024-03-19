package model;

public class TipoTransporte {
    private String descripcion;

    public TipoTransporte(){

    }
    public TipoTransporte(String descripcion){
        this.descripcion = descripcion;
    }

    public String getDescripcion(){
        return this.descripcion;
    }

    public void setDescripcion(String descripcion){
        this.descripcion = descripcion;
    }
}
