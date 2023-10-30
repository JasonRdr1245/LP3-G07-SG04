public class EmpleadoDistribucion extends Asalariado{
    private String region;
    public EmpleadoDistribucion(String nombre,long dni,int diasDeVacaciones,String region){
        super(nombre,dni,diasDeVacaciones);
        this.region = region;
    }
    public String getRegion(){return this.region;}
    public void setRegion(String region){this.region = region;}
}
