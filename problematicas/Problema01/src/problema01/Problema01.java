/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema01;

import java.util.Scanner;

/**
 *
 * @author darav
 */
public class Problema01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        
        String nombre;
        String posicion;
        String cadena = "";
        String listado_edad = "";
        int edad;
        int iteracion;
        float promedio_edad;
        float promedio_estatura;
        float estatura;
        float suma_edad = 0;
        float suma_estatura = 0;
        
        System.out.println("Ingrese el numero de jugadores:");
        iteracion =  entrada.nextInt();
        
        for (int i = 1; i <= iteracion; i++) {
            
            entrada.nextLine();
            System.out.println("Ingrese el nombre del jugador:");
            nombre = entrada.nextLine();
            System.out.println("Ingrese la posicion del jugador:");
            posicion = entrada.nextLine();
            System.out.println("Ingrese la edad del jugador:");
            edad = entrada.nextInt();
            System.out.println("Ingrese la estatura del jugador:");
            estatura = entrada.nextFloat();
            
            cadena = cadena + i + "." + nombre + "-" + posicion 
                    + "-, edad " + edad + ", estatura" + estatura + "\n";
            listado_edad = listado_edad + " " + edad;
            suma_edad = suma_edad + edad;
            suma_estatura = suma_estatura + estatura;
        }
        
        promedio_edad = suma_edad / iteracion ;
        promedio_estatura = suma_estatura / iteracion;
        
        System.out.printf("Listado de jugadores\n\n%s", cadena);
        System.out.printf("Listado de edades %s\n", listado_edad);
        System.out.printf("Promedio de edades: %.2f\n", promedio_edad);
        System.out.printf("Promedio de estaturas: %.2f\n", promedio_estatura);
        

        
    }
    
}
