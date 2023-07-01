package entidades;

/**
 *
 * @author ACER1
 */
public class Persona {
    private String nombre;
    private int sexo;
    private int edad;
    private double peso;
    private double altura;
    
    public Persona(){
        
    }    
    
//    public void setNombre(String nombreCompleto){
//        this.nombre = nombreCompleto;
//    }
    
    public Persona(String nombre, int sexo, int edad, double peso, double altura){
        this.nombre = nombre;
        this.sexo = sexo;
        this.edad = edad;
        this.altura = altura;
        this.peso = peso;
    }

    

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSexo(int sexo) {
        this.sexo = sexo;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    

    public String getNombre() {
        return nombre;
    }

    public int getSexo() {
        return sexo;
    }

    public int getEdad() {
        return edad;
    }

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }
    
//    public double CalcularIMC() {
//        double pesoDoble = this.peso / (this.getAltura() * this.getAltura());
//        if (pesoDoble < 20) {
//            System.out.println("-1");
//            return -1;
//        } else {
//            if (pesoDoble >= 20 & pesoDoble <= 25) {
//                System.out.println("0 cero");
//                return 0;
//            } else {
//                if (pesoDoble > 25) {
//                    System.out.println("1 uno");
//                    return 1;
//                }
//            } break;
//        }
//        return  pesoDoble;
//     }   
       
    
    public double CalcularIMC() {
    double imc = this.peso / (this.getAltura() * this.getAltura());
    
    if (imc < 20) {
        System.out.println("-1");
        return -1;
    } else if (imc >= 20 && imc <= 25) {
        System.out.println("0 cero");
        return 0;
    } else if (imc > 25) {
        System.out.println("1 uno");
        return 1;
    } 
        return imc;
    
    
         
    
        
    
}

  
    public boolean esMayorDeEdad(){
        boolean mayorEdad = (this.edad >= 18);
        if (mayorEdad) {
            
        } else {
           
        }
        return true;
    }
    
    
 }
