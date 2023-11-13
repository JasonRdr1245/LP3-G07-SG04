import java.io.IOException;
import java.util.Scanner;

import javax.swing.table.DefaultTableModel;

public class EmployeeFile extends FileHandler {
    EmployeeFile(String filepath) {
        super(filepath);
        try {
            super.createFile();
        } catch (IOException e) {
            e.printStackTrace(); // o maneja de otra manera (log, mensaje, etc.)
        }
    }

    void agregarEmpleados(String numero, String nombre, String sueldo) throws Exception {
        String total = numero + "," + nombre + "," + sueldo + "\n";
        Validator.validarNumero(numero);
        Validator.validarSueldo(sueldo);
        Validator.validarVacio(nombre);
        super.writeToFile(total);
    }

    void reporteEmpleados(DefaultTableModel tableModel) throws IOException {
        String contenido = readFromFile();
        String[] lineas = contenido.split("\n");

        // Limpiar la tabla antes de agregar nuevas filas
        tableModel.setRowCount(0);

        for (String linea : lineas) {
            String[] campos = linea.split(",");
            tableModel.addRow(campos);

        }

    }

}
