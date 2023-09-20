public class App {
    public static void main(String[] args) throws Exception {
        Rectangulo rectangulo = new Rectangulo(new Coordenada(1, 2), new Coordenada(5, 3));
        System.out.println(rectangulo);
        System.out.println(Manejador.area(rectangulo));
        System.out.println(Manejador.perimetro(rectangulo));
        Manejador.moverX(rectangulo, 4);
        Manejador.moverY(rectangulo, 3);
        System.out.println(rectangulo);
        Rectangulo rectangulo2 = new Rectangulo(4, 3);
        System.out.println(rectangulo2);
        Rectangulo rectangulo3 = new Rectangulo(4, 3);

        System.out.println(rectangulo3);
    }

}
