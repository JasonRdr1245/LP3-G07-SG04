public class TestAsociation {
    public static void main(String[] args) throws Exception {
        Banco bcp=new Banco("BCP");
        Banco bbva=new Banco("BBVA",30);
        Persona persona1=new Persona("Jason", 22,72772985, 1000000, 10000, "C");
        Persona persona2=new Persona("Juan", 22,72772985, 1000000, 10000, "E");
        Persona persona3=new Persona("Pedro", 22,72772985, 1000000, 10000, "B");
        bcp.agregarCliente(persona3);
        bcp.agregarCliente(persona1);
        bbva.agregarCliente(persona2);
        bbva.agregarCliente(persona1);
        bcp.darBajaCliente(persona3);
        System.out.println(bcp);
        System.out.println("-----------------------");
        System.out.println(bbva);
        
        System.out.println("buscar cliente \n");
        

        System.out.println(bbva.buscarCliente(persona2));

        bbva.clienteTipo();

    }
}
