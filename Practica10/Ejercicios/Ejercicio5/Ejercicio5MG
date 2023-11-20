public class Ejercicio5MG {

    /**
     * @param args the command line arguments
     */    
    /* Metodo generico comentado solo porque este no sirve para absolutamente nada en este ejercicio
    public static <E> boolean isEqualTo(E a1, E a2) {
        return a1.equals(a2);
    }*/ 
    // Método genérico para buscar objetos por propiedad numérica
    public static <T, U extends Number> T buscarPorPropiedad(T[] array, U propiedad, FuncionObtenerPropiedad<T, U> funcion) {
        for (T elemento : array) {
            if (funcion.obtenerPropiedad(elemento).equals(propiedad)) {
                return elemento;
            }
        }
        return null; // Si no se encuentra ningún elemento con la propiedad dada
    }


    public static void main(String[] args) {
        // Creación de arreglos
        Persona[] personas = {
                new Persona("77031722", "Franco", "Paredes"),
                new Persona("72772985", "Jason", "Rodriguez")
        };

        Producto[] productos = {
                new Producto(101, "Queso", 100.0),
                new Producto(202, "Yogurth", 20.00)
        };

        Estudiante[] estudiantes = {
                new Estudiante("77031722", "Franco", "Paredes", "Medicina"),
                new Estudiante("72772985", "Jason", "Rodriguez", "Derecho")
        };

        // Prueba de buscarPorPropiedad con tipos numéricos
        Producto productoEncontrado = buscarPorCodigo(productos, 202);
        System.out.println("Producto encontrado: " + productoEncontrado);

        // El siguiente código dará un error de compilación porque no es un tipo numérico
        // Persona personaEncontrada = buscarPorNombres(personas, "Jason");
        // Estudiante estudianteEncontrado = buscarPorNombresYCarrera(estudiantes, "Jason", "Derecho");
    }
  
    // Interfaz funcional para obtener la propiedad numérica de un objeto
    interface FuncionObtenerPropiedad<T, U extends Number> {
        U obtenerPropiedad(T elemento);
    }

    // Implementaciones de la interfaz funcional para obtener la propiedad numérica de Producto
    static class ObtenerCodigoProducto implements FuncionObtenerPropiedad<Producto, Integer> {
        @Override
        public Integer obtenerPropiedad(Producto producto) {
            return producto.getCodigo();
        }
    }

    // Métodos específicos utilizando el método genérico
    public static Producto buscarPorCodigo(Producto[] productos, int codigo) {
        return buscarPorPropiedad(productos, codigo, new ObtenerCodigoProducto());
    }
}
