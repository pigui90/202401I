package model;

public class TipoTarifa {
    private String descripcion;

    public TipoTarifa(){

    }
    public TipoTarifa(String descripcion){
        this.descripcion = descripcion;
    }

    public String getDescripcion(){
        return this.descripcion;
    }

    public void setDescripcion(String descripcion){
        this.descripcion = descripcion;
    }
}
