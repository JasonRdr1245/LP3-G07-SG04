public class PruebaInterfazPorPagar{
    public static void main(String[] args) throws Exception {
        PorPagar[] objetosPorPagar=new PorPagar[5];
        objetosPorPagar[0]=new Factura("0134534", "asiento", 2, 375.00);
        objetosPorPagar[1]=new Factura("56789", "LLANTA", 4, 79.95);
        objetosPorPagar[2]=new EmpleadoAsalariado("Jhon", "Gonzales", "111-11-1111", 340);
        objetosPorPagar[3]=new EmpleadoAsalariado("Lisa", "Barnes", "8888-33-3213",1200);
        objetosPorPagar[4]=new Prestamo(4, 34.3);
        System.out.println("FACTURAS Y EMPLEADOS PROCESADOS DE FORMA POLIMORFICA\n");
        for(PorPagar porPagarActual:objetosPorPagar){
            System.out.printf("%s %n%s: $%,.2f%n%n",porPagarActual.toString(),"pago vencido",porPagarActual.obtenerMontoPago());
        }

    }
}
