/*
Creando un codigo que siga la secuencia de fibonacci
 */
package serie_fibonnacci;

import java.util.Scanner;
public class Serie_Fibonnacci {
    public class Serie_Fibonnacci {
    public static void main(String[] args) {
        // Inicializamos las variables para la secuencia de Fibonacci
        int a=0, b=0, c=0, fin=0;
        
        // Creamos un objeto Scanner para leer la entrada del usuario
        Scanner lee = new Scanner(System.in);
        
        // Solicitamos al usuario que ingrese el rango de la secuencia (cantidad de términos)
        System.out.println("Ingrese el rango de la secuencia");
        fin = lee.nextInt(); // Leemos el número de términos
        
        // Solicitamos al usuario que ingrese el segundo valor inicial de la secuencia
        // Esto permite personalizar el segundo valor (b) de la secuencia de Fibonacci
        System.out.println("Ingresa inicio de la secuencia");
        b = lee.nextInt(); // Leemos el segundo valor de la secuencia (b)
        
        // Comenzamos el bucle para generar y mostrar la secuencia de Fibonacci
        for (int i = 0; i < fin; i++) {
            // Calculamos el siguiente número de Fibonacci sumando los dos anteriores
            c = a + b;
            // Actualizamos los valores de 'a' y 'b' para avanzar en la secuencia
            a = b; // 'a' toma el valor de 'b'
            b = c; // 'b' toma el valor de 'c' (el nuevo término)
            
            // Imprimimos el valor calculado de la secuencia
            System.out.print("," + c);
        }
        
        // Salto de línea para finalizar la salida
        System.out.println("");
    }
}
    
}
