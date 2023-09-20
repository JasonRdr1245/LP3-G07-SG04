public class Rectangulo {
    private String[] colores = { "verde", "amarillo", "rojo" };
    static public String colorAct = "rojo";
    public String color;
    private Coordenada esquina1;
    private Coordenada esquina2;

    public Rectangulo(int base, int altura) {
        this.esquina1 = new Coordenada(0, 0);
        this.esquina2 = new Coordenada(altura, base);

        int contador = 0;
        for (int i = 0; i < 3; i++) {
            if (Rectangulo.colorAct == this.colores[i]) {
                contador += 1;
                if (i == 2 && contador == 1) {
                    this.color = this.colores[0];
                    Rectangulo.colorAct = this.colores[0];
                } else if (contador == 1) {
                    this.color = this.colores[i + 1];
                    Rectangulo.colorAct = this.colores[i + 1];

                }
            }
        }
    }

    public Rectangulo(Coordenada esquina1, Coordenada esquina2) {
        this.esquina1 = esquina1;
        this.esquina2 = esquina2;

        int contador = 0;
        for (int i = 0; i < 3; i++) {
            System.out.println(Rectangulo.colorAct);
            if (Rectangulo.colorAct == this.colores[i]) {
                contador += 1;
                if (i == 2 && contador == 1) {
                    this.color = this.colores[0];
                    Rectangulo.colorAct = this.colores[0];
                } else if (contador == 1) {
                    this.color = this.colores[i + 1];
                    Rectangulo.colorAct = this.colores[i + 1];

                }
            }
        }
    }

    public Coordenada getEsquina1() {
        return esquina1;
    }

    public void setEsquina1(Coordenada esquina1) {
        this.esquina1 = esquina1;
    }

    public Coordenada getEsquina2() {
        return esquina2;
    }

    public void setEsquina2(Coordenada esquina2) {
        this.esquina2 = esquina2;
    }

    @Override
    public String toString() {
        return String.format("color: %s \n esquina1: %s\n esquina2: %s", color, esquina1, esquina2);
    }
}
