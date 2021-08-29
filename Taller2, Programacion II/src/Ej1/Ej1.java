/*
1. Escriba un programa en java que lea dos datos de tipo entero, los almacene 
en dos variables num1 y num2, y ejecute las siguientes instrucciones, analice
los resultados:

a) System.out.printf(”x = %d\n", x );
b) System.out.printf(“El valor de %d + %d es %d\n”, x, x, ( x + x ) );
c) System.out.printf(“x=%.2f”, x );
d) System.out.printf("%d - %d\n", ( x + y ), ( y + x ) );

 */
package Ej1;

public class Ej1 {

    
    public static void main(String[] args) {
       
        int x=6;
        int y=16;
        
        System.out.printf("x = %d\n", x );
        System.out.printf("El valor de %d + %d es: %d\n", x, x, ( x + x ) );
        System.out.printf("%d - %d\n", ( x + y ), ( y + x ) );
        System.out.printf("x = %.2f", x);
          
    }
}
