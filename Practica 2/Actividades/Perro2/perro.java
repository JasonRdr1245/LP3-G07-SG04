public class Perro {
    private String raza;
    private String color;
    private double temp;
    private int edad;
    public double peso; // no se va a crear get y set para peso, es publico

    /*-----------------Constructores----------------------*/

    public Perro(String raza, String color) {
        this.raza = raza;
        this.color = color;
        this.temp = 37;
        this.edad = 1;
        this.peso = 0.5;
    }

    public Perro() {
        this.raza = "chusco";
        this.color = "gris";
        this.temp = 37;
        this.edad = 1;
        this.peso = 0.5;
    }
    /*-----------------Gets - Sets ----------------------*/

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getTemp() {
        return temp;
    }

    public void setTemp(double temp) {
        this.temp = temp;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    /*---------------------Métodos----------------------*/

    public void ladrar() {
        System.out.println("Guau Guau");
    }

    public void dormir() {
        System.out.println("zzz zzzz");
    }

    public void comer() {
        System.out.println("pka pka");
    }

    public void increEdad(int anios) {
        this.edad = this.edad + anios;
        cambiarPeso(anios);
    }

    private void cambiarPeso(int anios) {
        this.peso = this.peso + (anios * 1.5);
    }

    /*---------------------Método tostring----------------------*/
    /* Sirve para devolver el resumen del objeto */
    public String tostring() {
        return "Perro(" + "raza= " + raza + ", color= " + color + ", temp= " + temp + " grados " +
                ", edad= " + edad + " anios" + ", peso=" + peso + "kg" + ')';
    }

    /*-----------Métodos de salida----------------------*/

    public void salida() {
        System.out.println("La raza del canino es:" + getRaza());
        System.out.println("El color del canino es:" + getColor());
        System.out.println("La edad del canino es:" + getEdad());
        System.out.println("El peso del canino es:" + peso);
        System.out.println("La temperatura del canino es:" + getTemp());
    }
}

