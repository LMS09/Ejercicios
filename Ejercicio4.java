
package ejercicio.pkg4;
import java.util.Scanner;

public class Ejercicio4 {

  
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        float cent, faren;
        
        System.out.println("Ingrese los grados centigrados");
        
        cent = leer.nextFloat();
        
        faren = 32+(9* cent/5);
        
        System.out.println("El equivalente en Farenheit es: "+faren);
        
    }
    
}
