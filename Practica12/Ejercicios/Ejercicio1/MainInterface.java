
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainInterface extends JFrame {
    private JTextField queryField, filterField;
    private JPanel panel;
    private JButton queryButton, filterButton;
    private JTable table;
    private JLabel filterLabel;
    private JPanel topPanel, bottomPanel;
    private DefaultTableModel tableModel;
    private DatabaseRequests databaseRequests;

    MainInterface() {
        try {
            databaseRequests = new DatabaseRequests();
        } catch (Exception e) {
            e.printStackTrace();
        }
        panel = new JPanel();
        queryField = new JTextField();
        queryField.setPreferredSize(new Dimension(400, 30));
        queryButton = new JButton("Send Query");
        table = new JTable();
        filterLabel = new JLabel("Filter");
        filterField = new JTextField();
        filterField.setPreferredSize(new Dimension(400, 30));
        filterButton = new JButton("Send Filter");
        // Apply columns to the table
        tableModel = new DefaultTableModel();
        tableModel.addColumn("First Name");
        tableModel.addColumn("Last Name");
        table.setModel(tableModel);
        // Button listeners
        queryButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                try {
                    databaseRequests.runQuery(queryField.getText(), table);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        filterButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                try {
                    databaseRequests.applyFilter(filterField.getText(), table);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        // Top part of the interface
        topPanel = new JPanel();
        topPanel.add(queryField);
        topPanel.add(queryButton);
        // Middle part of the interface
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        // Bottom part of the interface
        bottomPanel = new JPanel();
        bottomPanel.add(filterLabel);
        bottomPanel.add(filterField);
        bottomPanel.add(filterButton);
        panel.setLayout(new BorderLayout());
        panel.add(topPanel, BorderLayout.NORTH);
        panel.add(scrollPane, BorderLayout.CENTER);
        panel.add(bottomPanel, BorderLayout.SOUTH);
        panel.setBackground(Color.WHITE);
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        // Configuration of the main window
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().add(panel);
        pack();
        setLocationRelativeTo(null); // Center the window on the screen
        setVisible(true);
    }

    public static void main(String[] args) {
        try {
            SwingUtilities.invokeLater(() -> new MainInterface());
        } catch (Exception e) {
            System.out.println("Error rendering the interface");
        }
    }
}
