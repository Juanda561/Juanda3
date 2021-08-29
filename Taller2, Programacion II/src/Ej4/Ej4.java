/*
4. Escriba un programa en Java que le solicite al usuario el valor del radio
de una circunferencia y calcule su longitud y área. Imprima los resultados 
(con dos números decimales)
*/

package Ej4;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Ej4 {
    
    public static void calculos (double r){
        
        JTextArea salida=new JTextArea();
        salida.setText("");
        
        double l,a;
        
        l=2*Math.PI*r;
        a=Math.PI*(r*r);
        
        System.out.printf("Longitud= %.2f%n",l);
        System.out.printf("Su area es= %.2f%n",a);

    }
    
    public static void main(String[] args) {
        
        double r= Float.parseFloat(JOptionPane.showInputDialog("Ingrese el radio de la circunferencia"));
        
        calculos(r);
        
        
    }
    
    
    
}
