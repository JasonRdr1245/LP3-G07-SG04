/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adminesquemaborderlayout;



import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class MarcoPanel extends JFrame {
    private final JButton botonNorte;
    private final JButton botonSur;
    private final JButton botonEste;
    private final JButton botonOeste;
    private final JButton botonCentro;

    // constructor sin argumentos
    public MarcoPanel() {
        super("Franco P Jason P");
        botonNorte = new JButton("Norte");
        botonSur = new JButton("Sur");
        botonEste = new JButton("Este");
        botonOeste = new JButton("Oeste");
        botonCentro = new JButton("Centro");

        add(botonNorte, BorderLayout.NORTH);
        add(botonSur, BorderLayout.SOUTH);
        add(botonEste, BorderLayout.EAST);
        add(botonOeste, BorderLayout.WEST);
        add(botonCentro, BorderLayout.CENTER);
    }
}
