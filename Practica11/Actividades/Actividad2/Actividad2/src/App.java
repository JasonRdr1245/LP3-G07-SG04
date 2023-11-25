public class App {
    public static void main(String[] args) throws Exception {
        OrderedPair<Integer,Integer> parIntInt = new OrderedPair<Integer,Integer>(3,6);
		System.out.println(parIntInt);

		OrderedPair<Integer,String> parIntString = new OrderedPair<Integer,String>(1,"pan");
		System.out.println(parIntString);

		Persona p1 = new Persona("Franco","Mariano Melgar","111111111");
		OrderedPair<String,Persona> parStringPersona = new OrderedPair<String,Persona>("hola",p1);
		System.out.println(parStringPersona);
    }
}
