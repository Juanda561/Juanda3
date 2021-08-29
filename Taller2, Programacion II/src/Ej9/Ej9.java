/*
9. Se desea construir un programa en java que permita calcular el costo total
de un viaje que tiene una duración en días. Para ello, se requiere los 
siguientes datos: 

Número de días del viaje, Total de kilómetros conducidos por día, costo por 
litro de gasolina, promedio de kilometro por litro de gasolina, 
pago por estacionamiento por día, pago de peajes por día. 

Imprima en consola el resultado.
 */
package Ej9;

import javax.swing.JOptionPane;


public class Ej9 {
    
    public static void main(String[] args) {
        
        int dias;
        float total_peaje,total_estacionamiento,Total_viaje,pago_peaje_dia,pago_estac_dia,costo_gasolina,kilometros_conducidosXdia,total_litros_gasolina_consumidos,total_gasolina_comprada;
        
        dias= Integer.parseInt(JOptionPane.showInputDialog("¿Cuantos dias dura el viaje?"));
        kilometros_conducidosXdia=Integer.parseInt(JOptionPane.showInputDialog("¿Cuantos kilometros recorre por dia?"));
        costo_gasolina=Float.parseFloat(JOptionPane.showInputDialog("¿Cuanto le cuesta el litro de gasolina?"));
        pago_peaje_dia=Float.parseFloat(JOptionPane.showInputDialog("¿Cuanto gasta al dia en peajes?"));
        pago_estac_dia=Float.parseFloat(JOptionPane.showInputDialog("¿Cuanto gasta al dia en estacionamientos?"));
        
       
        //calculamos cuantos litro de gasolina gastó en los kilometros recorridos, 1 litro de gasolina = 12 kilometros recorridos
        total_litros_gasolina_consumidos=Kilometros_totales(dias, kilometros_conducidosXdia)/12;
        
        //calculamos cuanto dinero gastó en gasolina en esos kilometros recorridos
        total_gasolina_comprada=costo_gasolina*total_litros_gasolina_consumidos;
        
        //calculamos el total de los peajes pagados
        total_peaje=dias*pago_peaje_dia;
        
         //calculamos el total de los estacionamientos pagados
        total_estacionamiento=dias*pago_estac_dia;
        
        Total_viaje=total_gasolina_comprada+total_peaje+total_estacionamiento;
        
        System.out.println("El costo del viaje será aproximadamente de: "+Total_viaje);
    }
    
    
    public  static float Kilometros_totales(int dias,float kilometros_conducidosXdia){
        //calculamos los kilometros por dia
        return dias*kilometros_conducidosXdia;
    }
    
}
