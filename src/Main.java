import java.util.Scanner;

public class Main {
    public static String elegir(int vida) {
        String gift = "";
        switch (vida) {
            case 1:
                gift = "Un pasaje al caribe";
                break;
            case 2:
                gift = "Una visita al museo más cercano a tu casa";
                break;
            case 3:
                gift = "Una entrada al cine";
                break;
        }
        return gift;
    }

    public static void main(String[] args) {

        int vida, rp;
        boolean fl = false;
        vida = 0;
        Scanner sc = new Scanner(System.in);
        do {

            vida++;
            System.out.println("Vida:" + vida + "\t¿Cual es el numero secreto?");
            rp = sc.nextInt();
            if (rp == 1234)
                fl = true;
        } while (vida < 3 && !fl);
        ;
        if (fl == true) {
            System.out.println("Adivinaste");
            System.out.println("¡Ganaste un cafe!");
            System.out.println(elegir(vida));
        } else
            System.out.println("ups,perdiste");
    }
}
