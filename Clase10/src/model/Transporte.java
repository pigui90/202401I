package model;

public class Transporte {
    private String placa;
    private int tarifa;
    private TipoTarifa tipoTarifa;
    private TipoTransporte tipoTransporte;
    private int capacidad;

    public Transporte() {
    }

    public Transporte(String placa, int tarifa, TipoTarifa tipoTarifa, TipoTransporte tipoTransporte,
            int capacidad) {
        this.placa = placa;
        this.tarifa = tarifa;
        this.tipoTarifa = tipoTarifa;
        this.tipoTransporte = tipoTransporte;
        this.capacidad = capacidad;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getTarifa() {
        return tarifa;
    }

    public void setTarifa(int tarifa) {
        this.tarifa = tarifa;
    }

    public TipoTarifa getTipoTarifa() {
        return tipoTarifa;
    }

    public void setTipoTarifa(TipoTarifa tipoTarifa) {
        this.tipoTarifa = tipoTarifa;
    }

    public TipoTransporte getTipoTransporte() {
        return tipoTransporte;
    }

    public void setTipoTrasnporte(TipoTransporte tipoTransporte) {
        this.tipoTransporte = tipoTransporte;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public String mostrarDatos() {
        return "La placa es: " + getPlaca() + "\nEl tipo de Tarifa es: " + getTipoTarifa().getDescripcion()
                + "\nLa tarifa es: " + getTarifa() + "\nEl tipo de Transporte es: " + getTipoTransporte().getDescripcion()
                + "\nLa capacidad es: " + getCapacidad();
    }

    public int calcularGananciaMaxima(){
        return getTarifa() * getCapacidad();
    }

}
