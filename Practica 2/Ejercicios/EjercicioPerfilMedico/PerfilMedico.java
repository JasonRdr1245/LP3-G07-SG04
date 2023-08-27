public class PerfilMedico {
    private String nombre, apellido, sexo;

    private Fecha fechaNacimiento;

    private double altura, peso;

    private int mes, ano, dia;

    public PerfilMedico(String nombre, String apellido, String sexo, int mes, int ano, int dia, double altura,
            double peso) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.sexo = sexo;
        this.mes = mes;
        this.ano = ano;
        this.dia = dia;
        this.fechaNacimiento = new Fecha(dia, mes, ano);
        this.altura = altura;
        this.peso = peso;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getSexo() {
        return sexo;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public Fecha getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Fecha fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }
    
    public int getEdad(){
        int currentYear = java.time.LocalDate.now().getYear();
        int currentMonth = java.time.LocalDate.now().getMonthValue();
        int currentDay = java.time.LocalDate.now().getDayOfMonth();

        int edad = currentYear - this.ano;

        if (currentMonth < mes || (currentMonth == mes && currentDay < dia)) {
            edad--;
        }

        return edad; 
    }

    public double getFMC(){
        return 208-7e-1f*getEdad();
    }

    public double getIMC(){
        return (float) this.peso/this.altura;
    }
}
