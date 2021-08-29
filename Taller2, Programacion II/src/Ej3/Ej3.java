/*
3. Escriba una aplicación que reciba tres valores decimales del usuario y
muestre la suma, promedio, producto, cociente y modulo. Los resultados se 
deben imprimir en formato decimal con dos cifras significativas.

 */
package Ej3;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Ej3 {
    
    public static void main(String[] args) {
        
        JTextArea salida= new JTextArea();
        salida.setText("");
        
        
        float num1 = Float.parseFloat(JOptionPane.showInputDialog("Digite el primer numero decimal"));
        float num2 = Float.parseFloat(JOptionPane.showInputDialog("Digite el segundo numero decimal"));
        float num3 = Float.parseFloat(JOptionPane.showInputDialog("Digite el tercer numero decimal"));
        
        salida.append("La suma es: "+Suma(num1, num2, num3)+"\n");
        salida.append("El Promedio es: "+Promedio(num1, num2, num3)+"\n");
        salida.append("El Producto es: "+Producto(num1, num2, num3)+"\n");
        salida.append("El Cociente es: "+Cociente(num1, num2,num3)+"\n");
        salida.append("El Modulo es: "+Modulo(num1, num2,num3
        
        )+"\n");
        
        
        JOptionPane.showMessageDialog(null,salida);
    }
    
    public static float Suma(float a, float b, float c){
        return a+b+c;
    }
    
    public static float Promedio(float a, float b, float c){
        return (a+b+c)/3;
    }
    
    public static float Producto(float a, float b, float c){
        return a*b*c;
    }
    
    public static float Cociente(float a, float b, float c){
        return a/b/c;
    }
    
    public static float Modulo(float a, float b,float c){   
        
        float modulo2= a%b%c;
        return modulo2;
    }
    
    
}
