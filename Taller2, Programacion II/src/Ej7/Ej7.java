/*
7. Juan conoce el precio de compra y de venta de unos de los productos de su
tienda y requiere conocer cuál es su % de utilidad. Desarrolle un programa
en java que lo ayude con ese cálculo.
 */
package Ej7;

import javax.swing.JOptionPane;


public class Ej7 {
    
    public static void main(String[] args) {
        
        float compra= Float.parseFloat(JOptionPane.showInputDialog("Ingrese precio de compra del producto"));
        float venta= Float.parseFloat(JOptionPane.showInputDialog("Ingrese precio de venta del producto"));
        
        float utilidad=venta-compra;
        
        float margenUtilidad=(utilidad/venta)*100;
        
        
        
        System.out.printf("Su utilidad es de: %.0f%n",utilidad);
        System.out.printf("Su porcentaje de utilidad es del: %.0f%n",margenUtilidad);
        
    }
    
}
