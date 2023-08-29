package testbicycle;

/**
 *
 * @author Alumno
 */
public class Bicycle {
    static int count;
    private String ownerName;
    private float distance;
    private String idBicy;
    public Bicycle (String ownerName, int distance){
        this.ownerName= ownerName;
        this.distance= distance;
        counter();
        String tempId = String.valueOf(10000* count);
    }

    public String getOwnerName() {
        return ownerName;
    }

    public float getDistance() {
        return distance;
    }
    
    public void distancetraveled (int meters){
        this.distance +=meters;
    }
    public static Bicycle mostUsed(Bicycle x, Bicycle y){
        if (x.distance > y.distance)
            return x;
        return y;
    }

    @Override
    public String toString() {
        String s = String.format("Bicycle : %s\nOwner : %\tDistance in meters ; %18.2f\n",this.idBicy, this.ownerName, this.distance);
    }
