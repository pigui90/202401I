package service;

import java.util.Scanner;

import model.TipoTarifa;
import model.TipoTransporte;
import model.Transporte;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        Transporte transporte;
        TipoTarifa tipoTarifa;
        TipoTransporte tipoTransporte;
        String placa;
        int capacidad;
        int tarifa;
        String descripcion;
        int opcion = 0;
        do {
            String menu = "1. Ingresar Transportes\n2. Salir\nIndique una opcion:";
            System.out.println(menu);
            opcion = scan.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Digite su numero de placa");
                    placa = scan.next();

                    System.out.println("Digite la tarifa del transporte");
                    tarifa = scan.nextInt();

                    System.out.println("Digite el Tipo de Tarifa");
                    descripcion = scan.next();
                    tipoTarifa = new TipoTarifa(descripcion);

                    System.out.println("Digite el Tipo de Transporte");
                    descripcion = scan.next();
                    tipoTransporte = new TipoTransporte(descripcion);

                    System.out.println("Digite la capacidad del transporte");
                    capacidad = scan.nextInt();

                    transporte = new Transporte(placa, tarifa, tipoTarifa, tipoTransporte, capacidad);

                    System.out.println(transporte.mostrarDatos());
                    System.out.println("La ganancia maxima es: " + transporte.calcularGananciaMaxima());
                    break;
                case 2:
                    System.out.println("Gracias por participar");
                    break;
                default:
                    break;
            }

        } while (opcion != 2);

    }

}
