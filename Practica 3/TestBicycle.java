package testbicycle;

/**
 *
 * @author Alumno
 */
public class TestBicycle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Bicycle a,b;
        a = new Bicycle("Adam Smith", 1);
        b = new Bicycle("Ben Jones", 5);
        a.distanceTraveled(240);
        System.out.println(b.getOwnerName());
        b.distaceTraveled(1100);
        Bicycle mostOld = Bicycle.mostUsed(a,b);
        System.out.println("mostOld");
        
    }
    
}

