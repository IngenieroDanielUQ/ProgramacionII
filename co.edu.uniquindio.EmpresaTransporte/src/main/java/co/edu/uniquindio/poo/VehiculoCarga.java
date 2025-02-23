package co.edu.uniquindio.poo;

public class VehiculoCarga extends Vehiculo {
    //atributos de la clase
    private double capacidadCarga;
    private int numeroEjes;

    //super constructor que contiene los atributos de la clase padre @Vehiculo
    //y los atributos propios de la clase hija, en este caso, vehiculoCarga

    public VehiculoCarga(String placa, String modelo, String marca, String color, String numeroChasis, double capacidadCarga, int numeroEjes) {
        super(placa, modelo, marca, color, numeroChasis);
        this.capacidadCarga = capacidadCarga;
        this.numeroEjes = numeroEjes;
    }

    //getters and setters
    public double getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(double capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    public int getNumeroEjes() {
        return numeroEjes;
    }

    public void setNumeroEjes(int numeroEjes) {
        this.numeroEjes = numeroEjes;
    }

    //metodo para un representación más significativa del obejto, en forma de cadena
    @Override
    public String toString() {
        return "VehiculoCarga [capacidadCarga=" + capacidadCarga + ", numeroEjes=" + numeroEjes + "]";
    }
}