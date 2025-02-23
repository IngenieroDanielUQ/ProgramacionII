package co.edu.uniquindio.creacion;

import java.util.Scanner;

public class Main {
    //Creacion de una calculadora
    //autor: Hector Daniel Gonzalez Sanchez
    //Pull

    public static void main(String[] args) {

        Scanner Scanner = new Scanner(System.in);

        System.out.println("Ingrese el primer operando: ");
        double operando1 = Scanner.nextDouble();

        System.out.println("Ingrese el segundo operando: ");
        double operando2 = Scanner.nextDouble();

        System.out.println("Que operacion desea realizar: "
                + "\n" + "1- Suma"
                + "\n" + "2- Resta"
                + "\n" + "3- Multiplicacion"
                + "\n" + "4- Division");
        int operacion = Scanner.nextInt();

        switch (operacion) {
            case 1:
                System.out.println("Resultado: " + suma(operando1, operando2));
                break;
            case 2:
                System.out.println("Resultado: " + resta(operando1, operando2));
                break;
            case 3:
                System.out.println("Resultado: " + multiplicar(operando1, operando2));
                break;
            case 4:
                System.out.println("Resultado: " + dividir(operando1, operando2));

        }
    }

    private static double suma(double operando1, double operando2) {
        return operando1 + operando2;
    }

    private static double resta(double operando1, double operando2) {
        return operando1 - operando2;
    }

    private static double multiplicar(double operando1, double operando2) {
        return operando1 * operando2;
    }

    private static double dividir(double operando1, double operando2) {
        return operando1 / operando2;
    }
}