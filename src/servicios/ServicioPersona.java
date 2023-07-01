package servicios;

import entidades.Persona;
import java.util.InputMismatchException;
import java.util.Scanner;

//formula IMC  IMC = Peso (Kg) / Estatura al cuadrado (Mt)

public class ServicioPersona {

    private Scanner leer = new Scanner(System.in);

    public Persona crearPersona() {

        System.out.println("ingrese nombre");
        String nombre = leer.next();

        Scanner scanner = new Scanner(System.in);
        int sexo;

        OUTER:
        for (;;) {
            System.out.println("Menú de Sexo");
            System.out.println("1. Masculino");
            System.out.println("2. Femenino");
            System.out.println("3. Salir");
            System.out.print("Ingrese una opción: ");
            sexo = scanner.nextInt();
            switch (sexo) {
                case 1:
                    System.out.println("Ha seleccionado Masculino.");
                    break;
                case 2:
                    System.out.println("Ha seleccionado Femenino.");
                    break;
                case 3:
                    System.out.println("Gracias, continuemos");
                    break OUTER; // Salir del bucle for
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
                    break;
            }
            System.out.println();
        }
      
        System.out.println("ingrese edad");
        int edad = leer.nextInt();

        System.out.println("ingrese peso");
        double peso = leer.nextDouble();

        System.out.println("ingrese altura");
        double altura = leer.nextDouble();

        return new Persona(nombre, sexo, edad, peso, altura);

    }

    
    
    
    
}