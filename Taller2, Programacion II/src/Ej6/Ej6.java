/*
6. Desarrolle un programa en java que calcule el índice de masa corporal BMI 
el cual está dado por la formula (peso en Kg/ altura en metros * altura en metros)
 */

package Ej6;

import javax.swing.JOptionPane;


public class Ej6 {
    
    public static void main(String[] args) {
        
        
        
        double peso = Double.parseDouble(JOptionPane.showInputDialog("Ingrese su Peso en Kg"));
        double altura = Double.parseDouble(JOptionPane.showInputDialog("Ingrese su Altura en Metros"));
        
        double imc= peso/(altura*altura);
        
        if(imc<16.00){
            System.out.println("\"Infrapeso: Delgadez Severa\"");
        }else if(imc<=16.00 || imc<=16.99){
                 System.out.println("\"Infrapeso: Delgadez moderada\"");
                }else if(imc<=17.00 ||imc<=18.49){
                            System.out.println("\"Infrapeso: Delgadez aceptable\"");
                        }else if(imc<=18.50 || imc<=24.99){
                                    System.out.println("\"peso normal\"");
                                }else if(imc<=25.00 || imc<=29.99){
                                            System.out.println("\"sobre peso\"");
                                        }else if(imc<=30.00 || imc<=34.99){
                                                    System.out.println("\"Obeso: Tipo 1\"");
                                                }else if(imc<=35.00 || imc<=40.00){
                                                            System.out.println("\"Obeso: Tipo 3\"");
                                                        }else{
                                                                System.out.println("no existe clasificacion");
                                                        }
    }
    
 
    
}
