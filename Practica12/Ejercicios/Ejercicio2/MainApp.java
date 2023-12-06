import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.SoftBevelBorder;
import java.awt.*;

public class MainApp extends JFrame {
    // Navigation Components
    private JButton prevButton, nextButton, findButton, browseButton, insertButton;
    private JLabel totalObjects, currentPage;
    private JPanel navPanel;
    // Input Components
    private JTextField direccionField, nombreField, apellidoField, emailField, phoneField,
            findApellidoField;
    private JPanel direccionPanel, nombrePanel, apellidoPanel, emailPanel, phonePanel,
            findPanel;

    MainApp() {
        // Navigation Panel
        prevButton = new JButton("Prev");
        totalObjects = new JLabel("1");
        currentPage = new JLabel("of 1");
        nextButton = new JButton("Next");
        navPanel = new JPanel(new FlowLayout());
        navPanel.add(prevButton);
        navPanel.add(totalObjects);
        navPanel.add(currentPage);
        navPanel.add(nextButton);
        // Input Panels
        direccionPanel = createInputPanel("Direccion:", direccionField);
        nombrePanel = createInputPanel("Nombre:", nombreField);
        apellidoPanel = createInputPanel("Apellido:", apellidoField);
        emailPanel = createInputPanel("Email:", emailField);
        phonePanel = createInputPanel("Phone:", phoneField);
        // Find Panel
        findPanel = createFindPanel("Find entry by lastname", findApellidoField);
        // Button Panel
        JPanel buttonPanel = new JPanel(new FlowLayout());
        browseButton = new JButton("Browse");
        insertButton = new JButton("Insert");
        buttonPanel.add(browseButton);
        buttonPanel.add(insertButton);
        // Main Panel
        JPanel mainPanel = new JPanel(new GridLayout(8, 1));
        mainPanel.add(navPanel);
        mainPanel.add(direccionPanel);
        mainPanel.add(nombrePanel);
        mainPanel.add(apellidoPanel);
        mainPanel.add(emailPanel);
        mainPanel.add(phonePanel);
        mainPanel.add(findPanel);
        mainPanel.add(buttonPanel);
        // Window Configuration
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().add(mainPanel);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        try {
            SwingUtilities.invokeLater(() -> new MainApp());
        } catch (Exception e) {
            System.out.println("Error rendering the interface");
        }
    }

    private JPanel createInputPanel(String labelText, JTextField textField) {
        JPanel inputPanel = new JPanel(new GridBagLayout());
        textField.setPreferredSize(new Dimension(230, 30));
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.anchor = GridBagConstraints.CENTER;
        constraints.insets = new Insets(0, 0, 0, 15);
        constraints.gridx = 0;
        inputPanel.add(new JLabel(labelText), constraints);
        constraints.gridx = 1;
        inputPanel.add(textField, constraints);
        return inputPanel;
    }

    private JPanel createFindPanel(String borderTitle, JTextField findField) {
        JPanel findPanel = new JPanel(new FlowLayout());
        findPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        findPanel.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createTitledBorder(borderTitle),
                new SoftBevelBorder(BevelBorder.LOWERED, Color.BLACK, Color.GRAY)));
        findPanel.add(new JLabel("Apellido:"));
        findPanel.add(findField);
        JButton findButton = new JButton("Find");
        findPanel.add(findButton);
        findField.setPreferredSize(new Dimension(400, 30));
        return findPanel;
    }
}
