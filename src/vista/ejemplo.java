/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

/**
 *
 * @author ruby
 */
//import javax.swing.*;
//public class ejemplo extends JFrame {
// public ejemplo(){ 
// JCheckBox check = new JCheckBox("Checkbox");
// add(check);
//}
// public static void main(String[]args){
// ejemplo ej = new ejemplo();
// ej.setVisible(true);
// ej.setBounds(20, 20, 70, 80);
// }
//}
import java.awt.FlowLayout;
import javax.swing.JCheckBox;
import javax.swing.JFrame;


public class ejemplo extends JFrame {

    public ejemplo() {
        setLayout(new FlowLayout());
        JCheckBox opcion1 = new JCheckBox("SOLIDO");
        JCheckBox opcion2 = new JCheckBox("LIQUIDO");
        JCheckBox opcion3 = new JCheckBox("GASEOSO");
        add(opcion1);
        add(opcion2);
        add(opcion3);
    }

    public static void main(String[] args) {
        ejemplo che = new ejemplo();
        che.setTitle("Botones de comprobación");
        che.setBounds(50, 50, 350, 150);
        che.setVisible(true);
    }
}


//AccessibleContext getAcessibleContext().- Coge el AccessibleContext asociado con esta JCheckBox.
//boolean isBorderPaintedFlat().- Coge el valor de la propiedad borderPaintedFlat.
//String getUIClassID().- Devuelve una cadena de caracteres que especifica el nombre de la classe L&F que renderiza este componente.
//protected StringparamString().- Devuelve una representación de esta JCheckBox en una cadena de caracteres.
//void setBorderPaintedFlat(boolean b).- Pone la propiedad borderPaintedFlat, la cual da una pista sobre el L&F y la apariencia del borde de la checkbox.
//void updateUI().- Resetea la propiedad UI a un valor del L&F actual.