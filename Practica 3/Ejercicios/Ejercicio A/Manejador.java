public class Manejador {
    static public int area(Rectangulo r1) {
        return ((r1.getEsquina1().getX()) - (r1.getEsquina2().getX()))
                * ((r1.getEsquina1().getY()) - (r1.getEsquina2().getY()));
    }

    static public int perimetro(Rectangulo r1) {
        return Math.abs(2 * ((r1.getEsquina1().getX()) - (r1.getEsquina2().getX()))
                + 2*((r1.getEsquina1().getY()) - (r1.getEsquina2().getY())));
    }

    static public void moverX(Rectangulo r1, int x) {
        r1.getEsquina1().setX(x + r1.getEsquina1().getX());
        r1.getEsquina2().setX(x + r1.getEsquina2().getX());
    }

    static public void moverY(Rectangulo r1, int y) {
        r1.getEsquina1().setY(y + r1.getEsquina1().getY());
        r1.getEsquina2().setY(y + r1.getEsquina2().getY());

    }

}
