
package prueba01;

import java.util.Scanner;

public class Prueba01 {

   public static void main(String[] args) {
        // TODO code application logic here
        int numero;
        int resultado = 1;
        //int i;
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un numero para calcular Factorial: ");
        
        numero = entrada.nextInt();
        
        for (int i=1; i<= numero; i++)
            {
                resultado = i * resultado;
            }
        System.out.println("El Factorial de numero ingresado es: " + resultado);
    }
}