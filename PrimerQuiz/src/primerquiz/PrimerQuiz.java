/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package primerquiz;

import javax.swing.JOptionPane;

/**
 *
 * @author marip
 */
public class PrimerQuiz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // programa que solicite el nombre del articulo y el codigo de categoria
        
        //Costo de producto
    
       JOptionPane.showInputDialog("Digite el nombre del primer articulo");
       JOptionPane.showInputDialog("Digite el codigo TEC, ROP, HOG, other:");
       String lectura;
       double monto;
        lectura =  JOptionPane.showInputDialog("Digite el valor CIF"); 
        monto = Integer.parseInt(lectura);
        double cobro = 0;
       if (monto > 500) {
            cobro = 20;   
        } else {
            cobro = 0;
        
}
    
        
    }
    
}
