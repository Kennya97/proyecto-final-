
package clases;

 import java.util.Random;

public class EsperanzaEspinoza {
      /* Ejemplo uso clase Random() – aprenderaprogramar.com */

      public static void main(String arg[]) {

            int a, b, c;

            Random rnd = new Random();

            a = (rnd.nextInt(26) + 65);

            b = (rnd.nextInt(26) + 65);

            c = (rnd.nextInt(26) + 65);

            System.out.println(a);        

            System.out.println(b);        

            System.out.println(c);        

      }

 
}
