public class Diagnostico {

    public Diagnostico() {
    }

    public boolean aptoVacunaB(Perro perro) {
        return ((perro.getTemp() >= 37 && perro.getTemp() <= 40) && perro.peso > 5 && perro.getEdad() > 1) ? true : false;

    }

    public boolean aptoVacunaA(int edad, double peso, double temp) {
        return ((temp >= 37 && temp <= 40) && peso > 5 && peso > 1) ? true : false;
    }
}
