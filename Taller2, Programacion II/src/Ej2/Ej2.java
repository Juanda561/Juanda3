/*
2. Escriba una aplicación que pida al usuario que escriba dos enteros, 
que obtenga los números del usuario e imprima la suma, producto, diferencia 
de los números.
*/
package Ej2;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Ej2 {
    
    public static void main(String[] args) {
        
        JTextArea salida= new JTextArea();
        salida.setText("");
        
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite el primer numero "));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite el segundo numero "));
        
        salida.append("Los numeros ingresados fueron el: "+num1+" y el "+num2+"\n\n");
        salida.append("La suma es: "+Sumar(num1, num2)+"\n");
        salida.append("La multiplicacion es: "+Producto(num1, num2)+"\n");
        salida.append("La diferencia es: "+Diferencia(num1, num2));
        
        JOptionPane.showMessageDialog(null, salida);
        
    }
    
    public static int Sumar(int a, int b){
        return a+b;
    }
    
    public static int Producto(int a, int b){
        return a*b;
    }
    
    public static int Diferencia(int a, int b){
        return a-b;
    }
}
