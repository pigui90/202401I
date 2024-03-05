import java.util.Scanner;

import model.Ejercicio;

public class App {
    public static void main(String[] args) throws Exception {

        Ejercicio ejercicio = new Ejercicio();

        Scanner scan = new Scanner(System.in);
        int opcion;
        int opc;
        boolean indicador = true;
        while (indicador) {
            System.out.println(
                    "Escoja el ejercicio del examen\n1-Ejercicio 1\n2-Ejercicio 2\n3-Ejercicio 3\n4-Ejercicio 4");
            opcion = scan.nextInt();
            switch (opcion) {
                case 1:
                    ejercicio.calculoAreas();
                    break;
                case 2:
                    do {
                        System.out.println("Digite un numero entre el 1 y el 3");
                        opc = scan.nextInt();
                    } while (opc < 1 || opc > 3);

                    ejercicio.mensajesSegunRango(opc);
                    break;
                case 3:
                    ejercicio.pedirNombre();

                    break;
                case 4:
                    if (ejercicio.pasoEstudiante()) {// if (ejercicio.pasoEstudiante() == true)
                        System.out.println("PASO EL CURSO, FELICIDADES DE NUEVO");
                    }
                    break;
                default:
                    break;
            }

        }
        scan.close();
    }
}
