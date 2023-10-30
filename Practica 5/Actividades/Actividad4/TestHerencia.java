public class TestHerencia {
    public static void main(String[] args) throws Exception {
        Asalariado empleado1 = new Asalariado("Juan", 72772985, 30);
        EmpleadoProduccion empleado2= new EmpleadoProduccion("Maria", 72772985, 30,"noche");
        EmpleadoDistribucion empleado3 = new EmpleadoDistribucion("Pedro", 72772985, 30,"AQP");
        System.out.println("El nombre del empleado 1 es "+empleado1.getNombre());
        System.out.println("El nombre del empleado 2 es "+empleado2.getNombre());
        System.out.println("El nombre del empleado 3 es "+empleado3.getNombre());
        System.out.println("La region del empleado 3 es "+empleado3.getRegion());
    }
}
