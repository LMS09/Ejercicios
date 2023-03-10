
package ejercicio5;
import java.util.Scanner;

public class Ejercicio5 {

    
    public static void main(String[] args) {
     Scanner leer = new Scanner(System.in);
     
     System.out.println("Ingrese un número");
     
     int num1 = leer.nextInt();
     
     System.out.println("El doble del número que ingresó es: "+num1*2);
     System.out.println("El triple del número que ingresó es: "+num1*3);
     
     if (num1 < 0) {
        System.out.println("La reiz cuadrada no puede ser calculada");
    }else{
            System.out.println("La raiz cuadrada del número que ingreso es: "+String.format("%.2f",Math.sqrt(num1)));
            }
    }
    
}
