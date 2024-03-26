package service;

import java.util.Scanner;

import model.Cliente;
import model.Cuenta;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        Cliente cliente = new Cliente();
        Cuenta cuenta = new Cuenta();

        String nombreCliente;
        int aniosCliente;
        Boolean tieneTarjetaCliente;

        int numeroCuenta;
        double montoTotalCuenta;

        int opcion;
        do {

            String menu = "1. Ingresar Cliente\n2. Ingresar Cuenta\n3. Mostrar datos\n4. Salir";
            System.out.println(menu);
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ingresar nombre");
                    nombreCliente = scanner.next();
                    System.out.println("Indicar si tiene tarjeta true/false");
                    tieneTarjetaCliente = scanner.nextBoolean();
                    System.out.println("Ingresar años");
                    aniosCliente = scanner.nextInt();
                    cliente.setAnios(aniosCliente);
                    cliente.setNombre(nombreCliente);
                    cliente.setTieneTarjeta(tieneTarjetaCliente);
                    break;
                case 2:
                    System.out.println("Ingresar numero de cuenta");
                    numeroCuenta = scanner.nextInt();
                    System.out.println("Ingresar monto total");
                    montoTotalCuenta = scanner.nextDouble();
                    cuenta.setCliente(cliente);
                    cuenta.setMontoTotal(montoTotalCuenta);
                    cuenta.setNumeroCuenta(numeroCuenta);
                    break;
                case 3:
                    System.out.println(cuenta.mostrarDatos());
                    break;
                case 4:

                    break;
                default:
                    break;
            }
        } while (opcion != 4);
    }
}
