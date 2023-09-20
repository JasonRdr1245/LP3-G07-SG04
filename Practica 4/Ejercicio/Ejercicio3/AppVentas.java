package appventas;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class AppVentas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
		int matriz[][] = new int[4][5];
		int ventaTotal = 0;
		int cont = 0;
		int monto;
		int vendio[] = new int[4];
		int ventaProducto[] = new int [5];		
		for (int i=0; i<4; i++) {
			ventaTotal=0;
			System.out.println("VENDEDOR#"+(i+1));
			do {
				for(int j = 0; j < 5; j++) {
					System.out.println("PRODUCTO#"+(j+1));
					System.out.println("Ingrese el codigo: ");
					int codigo = sc.nextInt();
					cont++;
					System.out.println("PRODUCTO#"+(j+1));
					System.out.println("Ingrese el monto total vendido");
					System.out.println("por el producto con codigo "+codigo);
					monto = sc.nextInt();
					matriz[i][j] = monto;
					ventaTotal += matriz[i][j];
				}
			System.out.println("El VENDEDOR#"+(i+1)+" vendio un total de "+ventaTotal);	
			}while(cont<5);
		}
		System.out.println("Matriz: PRECIO POR EL CUAL SE VENDIO CADA PRODUCTO");
		for(int i=0; i<4; i++) {
			if (i!=0) {
				System.out.println();
			}
			for(int j=0; j<5; j++) {
				System.out.print(" "+matriz[i][j]);
			}
		}
		System.out.println();
		System.out.println("Matriz: CANTIDAD DE DINERO RECAUDADO POR CADA VENDEDOR");
		for(int i=0; i<4; i++) {
			vendio[i]=0;
			for(int j=0; j<5; j++) {
				vendio[i] += matriz[i][j];
			}
			System.out.println("El vendedor #"+(i+1)+"recaudo "+vendio[i]+" dolares");
		}
		System.out.println("Matriz: MONTO TOTAL RECAUDADO POR CADA PRODUCTO");
		for(int j=0; j<5; j++) {
			ventaProducto[j] = 0;
			for (int i = 0; i < 4; i++) {
				ventaProducto[j] = ventaProducto[j] + matriz[i][j];
			}
			System.out.println("Producto #"+(j+1)+" "+"se recaudo "+ventaProducto[j]+" dolares");
		}
    }
    
}

