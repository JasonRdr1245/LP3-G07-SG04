public class App<E>{
    public static<E> boolean isEqualTo(E a1, E a2){
        return a1.equals(a2);
    }
    public static void main(String[] args){

        Persona p1= new Persona("Franco", "Paredes");
        Persona p2= new Persona("Franco", "Paredes");
        System.out.println(isEqualTo(p1, p2));

        Persona p3= new Persona("Franco", "Paredes");
        Persona p4= new Persona("Salvador", "Zamora");
        System.out.println(isEqualTo(p3, p4));

        int a1 = 1, a2 = 1;
        System.out.println(isEqualTo(a1, a2));

        a1 = 6; a2 = 5;
        System.out.println(isEqualTo(a1, a2));

        double b1 = 3.5, b2 = 3.5;
        System.out.println(isEqualTo(b1, b2));

        b1 = 6.5; b2 = 5.5;
        System.out.println(isEqualTo(b1, b2));

        String c1 = "perro", c2 = "perro";
        System.out.println(isEqualTo(c1, c2));

        c1 = "gato"; c2 = "paloma";
        System.out.println(isEqualTo(c1, c2));
    }

}
