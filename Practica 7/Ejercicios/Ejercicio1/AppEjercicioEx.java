package appejercicioex;


public class AppEjercicioEx {

    public static void main(String[] args) {
        double[] v = new double[15];
        try {
            acceso(v, 16);
        } catch (Exception exc) {
            System.out.println("Excepción capturada en main: " + exc.getMessage());
        }

    }

    public static double acceso(double[] v, int j) {
        try {
            if (j >= 0 && j < v.length) {
                return v[j];
            } else {
                throw new Exception("El índice " + j + " no existe en el vector");
            }
        } catch (Exception exc) {
            System.out.println("Excepción capturada en acceso: " + exc.getMessage());
            return -1.0; // Otra acción que quieras realizar en caso de excepción
        }
    }
}
