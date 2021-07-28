/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion01;
import javax.swing.*;
public class Aplicacion02 {
    public static void main(String[] args){
      String opcionSeleccionada="";
      String arregloOpciones[] = {"Dolares a Colones" , "Colones a Dolares" , "Salir"};
      double cantidad, conversion;
      while(opcionSeleccionada!="Salir"){
         opcionSeleccionada = (String)JOptionPane.showInputDialog(null, "Selecione:" , "Tipo de Coneversion" ,
             JOptionPane.INFORMATION_MESSAGE,null,arregloOpciones,arregloOpciones[0]);
         if(opcionSeleccionada.equals("Dolares a Colones")){
           cantidad = Double.parseDouble(JOptionPane.showInputDialog("Introduzca la cantidad a convertir" ));
           conversion = cantidad * 8.75;
           JOptionPane.showInputDialog(null, "Tolal ($:) " + cantidad + "\n Total Colones: " + conversion);
         }else if(opcionSeleccionada.equals("Colones a Dolares")){
            cantidad = Double.parseDouble(JOptionPane.showInputDialog("Introduzca la cantidad a convertir: "));
            conversion = cantidad / 8.75;
            JOptionPane.showInputDialog(null,  "Total ($): " + cantidad + "\n Total Colones: " + conversion);
          }  
        } 
      JOptionPane.showMessageDialog(null, "Gracias por usar esta Aplicacion ");
    }
}
