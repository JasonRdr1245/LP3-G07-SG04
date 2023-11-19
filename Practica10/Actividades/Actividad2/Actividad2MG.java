public class Actividad2MG {
    public static <T extends Comparable<T>> T minimo(T r, T a, T b, T c) {
        T min = r;
        if (a.compareTo(r) < 0)
            min = a;
        if (b.compareTo(a) < 0)
            min = b;
        if (c.compareTo(b) < 0)
            min = c;
        return min;
    }
    public static <T extends Comparable<T>> T maximo(T x, T y, T z,T a) {
        T max = x;
        if (y.compareTo(x) > 0)
            max = y;
        if (z.compareTo(y) > 0)
            max = z;
        return max;
    }
    

    public static void main(String[] args) throws Exception {
        
        
        // Implemetado del codigo mnimo
        System.out.printf("El maximo de %d, %d y %d es %d%n%n",3, 4, 5,6, maximo(3, 4, 5,6));
        System.out.printf("El maximo de %.1f, %.1f y %.1f es %.1f%n%n",6.6, 7.7, 8.8,9.9, maximo(6.6, 7.7, 8.8,9.9));

        // Para el caso de los objetos String la comparación se hace alfabéticamente.
        System.out.printf("El maximo de %s, %s and %s es %s%n%n","pera", "zanahoria", "uva","naranja", maximo("pera", "zanahoria", "uva","naranja"));
        
        System.out.printf("El minimo de %d, %d, %d y %d es %d%n%n",3, 4, 5, 6, minimo(3, 4, 5, 6));
        System.out.printf("El minimo de %.1f, %.1f, %.1f y %.1f es %.1f%n%n",6.6, 7.7, 8.8, 9.9, minimo(6.6, 7.7, 8.8, 9.9));
        // Para el caso de los objetos String la comparación se hace alfabéticamente.
        System.out.printf("El minimo de %s, %s, %s and %s es %s%n%n", "pera", "zanahoria","uva", "kiwi", minimo("pera", "zanahoria", "uva", "kiwi"));
        
        Persona persona1 = new Persona("Ximena", 25);
        Persona persona2 = new Persona("María", 30);
        Persona persona3 = new Persona("Carlos", 22);
        Persona persona4 = new Persona("Ana", 28); 
       
        System.out.printf("El nombre mayor es: %s%n%n", maximo(persona1, persona2, persona3, persona4));
        System.out.printf("El nombre mayor es: %s%n%n", maximo((persona1.getNombre()),(persona2.getNombre()),(persona3.getNombre()),(persona4.getNombre())));
        System.out.printf("La edad menor es: %s%n%n", minimo((persona1.getEdad()),(persona2.getEdad()),(persona3.getEdad()),(persona4.getEdad())));
        System.out.printf("La edad mayor es: %s%n%n", maximo((persona1.getEdad()),(persona2.getEdad()),(persona3.getEdad()),(persona4.getEdad())));
      
       
    }
    }
       
