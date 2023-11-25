public class App {
    public static void main(String[] args) throws Exception {
        
    Persona[] personas = {
        new Persona("Franco", "Mariano Melgar","000000000"),
        new Persona("Jason", "Jose Luis Bustamante y Rivero","111111111"),
        new Persona("Salvador", "Cerro Colorado","222222222")
    };
    Persona p1 = new Persona("Franco", "Mariano Melgar","000000000");
    Verificadora<Persona> verPersona = new Verificadora<Persona>(personas);
    String msg1 = verPersona.contiene(p1) ? "Si está en el arreglo" : "No está en el arreglo";
    System.out.println(msg1);

    Goodies[] goodies = {
        new Goodies(00001, "Galleta", 1.20f),
        new Goodies(00002, "Caramelo", 0.50f),
        new Goodies(00003, "Chicle", 0.40f)
    };
    Goodies g1 = new Goodies(00002, "Caramelo", 0.50f);
    Verificadora<Goodies> verGoodies = new Verificadora<Goodies>(goodies);
    String msg2 = verGoodies.contiene(g1) ? "Sí está en el arreglo" : "No está en el arreglo";
    System.out.println(msg2);

    Estudiante[] estudiantes = {
        new Estudiante("Franco", "Mariano Melgar", "000000000","Derecho", new Procedencia("Arequipa","Camana")),
        new Estudiante("Jason", "Jose Luis Bustamante y Rivero","111111111","Mecatronica", new Procedencia("Lima","Miraflores")),
        new Estudiante("Salvador", "Cerro Colorado","222222222","Sistemas", new Procedencia("Arequipa","Arequipa"))
    };
    Estudiante e1 = new Estudiante("Jason", "Socabaya", "333333333","Mecafgfgdfa", new Procedencia("Lima","Cercado"));
    Verificadora<Estudiante> verEstudiantes = new Verificadora<Estudiante>(estudiantes);
    String msg3 = verEstudiantes.contiene(e1) ? "Sí está en el arreglo" : "No está en el arreglo";
    System.out.println(msg3);
}
}
