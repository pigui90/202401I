package model;

import java.util.Date;
import java.util.Scanner;

public class Ejercicio {

    public void calculoAreas() {
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

    }

    public void mensajesSegunRango(int numero) {
        if (numero == 1) {
            System.out.println("Inicio de Semana");
        } else {
            if (numero == 2) {
                System.out.println("Todo es mejor entre 2");
            } else {
                if (numero == 3) {
                    System.out.println("Hasta aqui llego todo");
                }
            }
        }
    }

    public void pedirNombre() {
        Scanner sc = new Scanner(System.in);
        String nombre;
        String continuar = "SI";

        while (continuar.equals("SI")) {
            System.out.println("Digame un nombre");
            nombre = sc.nextLine();
            System.out.println("El nombre digitado fue " + nombre + " ¿Quiere mencionar a otra persona? \nSI\nNO");
            continuar = sc.nextLine();
        }

    }

    public Boolean pasoEstudiante() {
        int notaAcumulada = 0;
        int calificacion = 0;
        int intentos = 0;
        boolean paso = false;
        Scanner sca = new Scanner(System.in);

        do {
            
            System.out.println("Digite una calificacion");
            calificacion = sca.nextInt();
            intentos++;// intentos = intentos + 1;
            notaAcumulada = notaAcumulada + calificacion;
            if (notaAcumulada > 70) {
                System.out.println("Felicidades");
                paso = true;
                return Boolean.TRUE;   
                //intentos = 7;
            }
        } while (notaAcumulada <= 70 && intentos <= 6);// !paso

        if (paso == false) {
            if (notaAcumulada < 60) {
                System.out.println("Debe volver a llevar el curso");
                return Boolean.FALSE;
            } else {
                if (notaAcumulada >= 60 && notaAcumulada < 70) {
                    System.out.println("Tienes la oportunidad de ir a ampliación");
                    return Boolean.FALSE;
                }
            }
        }else{
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    public void calcularCuadradosNaturales(int numero){
        
        for (int i = 1; i <= numero; i++) {
            System.out.println("El cuadrado de " + i + " es: " + i*i);
        }
    }

    public void bonoDesempenioEmpleado(){
        Scanner scanner = new Scanner(System.in);
        Date fechaIngreso = new Date();
        double salarioTotal;
        int porcDesemp ;
        int aniosTrabajados;

        System.out.println("Digite su salario Total");
        salarioTotal = scanner.nextDouble();
        System.out.println("Digite su porcentaje evaluacion");
        porcDesemp = scanner.nextInt();
        System.out.println("Digite su años trabajados ");
        aniosTrabajados = scanner.nextInt();

        if(salarioTotal >= 100000 && porcDesemp > 80 ){
            salarioTotal = salarioTotal + (5000 * aniosTrabajados);
            System.out.println("Su salario Total es ahora " + salarioTotal);
        }else{
            if(salarioTotal < 100000 || fechaIngreso.getYear() < 2022){
                salarioTotal = salarioTotal + 15000;
                System.out.println("Su salario Total es ahora " + salarioTotal);
            }else{
                if(porcDesemp < 80){
                    System.out.println("no tiene bono");
                }
            }
        }
        
    }


}
