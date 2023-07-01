package ejercicio_7_globant;
        
import entidades.Persona;
import servicios.ServicioPersona;


public class Ejercicio_7_globant {

   
    public static void main(String[] args) {
        
        ServicioPersona sp = new ServicioPersona();
        Persona p1 = sp.crearPersona();
        System.out.println("Ingrese nueva persona");
        Persona p2 = sp.crearPersona();
        
        System.out.println( p1.getNombre() + " Su IMC es: " + p1.CalcularIMC());
        System.out.print("su IMC es: " + p2.CalcularIMC());
        
        
        System.out.println(p1.esMayorDeEdad());
        System.out.println(p1.toString());
        
    }
    
}