/*
11. Desarrolle un programa en java que lea una cantidad numérica entre cero y mil (0 y 1000) e imprima la cifra
correspondiente a sus unidades, decenas y centenas.
 */

package Ej11;

import java.util.Scanner;

public class Ej11 {
    
    public static void main(String[] args) {
        
        Scanner ingreso = new Scanner(System.in);
        
        int num,uni,dec,cen,res;
        
        System.out.println("MOSTRAR LA UNIDAD, DECENA Y CENTENA\n");
        System.out.println("Ingrese un numero de 3 cifras : ");
        
        num = Integer.parseInt(ingreso.next());
        cen = num /100;
        res = num - (cen * 100);
        dec = res / 10;
        uni = res- (dec * 10);
        
        System.out.println("Unidad : "+uni);
        System.out.println("Decena : "+dec);
        System.out.println("Centena : "+cen);
    
    }    
}
   

    

