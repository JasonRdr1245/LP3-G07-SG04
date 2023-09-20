public class Coordenada {
    private int x;

    private int y;

    public Coordenada(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Coordenada(int x) {
        this.x = x;
    }

    public Coordenada() {
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }


    double distancia(Coordenada c){
       double distance;
       distance = Math.sqrt(c.getX()^2+c.getY()^2);
       return distance; 
    }
    static double distancia(Coordenada c1,Coordenada c2){
        double distance;
        distance=Math.sqrt((c1.getX()-c2.getX())^2+(c1.getY()-c2.getY())^2);
        return distance;
    }

    @Override
    public String toString(){
        return String.format("coordenada: (%d,%d)",this.x,this.y);
    }

}
