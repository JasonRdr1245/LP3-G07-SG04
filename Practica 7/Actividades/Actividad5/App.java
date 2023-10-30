public class App {
    public static void main(String[] args) throws Exception {
        validaPropia(8);
    }
    public static void validaPropia(int n){
        try{
            minimo(n);
            System.out.println(n+" es mayor a 10");
        }catch(MiExcepcion e){
            System.out.println(e.getMessage());
        }
    }
    public static void minimo(int numero) throws MiExcepcion{
        if(numero<=10){
            throw new MiExcepcion("necesito un numero mayor a 10");
        }
    }
}
