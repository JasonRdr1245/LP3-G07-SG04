/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comprapasajesapp;

/**
 *
 * @author user
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CompraPasajesApp {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Compra de Pasajes");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(400, 300);

            JPanel panel = new JPanel();
            panel.setLayout(new GridLayout(7, 2));

            JLabel lblNombre = new JLabel("Nombre:");
            JTextField txtNombre = new JTextField(20);
            JLabel lblDocumento = new JLabel("Documento de Identidad:");
            JTextField txtDocumento = new JTextField(20);

            JLabel lblOrigen = new JLabel("Origen:");
            String[] lugares = {"Lugar 1", "Lugar 2", "Lugar 3"};
            JComboBox<String> cmbOrigen = new JComboBox<>(lugares);

            JLabel lblDestino = new JLabel("Destino:");
            JComboBox<String> cmbDestino = new JComboBox<>(lugares);

            JLabel lblClase = new JLabel("Clase de Servicio:");
            JList<String> listaClase = new JList<>(new String[]{"Económico", "Standard", "VIP"});

            JLabel lblServiciosOpcionales = new JLabel("Servicios Opcionales:");
            JCheckBox chkAudifonos = new JCheckBox("Audífonos");
            JCheckBox chkManta = new JCheckBox("Manta");
            JCheckBox chkRevistas = new JCheckBox("Revistas");

            JLabel lblPiso = new JLabel("Piso:");
            ButtonGroup grupoPiso = new ButtonGroup();
            JRadioButton rbtnPrimerPiso = new JRadioButton("Primer Piso");
            JRadioButton rbtnSegundoPiso = new JRadioButton("Segundo Piso");
            grupoPiso.add(rbtnPrimerPiso);
            grupoPiso.add(rbtnSegundoPiso);

            JButton btnResumen = new JButton("Mostrar Resumen");

            panel.add(lblNombre);
            panel.add(txtNombre);
            panel.add(lblDocumento);
            panel.add(txtDocumento);
            panel.add(lblOrigen);
            panel.add(cmbOrigen);
            panel.add(lblDestino);
            panel.add(cmbDestino);
            panel.add(lblClase);
            panel.add(listaClase);
            panel.add(lblServiciosOpcionales);
            panel.add(chkAudifonos);
            panel.add(new JLabel());
            panel.add(chkManta);
            panel.add(new JLabel());
            panel.add(chkRevistas);
            panel.add(lblPiso);
            panel.add(rbtnPrimerPiso);
            panel.add(new JLabel());
            panel.add(rbtnSegundoPiso);
            panel.add(new JLabel());
            panel.add(btnResumen);

            btnResumen.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    StringBuilder resumen = new StringBuilder("Resumen de Compra de Pasajes:\n");
                    resumen.append("Nombre: ").append(txtNombre.getText()).append("\n");
                    resumen.append("Documento de Identidad: ").append(txtDocumento.getText()).append("\n");
                    resumen.append("Origen: ").append(cmbOrigen.getSelectedItem()).append("\n");
                    resumen.append("Destino: ").append(cmbDestino.getSelectedItem()).append("\n");
                    resumen.append("Clase de Servicio: ").append(listaClase.getSelectedValue()).append("\n");
                    resumen.append("Servicios Opcionales: ").append(chkAudifonos.isSelected() ? "Audífonos " : "")
                            .append(chkManta.isSelected() ? "Manta " : "")
                            .append(chkRevistas.isSelected() ? "Revistas" : "").append("\n");
                    resumen.append("Piso: ").append(rbtnPrimerPiso.isSelected() ? "Primer Piso" : "Segundo Piso");

                    JOptionPane.showMessageDialog(frame, resumen.toString(), "Resumen de Compra", JOptionPane.INFORMATION_MESSAGE);
                }
            });

            frame.add(panel);
            frame.setVisible(true);
        });
    }
}

