import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


/**
 *
 * @author user
 */

public class Ejercicio6MG {
    
    
    public static <T> T[] copyArray(T[] arr1, T[] arr2) {
    Set<T> set = new HashSet<>(Arrays.asList(arr1));
    set.addAll(Arrays.asList(arr2));
    return set.toArray(Arrays.copyOf(arr1, 0));
}


    public static void main(String[] args) {
        String[] arr1 = {"hola", "mundo"};
String[] arr2 = {"mundo", "feliz", "día"};
String[] result1 = copyArray(arr1, arr2);
System.out.println(Arrays.toString(result1)); // imprime "[feliz, mundo, hola, día]"

Producto[] arr3 = {new Producto("producto1"), new Producto("producto2")};
Producto[] arr4 = {new Producto("producto2"), new Producto("producto3")};
Producto[] result2 = copyArray(arr3, arr4);
System.out.println(Arrays.toString(result2)); // imprime "[Producto{nombre='producto3'}, Producto{nombre='producto2'}, Producto{nombre='producto1'}]"

Persona[] arr5 = {new Persona("Franco", "Paredes"), new Persona("Salvador", "Zamora")};
Persona[] arr6 = {new Persona("Jason", "Rodriguez"), new Persona("Sebastian", "Chavez")};
Persona[] result3 = copyArray(arr5, arr6);
System.out.println(Arrays.toString(result3)); // imprime "[Persona{nombre='Pedro', apellido='López'}, Persona{nombre='María', apellido='García'}, Persona{nombre='Juan', apellido='Pérez'}]"

        
    }
}
