/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adminesquemagridlayout;




// Archivo "MarcoPanel.java"
// Uso de un objeto JPanel para ayudar a distribuir los componentes.
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;

public class MarcoPanel extends JFrame {
    private final JPanel panelBotones; // panel que contiene los botones
    private final JButton[] botones;

    // constructor sin argumentos
    public MarcoPanel() {
        super("Demostracion de Panel");
        botones = new JButton[6]; // Se agregó un botón adicional
        panelBotones = new JPanel();
        panelBotones.setLayout(new GridLayout(2, 3)); // Se cambió a una cuadrícula de 2 filas y 3 columnas

        // crea y agrega los botones
        for (int cuenta = 0; cuenta < botones.length; cuenta++) {
            botones[cuenta] = new JButton("Boton " + (cuenta + 1));
            panelBotones.add(botones[cuenta]); // agrega el botón al panel
        }

        add(panelBotones);
    }
}
