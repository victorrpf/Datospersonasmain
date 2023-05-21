package datospersonasmain;

import java.util.Scanner;

public class Datos {
    
    String nombre;
    String apellido1;
    int edad;
    
    public Datos () {   
    }
    
    public void mostrarPersona() {
        System.out.println(this.nombre + " " + this.apellido1 + " " + this.edad);
    }
    
    public void configPersona () {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce el nombre: ");
        this.nombre = in.nextLine();
        System.out.println("Introduce el apellido: ");
        this.apellido1 = in.nextLine();
        System.out.println("Introduce la edad: ");
        this.edad = in.nextInt();
    }
    
    public int calcularEdad (Datos persona){
        return Math.abs(this.edad-persona.edad);
    }
    
    public void mayorEdad (Datos persona) {
        if (this.edad<persona.edad) {
            persona.mostrarPersona();
        }else if (this.edad==persona.edad) {
            System.out.println("\nLas dos personas tienen la misma edad");
        }else {
            this.mostrarPersona();
        }            
    }
}

