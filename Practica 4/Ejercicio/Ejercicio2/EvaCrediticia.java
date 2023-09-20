package evacrediticia;
import java.util.*;
import java.util.ArrayList;


public class EvaCrediticia {

    public static void main(String[] args) {

        ArrayList<PersonaCredito> Evaluacion = new ArrayList<PersonaCredito>();
        crear(Evaluacion);
        percentMale(Evaluacion);
        percentFemale(Evaluacion);

    }

    public static void crear(ArrayList<PersonaCredito> Evaluacion) {
        for (int i = 0; i < 8; i++) {
            PersonaCredito n = new PersonaCredito();
            Evaluacion.add(n);
            (Evaluacion.get(i)).setSexo(rnumber(1, 2));
            (Evaluacion.get(i)).setTrabajo(rnumber(1, 2));
            if ((Evaluacion.get(i)).getTrabajo() == 2)
                (Evaluacion.get(i)).setSueldo(0);
            (Evaluacion.get(i)).setSueldo(rnumber(950, 3000));
        }
    }

    public static int rnumber(int min, int max) {
        int r_int = (int) Math.floor(Math.random() * (max - min + 1) + min);
        System.out.println(r_int);
        return r_int;
    }

    public static void percentMale(ArrayList<PersonaCredito> Evaluacion) {
        int cht = 0;
        int ch = 0;
        int chts = 0;
        for (int i = 0; i < Evaluacion.size(); i++) {
            if ((Evaluacion.get(i)).getSexo() == 1) {
                if ((Evaluacion.get(i)).getTrabajo() == 1) {
                    chts += (Evaluacion.get(i)).getSueldo();
                    cht++;
                }
                ch++;
            }
        }

        float mper = (ch * 100) / Evaluacion.size();
        float mtper = (cht * 100) / ch;
        float mtsper = (chts / cht);
        System.out.println("================================");
        System.out.println("Porcentaje de Hombres: " + mper + "%");
        System.out.println("Porcentaje de Hombres que trabajan: " + mtper + "%");
        System.out.println("Promedio Sueldo Hombres: " + mtsper);
    }

    public static void percentFemale(ArrayList<PersonaCredito> Evaluacion) {
        int cht = 0;
        int ch = 0;
        int chts = 0;
        for (int i = 0; i < Evaluacion.size(); i++) {
            if ((Evaluacion.get(i)).getSexo() == 2) {
                if ((Evaluacion.get(i)).getTrabajo() == 1) {
                    chts += (Evaluacion.get(i)).getSueldo();
                    cht++;
                }
                ch++;
            }
        }

        float mper = (ch * 100) / Evaluacion.size();
        float mtper = (cht * 100) / ch;
        float mtsper = (chts / cht);
        System.out.println("================================");
        System.out.println("Porcentaje de Mujeres: " + mper + "%");
        System.out.println("Porcentaje de Mujeres que trabajan: " + mtper + "%");
        System.out.println("Promedio Sueldo Mujeres: " + mtsper);
    }
}
