/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adminesquemaflowlayout;


import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MarcoPanel extends JFrame {
    private final JPanel panelBotones; // panel que contiene los botones
    private final JButton[] botones;

    // constructor sin argumentos
    public MarcoPanel() {
        super("Franco P Jasorn R");
        botones = new JButton[5];
        panelBotones = new JPanel();
        panelBotones.setLayout(new FlowLayout()); // Se cambió a un FlowLayout

        // crea y agrega los botones
        for (int cuenta = 0; cuenta < botones.length; cuenta++) {
            botones[cuenta] = new JButton("Boton " + (cuenta + 1));
            panelBotones.add(botones[cuenta]); // agrega el botón al panel
        }

        add(panelBotones);
    }
}


