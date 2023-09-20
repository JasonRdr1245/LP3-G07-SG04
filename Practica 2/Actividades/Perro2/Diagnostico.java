import java.util.Scanner;

public class Diagnostico {
    Scanner sc = new Scanner(System.in);

    public String aptoVacunaA(Perro perro) {
        if (perro.getTemp() >= 37.00 && perro.getTemp() <= 40.00) {
            if (perro.peso >= 5.00) {
                if (perro.getEdad() >= 1) {
                    return "DIAGNOSTICO: El Perro esta SANO";
                }
            }
        }
        return "DIAGNOSTICO: El Perro esta ENFERMO";
    }

    public String aptoVacunaB(int canAnios, double canTemp, double canPeso) {
        if (canTemp >= 37.00 && canTemp <= 40.00) {
            if (canPeso >= 5.00) {
                if (canAnios >= 1) {
                    return "DIAGNOSTICO: El Perro esta SANO";
                }
            }
        }
        return "DIAGNOSTICO: El Perro esta ENFERMO";

    }
}
