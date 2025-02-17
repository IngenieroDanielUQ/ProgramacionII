package co.edu.uniquindio.poo;

public class VehiculoTransporte extends Vehiculo {
    // atributos de la clase
    private int maximoPasajeros;
    private int pasajerosTransportados;

    public VehiculoTransporte(){}
    
    // super constructor que contiene los atributos de la clase padre @Vehiculo
    // y los atributos propios de la clase hija, en este caso, vehiculoTransporte
    public VehiculoTransporte(String placa, String modelo, String marca, String color, String numeroChasis,
            int maximoPasajeros, int pasajerosTransportados) {
        super(placa, modelo, marca, color, numeroChasis);
        this.maximoPasajeros = maximoPasajeros;
        this.pasajerosTransportados = pasajerosTransportados;
    }

    // getters and setters
    public int getMaximoPasajeros() {
        return maximoPasajeros;
    }

    public void setMaximoPasajeros(int maximoPasajeros) {
        this.maximoPasajeros = maximoPasajeros;
    }

    public int getPasajerosTransportados() {
        return pasajerosTransportados;
    }

    public void setPasajerosTransportados(int pasajerosTransportados) {
        this.pasajerosTransportados = pasajerosTransportados;
    }

    // metodo para un representación más significativa del objeto, en forma de
    // cadena
    @Override
    public String toString() {
        return "VehiculoTransporte [maximoPasajeros=" + maximoPasajeros + "]";
    }

}
