import java.util.Scanner;

import model.Persona;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Persona persona = new Persona();
        
        String nombre;
        String lugarResidencia;
        String estadoCivil;
        String nacionalidad;
        int edad; 
        int cedula;

    
        System.out.println("Digite su nombre");
        nombre = scanner.nextLine();
        System.out.println("Digite su lugar de Residencia");
        lugarResidencia = scanner.nextLine();
        System.out.println("Digite su estado civil");
        estadoCivil = scanner.nextLine();
        System.out.println("Digite su nacionalidad");
        nacionalidad = scanner.nextLine();

        System.out.println("Digite su edad");
        edad = scanner.nextInt();
        System.out.println("Digite su cedula");
        cedula = scanner.nextInt();

        //persona = new Persona(nombre, lugarResidencia, estadoCivil, nacionalidad, edad, cedula);
        persona = new Persona();
        persona.setCedula(cedula);
        persona.setEdad(edad);
        persona.setEstadoCivil(estadoCivil);
        persona.setLugarResidencia(lugarResidencia);
        persona.setNacionalidad(nacionalidad);
        persona.setNombre(nombre);
        System.out.println("Hola: " + persona.getNombre()+ " Se que vives en " + persona.getLugarResidencia() + "Su estado civil es: " + persona.getEstadoCivil() + "Su edad segun indico es: " + persona.getEdad());

        System.out.println("Digite su edad");
        edad = scanner.nextInt();

        System.out.println("Hola: " + persona.getNombre()+ "\n Se que vives en " + persona.getLugarResidencia() + "\nSu estado civil es: " + persona.getEstadoCivil() + "\nSu edad segun indico es: " + persona.getEdad());


        scanner.close();


    }
}
