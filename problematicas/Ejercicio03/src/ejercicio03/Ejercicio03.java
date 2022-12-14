/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio03;

/**
 *
 * @author darav
 */
public class Ejercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int limite = 20;
        double far = 20;
        double celsius;
        String cadena = "";
        
       for (int i = 1; i <= 20; i++) {
           
           celsius =   (far - 32) * 5 / 9;
           cadena = String.format("%s%.2f\t%.2f\n",cadena,far,celsius) ;
           far += 4;
        }
       System.out.printf("Fahrenheit a Celsius:\n%s", cadena);
    }
    
}
