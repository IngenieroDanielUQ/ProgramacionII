package co.edu.uniquindio.poo;

import java.util.Scanner;

/**
 * Ejercicios de Repaso
 * autor: Hector Daniel Gonzalez Sanchez
 *
 */
public class Main {
    public static void main(String[] args) {

        // Ejercicio 1
        EmpresaTransporte empresaTransporte = inicializarDatos();
        int totalPropietarios = obtenerNumeroPropietarios(empresaTransporte);
        String datosPropietarios = obtenerDatosPropietarios(empresaTransporte);
        System.out.println(totalPropietarios + "\n" + datosPropietarios + "\n");

        // Ejercicio 2
        Scanner scanner = new Scanner(System.in);
        EmpresaTransporte empresa = new EmpresaTransporte();

        System.out.println("Ingrese el nombre del propietario:");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese la cédula del propietario:");
        String cedula = scanner.nextLine();
        System.out.println("Ingrese el email del propietario:");
        String email = scanner.nextLine();
        System.out.println("Ingrese la edad del propietario:");
        String edad = scanner.nextLine();
        System.out.println("Ingrese el celular del propietario:");
        String celular = scanner.nextLine();
        Propietario propietario = new Propietario(nombre, cedula, email, edad, celular);
        empresa.listaPropietarios.add(propietario);

        System.out.println("\n" + "Ingrese la opcion del tipo de vehiculo que quiere registrar");
        System.out.println("1 - Vehiculo de carga" + "\n" + "2 - Vehiculo de transporte" + "\n");
        int opcion = scanner.nextInt();
        scanner.nextLine();

        // Se declaran las variables antes del switch case parea reutilizarlas
        String placa, modelo, marca, color, numeroChasis;
        int capacidadCarga, numeroEjes;

        switch (opcion) {
            case 1:
                System.out.println("\n" + "Ingrese la placa del vehiculo:");
                placa = scanner.nextLine();
                System.out.println("Ingrese el modelo del vehiculo:");
                modelo = scanner.nextLine();
                System.out.println("Ingrese la marca del vehiculo:");
                marca = scanner.nextLine();
                System.out.println("Ingrese el color del vehiculo:");
                color = scanner.nextLine();
                System.out.println("Ingrese el numero de chasis:");
                numeroChasis = scanner.nextLine();
                System.out.println("Ingrese la capacidad de carga del vehiculo:");
                capacidadCarga = scanner.nextInt();
                System.out.println("Ingrese el numero de Ejes:");
                numeroEjes = scanner.nextInt();

                VehiculoCarga vehiculoCarga = new VehiculoCarga(placa, modelo, marca, color, numeroChasis,
                        capacidadCarga, numeroEjes);
                empresa.listaVehiculoCarga.add(vehiculoCarga);

                break;

            case 2:
                System.out.println("Ingrese la placa del vehiculo:");
                placa = scanner.nextLine();
                System.out.println("Ingrese el modelo del vehiculo:");
                modelo = scanner.nextLine();
                System.out.println("Ingrese la marca del vehiculo:");
                marca = scanner.nextLine();
                System.out.println("Ingrese el color del vehiculo:");
                color = scanner.nextLine();
                System.out.println("Ingrese el numero de chasis:");
                numeroChasis = scanner.nextLine();
                System.out.println("Ingrese la capacidad maxima de pasajeros:");
                int maximoPasajeros = scanner.nextInt();
                scanner.nextLine();

                VehiculoTransporte vehiculoTransporte = new VehiculoTransporte(placa, modelo, marca, color,
                        numeroChasis, maximoPasajeros, maximoPasajeros);
                empresa.listaTransporte.add(vehiculoTransporte);

                break;
        }

        // Ejercicio 3
        int numeroPasajerosTransportados = obtenerPasajerosTransportados(empresaTransporte, "RGL484");
        System.out.println("Número de pasajeros transportados: " + numeroPasajerosTransportados);

    }

    private static EmpresaTransporte inicializarDatos() {

        // Datos pare el ejercicio 1
        EmpresaTransporte empresaTransporte = new EmpresaTransporte();
        empresaTransporte.setNombre("Tinto");
        Propietario propietario = new Propietario();
        propietario.setNombre("Daniel");
        Propietario propietario2 = new Propietario();
        propietario2.setNombre("Luis");
        empresaTransporte.getListaPropietarios().add(propietario);
        empresaTransporte.getListaPropietarios().add(propietario2);

        // Datos para el ejercicio 3
        VehiculoTransporte vehiculo1 = new VehiculoTransporte("RGL484", "null", "null", "null", "null", 0, 145);
        VehiculoTransporte vehiculo2 = new VehiculoTransporte("BMC94C", "null", "null", "null", "null", 0, 200);
        VehiculoTransporte vehiculo3 = new VehiculoTransporte("JHS789", "null", "null", "null", "null", 0, 1678);

        empresaTransporte.getListaTransporte().add(vehiculo1);
        empresaTransporte.getListaTransporte().add(vehiculo2);
        empresaTransporte.getListaTransporte().add(vehiculo3);

        return empresaTransporte;

    }

    private static String obtenerDatosPropietarios(EmpresaTransporte empresaTransporte) {
        String datosPropietarios = "";
        for (Propietario propietario : empresaTransporte.getListaPropietarios()) {
            datosPropietarios += propietario.getNombre() + "\n";
        }

        return datosPropietarios;
    }

    private static int obtenerNumeroPropietarios(EmpresaTransporte empresaTransporte) {
        return empresaTransporte.getListaPropietarios().size();
    }

    private static int obtenerPasajerosTransportados(EmpresaTransporte empresaTransporte, String placa) {
        int pasajerosTransportados = 0;
        for (VehiculoTransporte vehiculo : empresaTransporte.listaTransporte) {
            if (vehiculo.getPlaca().equals(placa)) {
                pasajerosTransportados += vehiculo.getPasajerosTransportados();
                return pasajerosTransportados;
            }
        }
        return pasajerosTransportados;
    }

}
