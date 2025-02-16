package co.edu.uniquindio.poo;

public class VehiculoTransporte extends Vehiculo {
    // atributos de la clase
    private int maximoPasajeros;

    // super constructor que contiene los atributos de la clase padre @Vehiculo
    // y los atributos propios de la clase hija, en este caso, vehiculoCarga
    public VehiculoTransporte(String placa, String modelo, String marca, String color, String numeroChasis,
            int maximoPasajeros) {
        super(placa, modelo, marca, color, numeroChasis);
        this.maximoPasajeros = maximoPasajeros;
    }

    // getters and setters
    public int getMaximoPasajeros() {
        return maximoPasajeros;
    }

    public void setMaximoPasajeros(int maximoPasajeros) {
        this.maximoPasajeros = maximoPasajeros;
    }

    // metodo abstracto, heredado de Vehiculo
    @Override
    public void mostrarDetalles() {
        System.out.println("Vehiculo de trasnporte");
    }

    // metodo para un representación más significativa del objeto, en forma de cadena
    @Override
    public String toString() {
        return "VehiculoTransporte [maximoPasajeros=" + maximoPasajeros + "]";
    }

}
