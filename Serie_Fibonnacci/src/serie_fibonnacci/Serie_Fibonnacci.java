/*
Creando un codigo que siga la secuencia de fibonacci
 */
package serie_fibonnacci;

import java.util.Scanner;
public class Serie_Fibonnacci {
    public static void main(String[] args) {
        int a=0, b=0, c=0, fin=0;
        Scanner lee= new Scanner(System.in);
        System.out.println("Ingrese el rango de la secuencia");
        fin=lee.nextInt();
        System.out.println("Ingresa inicio de la secuencia");
        b=lee.nextInt();
        for (int i = 0; i < fin; i++) {
            c=a+b;
            a=b;
            b=c;
            System.out.print(","+c);
        }
        System.out.println("");
    }
    
}
