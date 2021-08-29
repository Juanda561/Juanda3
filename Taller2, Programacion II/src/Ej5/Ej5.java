/*
5. Escriba un programa en Java que lea un carácter e imprima su correspondiente 
valor numérico (utilizar la conversión de tipos).
 */
package Ej5;

import java.nio.charset.StandardCharsets;
import javax.swing.JOptionPane;

public class Ej5 {
    
    public static void main(String[] args) {
        
        String caracter = JOptionPane.showInputDialog("Digite cualquier letra");
        
        byte[]bytes = caracter.getBytes(StandardCharsets.US_ASCII);
        System.out.println("El numero equivalente a la letra "+caracter+" es "+bytes[0]);
        
    }
    
}
