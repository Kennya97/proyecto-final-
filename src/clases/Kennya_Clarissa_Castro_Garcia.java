
package clases;

/**
 *
 * @author castr
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Kennya_Clarissa_Castro_Garcia {
 public static void main(String[] args) {
try{

BufferedReader leer = new BufferedReader (new InputStreamReader(System.in));

System.out.println(">>>>INGRESE LA SIGUIENTE INFORMACIÓN<<<<");

System.out.println("Nombre de la maquina: ");     
String nombre = leer.readLine();


System.out.println("Costo de la maquinaria: ");     
double costo = Double.parseDouble(leer.readLine());


System.out.println("Años de vida del equipo: ");   
int vida = Integer.parseInt(leer.readLine());


System.out.println("---------------------------------");
    

depreciacion (nombre,costo, vida);
    
}catch(Exception e){
    
System.out.println(e.getMessage());
}
}

public static void depreciacion( String nombre, double costo, int vida){
    
double depreciacion;
        
double resultado;

int  suma_de_los_digitos = (vida * (vida + 1 )) / 2;
 
for(int i = vida ; i > 0; i--) {

depreciacion = (double) i / suma_de_los_digitos;

resultado = costo * depreciacion;


System.out.println("El nombre del equipo es: " + nombre);

System.out.println("La despreciacion del año "+ i + " : "+ depreciacion);

System.out.println("Resultado de costo por la depreciacion del año  " + i + " : " + resultado);

System.out.println("---------------------------------");

}
}
}
