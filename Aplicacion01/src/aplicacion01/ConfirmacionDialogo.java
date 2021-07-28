/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion01;


import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class ConfirmacionDialogo {

    public static void main(String[] args) {

        ImageIcon icon = new ImageIcon("src/img/dd.png");
    int input = JOptionPane.showConfirmDialog(null, "¿Creés que MESSI es el mejor jugador de toodos?", "No Mienta...",
            JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, icon);

      
    System.out.println(input);

    }
}