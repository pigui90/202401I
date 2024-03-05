import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Variables
        int lado;
        int altura;
        int base;
        int opcion;
        int area;
        boolean flag = true;
        // Variable Scanner que sirve para leer valores desde la consola
        Scanner scanner = new Scanner(System.in);
        while (flag == true) {// Esto significa que lo haga mientras true == true
            System.out
                    .println(
                            "Digite la figura a la que le quiere calcular el area: \n1-Cuadrado \n2-Triangulo \n3-Rectangulo \n4-Salir");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:// En caso de que sea cuadrado
                    System.out.println("Digite la medida del lado del cuadrado");
                    lado = scanner.nextInt();
                    area = lado * lado;
                    System.out.println("El area del cuadrado es " + area);
                    break;
                case 2:
                    System.out.println("Digite la medida de la base del triangulo");
                    base = scanner.nextInt();
                    System.out.println("Digite la medida de la altura del triangulo");
                    altura = scanner.nextInt();
                    System.out.println("El area del triangulo es " + ((base * altura) / 2));
                    break;
                case 3:
                    System.out.println("Digite la medida de la base del rectangulo");
                    base = scanner.nextInt();
                    System.out.println("Digite la medida de la altura del rectangulo");
                    altura = scanner.nextInt();
                    System.out.println("El area del rectangulo es " + (base * altura));
                    break;
                case 4:
                    flag = false;
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        }

        System.out.println("Fin del programa");
        scanner.close();

    }
}
