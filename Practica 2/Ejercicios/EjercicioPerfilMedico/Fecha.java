public class Fecha {
    private int dia;
    private int mes;
    private int año;

    public Fecha(int dia, int mes, int año) {
        if (validarFecha(dia, mes, año)) {
            this.dia = dia;
            this.mes = mes;
            this.año = año;
        } else {
            throw new IllegalArgumentException("Fecha inválida");
        }
    }

    private boolean validarFecha(int dia, int mes, int año) {
        if (dia < 1 || dia > 31 || mes < 1 || mes > 12 || año < 0) {
            return false;
        }

        return true;
    }
}
