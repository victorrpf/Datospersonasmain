package datospersonasmain;

import java.util.Scanner;

public class Datospersonasmain {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int opcion;
        Datos persona1 = null;
        Datos persona2 = null;
        
        do {
            System.out.println("-----MENU-----");
            System.out.println("1) Ingresar nueva persona.");
            System.out.println("2) Mostrar personas.");
            System.out.println("3) Calcular diferencia de edad.");
            System.out.println("4) Mostrar persona de mayor edad.");
            System.out.println("5) Borrar personas.");
            System.out.println("6) Salir");
            do {
                System.out.println("Elige una opción del Menu: ");
                opcion = in.nextInt();
                switch (opcion) {
                    case 1:
                        if (persona1 == null) {
                            persona1 = new Datos();
                            persona1.configPersona();
                        } else {
                            if (persona2 == null) {
                                persona2 = new Datos();
                                persona2.configPersona();
                            } else {
                                System.out.println("\nYa hay dos personas creadas.");
                            }
                        }
                        break;
                    case 2:
                        if (persona1 == null && persona2 == null)
                            System.out.println("\nNo existen personas creadas.");   
                        else {
                            if (persona1 != null)
                                persona1.mostrarPersona();
                            if (persona2 != null)
                                persona2.mostrarPersona();
                            }
                        break;
                    case 3:
                        if (persona1!= null && persona2 != null)
                            System.out.println("\n"+persona1.calcularEdad(persona2));
                        else
                            System.out.println("\nNo se han creado dos personas.");
                        break;
                    case 4:
                        if (persona1 != null && persona2 != null) {
                            persona1.mayorEdad(persona2);
                        } else {
                            System.out.println("\nNo se han creado personas.");
                        }
                            
                        break;
                    case 5:
                        persona1 = null;
                        persona2 = null;
                        System.out.println("\nPersonas borradas.");
                        break;
                    case 6:
                        System.out.println("\nHasta la próxima");
                        break;
                    default:
                        break;
                }        
            }while (opcion<1 || opcion>6);         
        }while(opcion!=6);      
    }    
}
