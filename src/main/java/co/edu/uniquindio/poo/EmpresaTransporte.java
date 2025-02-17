package co.edu.uniquindio.poo;

import java.util.ArrayList;
import java.util.List;

public class EmpresaTransporte {

    // atributos y creacion de listas
    private String nombre;
    List<Propietario> listaPropietarios = new ArrayList<>();
    List<VehiculoCarga> listaVehiculoCarga = new ArrayList<>();
    List<VehiculoTransporte> listaTransporte = new ArrayList<>();

    // constructor vacio
    public EmpresaTransporte() {
    }

    // constructor
    public EmpresaTransporte(String nombre, List<Propietario> listaPropietarios, List<VehiculoCarga> listaVehiculoCarga,
            List<VehiculoTransporte> listaTransporte) {
        this.nombre = nombre;
        this.listaPropietarios = listaPropietarios;
        this.listaVehiculoCarga = listaVehiculoCarga;
        this.listaTransporte = listaTransporte;
    }

    // getters and setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Propietario> getListaPropietarios() {
        return listaPropietarios;
    }

    public void setListaPropietarios(List<Propietario> listaPropietarios) {
        this.listaPropietarios = listaPropietarios;
    }

    public List<VehiculoCarga> getListaVehiculoCarga() {
        return listaVehiculoCarga;
    }

    public void setListaVehiculoCarga(List<VehiculoCarga> listaVehiculoCarga) {
        this.listaVehiculoCarga = listaVehiculoCarga;
    }

    public List<VehiculoTransporte> getListaTransporte() {
        return listaTransporte;
    }

    public void setListaTransporte(List<VehiculoTransporte> listaTransporte) {
        this.listaTransporte = listaTransporte;
    }

    @Override
    public String toString() {
        return "EmpresaTransporte [nombre=" + nombre + ", listaPropietarios=" + listaPropietarios
                + ", listaVehiculoCarga=" + listaVehiculoCarga + ", listaTransporte=" + listaTransporte + "]";
    }

}