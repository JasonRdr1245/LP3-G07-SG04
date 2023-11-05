/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adminesquemagridlayout;


import javax.swing.JFrame;

public class AdminEsquemaGridLayout extends JFrame {
    public static void main(String[] args) {
        MarcoPanel marcoPanel = new MarcoPanel();
        marcoPanel.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marcoPanel.setSize(450, 300); // Se ajustó el tamaño para mostrar la cuadrícula correctamente
        marcoPanel.setVisible(true);
    }
}
