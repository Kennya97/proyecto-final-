
package clases;

import java.util.Scanner;

public class WillianAdalbertoHernandez {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        int x; // Primer entero
        int b; // segundo entero
        int c; // Tercer entero
        int resultado; // Producto de los numeros
        
        System.out.print("Escriba el primer entero: "); // Indicador de entrada
        x = entrada.nextInt(); // Lee el primer entero
        
        System.out.print("Escriba el segundo entero: "); // Indicador de entrada
        b = entrada.nextInt(); // Lee el segundo entero
        
        System.out.print("Escriba el tercer entero: "); // Indicador de entrada
        c = entrada.nextInt(); // Lee el terecer entero
        
        resultado = x * b * c; // Calcula la multiplicacion de los numeros
        
        System.out.printf("El producto es %d%n", resultado);
        
    } // Fin del metodo Main
    
} // Fin de la clase
