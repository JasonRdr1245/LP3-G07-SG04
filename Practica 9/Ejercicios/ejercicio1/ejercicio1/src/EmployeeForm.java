import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class EmployeeForm extends JFrame {
    private JTextField numeroField;
    private JTextField nombreField;
    private JTextField sueldoField;
    private DefaultTableModel tableModel;
    private EmployeeFile employeeFile;

    public EmployeeForm() {
        // Configuración del JFrame
        employeeFile=new EmployeeFile("./data.txt");
        setTitle("Formulario de Empleados");
        setSize(500, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Creación de componentes
        numeroField = new JTextField(10);
        nombreField = new JTextField(18);
        sueldoField = new JTextField(10);

        JButton agregarButton = new JButton("Agregar");
        agregarButton.setPreferredSize(new Dimension(100,30));

        // Configuración de la tabla
        tableModel = new DefaultTableModel();
        tableModel.addColumn("Número");
        tableModel.addColumn("Nombre");
        tableModel.addColumn("Sueldo");

        JTable table = new JTable(tableModel);

        // Configuración del diseño del formulario con GridLayout
        setLayout(new GridLayout(0, 1, 5, 5)); // Varias filas, 1 columna, espaciado horizontal y vertical

        // Panel para el número
        JPanel numeroPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        numeroPanel.add(new JLabel("Número:"));
        numeroPanel.add(numeroField);
        add(numeroPanel);

        // Panel para el nombre
        JPanel nombrePanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        nombrePanel.add(new JLabel("Nombre:"));
        nombrePanel.add(nombreField);
        add(nombrePanel);

        // Panel para el sueldo
        JPanel sueldoPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        sueldoPanel.add(new JLabel("Sueldo:"));
        sueldoPanel.add(sueldoField);
        add(sueldoPanel);

        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        buttonPanel.add(agregarButton);
        add(buttonPanel);
        add(new JScrollPane(table)); // Agregar la tabla con desplazamiento
        agregarButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                agregarEmpleado();
            }
        });
        try{
        employeeFile.reporteEmpleados(tableModel);
        }catch(Exception e){
            System.out.println("fallo");
        }
        // Mostrar el formulario
        setVisible(true);
    }

    private void agregarEmpleado(){
        String numero = numeroField.getText();
        String nombre = nombreField.getText();
        String sueldo = sueldoField.getText();

        // Llamar al método agregarEmpleado de EmployeeFile
        try{
        employeeFile.agregarEmpleados(numero, nombre, sueldo);
        employeeFile.reporteEmpleados(tableModel);
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(EmployeeForm::new);
    }
}