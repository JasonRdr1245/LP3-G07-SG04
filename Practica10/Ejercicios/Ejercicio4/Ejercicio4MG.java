import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio4MG {
    public static<E> boolean isEqualTo(E a1, E a2){
        return a1.equals(a2);
    }
    public static void main(String[] args){
        // Creación de un arreglo de la clase Persona
     // Creación de un arreglo de la clase Persona
    Persona[] personas = new Persona[2];
    personas[0] = new Persona("77031722", "Franco", "Paredes");
    personas[1] = new Persona("72772985", "Jason", "Rodriguez");
    //System.out.println(isEqualTo(personas[0], personas[1]));

    // Creación de un arreglo de la clase Producto
    Producto[] productos = new Producto[2];
    productos[0] = new Producto(101, "Queso", 100.0);
    productos[1] = new Producto(202, "Yogurth", 20.00);
    //System.out.println(isEqualTo(productos[0], productos[1]));

    // Creación de un arreglo de la clase Estudiante
    Estudiante[] estudiantes = new Estudiante[2];
    estudiantes[0] = new Estudiante("77031722", "Franco", "Paredes", "Medicina");
    estudiantes[1] = new Estudiante("72772985", "Jason", "Rodriguez", "Derecho");
    // Búsqueda en los arreglos
        Persona personaEncontrada = buscarPorNombres(personas, "Jason");
        Producto productoEncontrado = buscarPorCodigo(productos, 202);
        Estudiante estudianteEncontrado = buscarPorNombresYCarrera(estudiantes, "Jason", "Derecho");

        // Imprimir resultados
        System.out.println("Persona encontrada: " + personaEncontrada);
        System.out.println("Producto encontrado: " + productoEncontrado);
        System.out.println("Estudiante encontrado: " + estudianteEncontrado);
    }

    // Método genérico para buscar objetos por propiedad
    public static <T, U> T buscarPorPropiedad(T[] array, U propiedad, FuncionObtenerPropiedad<T, U> funcion) {
        for (T elemento : array) {
            if (funcion.obtenerPropiedad(elemento).equals(propiedad)) {
                return elemento;
            }
        }
        return null; // Si no se encuentra ningún elemento con la propiedad dada
    }

    // Interfaz funcional para obtener la propiedad de un objeto
    interface FuncionObtenerPropiedad<T, U> {
        U obtenerPropiedad(T elemento);
    }

    // Implementaciones de la interfaz funcional para obtener la propiedad de Persona, Producto y Estudiante
    static class ObtenerNombrePersona implements FuncionObtenerPropiedad<Persona, String> {
        @Override
        public String obtenerPropiedad(Persona persona) {
            return persona.getNombres();
        }
    }

    static class ObtenerCodigoProducto implements FuncionObtenerPropiedad<Producto, Integer> {
        @Override
        public Integer obtenerPropiedad(Producto producto) {
            return producto.getCodigo();
        }
    }

    static class ObtenerNombreEstudiante implements FuncionObtenerPropiedad<Estudiante, String> {
        @Override
        public String obtenerPropiedad(Estudiante estudiante) {
            return estudiante.getNombres();
        }
    }

    // Métodos específicos utilizando el método genérico
    public static Persona buscarPorNombres(Persona[] personas, String nombre) {
        return buscarPorPropiedad(personas, nombre, new ObtenerNombrePersona());
    }

    public static Producto buscarPorCodigo(Producto[] productos, int codigo) {
        return buscarPorPropiedad(productos, codigo, new ObtenerCodigoProducto());
    }

    public static Estudiante buscarPorNombresYCarrera(Estudiante[] estudiantes, String nombre, String carrera) {
        return buscarPorPropiedad(estudiantes, nombre, new ObtenerNombreEstudiante());
    }
}
