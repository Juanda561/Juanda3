/*
10. Escriba un programa en Java que lea el peso de un objeto (en kilogramos) e imprima su equivalencia en: gramos, libras, 
toneladas.
 */

package Ej10;

import javax.swing.JOptionPane;


public class Ej10 {
    
    public static void main(String[] args) {
        
        float peso = Float.parseFloat(JOptionPane.showInputDialog("¿Cuanto pesa el objeto?(Kg)"));
        System.out.println(peso+" Kg equivale a:");
        System.out.printf("Gramos: %.0f%n ",kg_gr(peso));
        System.out.printf("Libras: %.2f%n ",kg_lb(peso));
        System.out.printf("Toneladas: %.5f%n ",kg_tn(peso));
 
    }
    
    public static float kg_gr(float a){
        return a*1000;
    }
    
    public static float kg_lb(float a){
        return(float) (a*2.205);
    }
    
    public static float kg_tn(float a){
        return a/1000;
    }
}
