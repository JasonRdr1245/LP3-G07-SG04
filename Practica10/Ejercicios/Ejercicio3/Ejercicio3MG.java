public class App<E>{
    //metodo generico
    public static<E> boolean isEqualTo(E a1, E a2){
        return a1.equals(a2);
    }
    public static void main(String[] args){
        //crecion objetos iguales para usar metodo isEqualTo
        Persona p1= new Persona("Franco", "Paredes");
        Persona p2= new Persona("Franco", "Paredes");
        System.out.println(isEqualTo(p1, p2));
        //creacion objetos diferentes
        Persona p3= new Persona("Franco", "Paredes");
        Persona p4= new Persona("Jason", "Rodriguez");
        System.out.println(isEqualTo(p3, p4));
        //Creacion integer iguales
        int a1 = 1, a2 = 1;
        System.out.println(isEqualTo(a1, a2));
        //Creacion  integer diferentes
        a1 = 6; a2 = 5;
        System.out.println(isEqualTo(a1, a2));
        //Creacion double iguales
        double b1 = 3.5, b2 = 3.5;
        System.out.println(isEqualTo(b1, b2));
        //Creacion double diferentes
        b1 = 6.5; b2 = 5.5;
        System.out.println(isEqualTo(b1, b2));
        //String igual
        String c1 = "perro", c2 = "perro";
        System.out.println(isEqualTo(c1, c2));
        //String diferentes
        c1 = "gato"; c2 = "paloma";
        System.out.println(isEqualTo(c1, c2));
    }
}
