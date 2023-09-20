package calcularfecha;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class Fecha {
    private int dia;
    private int mes;
    private int anio;
    
    //construtcot
    public Fecha(int dia, int mes, int anio){
        this.dia=dia;
        this.mes = mes;
        this.anio= anio;
        this.validar(); //se asegura que la fecha este en el rango permitido
    }
    public Fecha(){
        this(1,1,1900);
    }
    //clase leer o ingreso de datos
    public void leer(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Ingresar Dia(1/31): ");
        int dia=sc.nextInt();
        this.dia=dia;
        System.out.println("Ingresar Mes(1/12): ");
        int mes=sc.nextInt();
        this.mes=mes;
        System.out.println("Ingresar Dia(1900/2050): ");
        int anio=sc.nextInt();
        this.anio=anio;
        this.validar();
        
    }
        
    //Cuantos dias en el mes
    public int diasMes(int mes){
        switch (mes){
            case 1: return 31;
            case 2:
                if(this.bisiesto()==true)
                    return 29;
                return 28;
            case 3: return 31;
            case 4: return 30;
            case 5: return 31;
            case 6: return 30;
            case 7: return 31;
            case 8: return 31;
            case 9: return 30;
            case 10:return 31;
            case 11:return 30;
            case 12:return 31;
        }return 0;
    }
    //bisiesto
    public boolean bisiesto(){
        if((this.anio % 4==0) &&((this.anio % 100!=0) || (this.anio % 400 == 0)))
            return true;
        return false;
    }
    
    //getters and setters  || accessors and mutators 

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
    //validar fecha de rango
    private void validar(){
        if (this.anio >= 2051 || this.anio <= 1899)
            setAnio(1900);
        if (this.mes >= 13 || this.mes <= 0)
            setMes(1);
        if (this.dia >= 32 || this.dia <= 0)
            setDia(1);
        else {
            if (this.dia > diasMes(this.mes))
                setDia(1);
        }
    }
    //dedvolver fecha en formato corto
    private String Corta(){
    String cadDia = String.format("%02d" , this.dia);/*el .format formatea la cadena
    y se especifica con el %02d d para enteros y si la cadena es 2 digitos use 05 09*/
    String cadMes = String.format("%02d" , this.mes);
    return (cadDia + "-" + cadMes +"-" + this.anio);
    }
    
    //clase que calcula los dias transcurridos desde 1-1-1900
    private int DiasTranscurridos(){
        Fecha count= new Fecha();
        int countDias = 0;
        while (count.dia != this.dia || count.mes!= count.mes || count.anio!=this.anio){
            count.fechaTras(1);
            countDias++;            
        }
        return countDias;
    }
    //cuenta los dias 1 a 1
    private void fechaTras(long a){
        this.dia=1;
        this.mes=1;
        this.anio=1900;
        for (int i =0; i <a; i++){
            this.siguientes();
        }
    }
    //pasa al dia siguientes
    private void siguientes(){
        if(this.dia ==this.diasMes(this.mes)){
            if(this.mes==12){
                this.mes =1;
                this.dia=1;
                this.setAnio(++anio);
                }else {this.dia=1; this.setMes(++mes);}
        }
    }
    //Calcula el dia anterior
    private void anterior(){
        if(this.dia==1){
            if(this.mes==1){
                this.mes=12;
                this.dia=31;
                this.anio-=1;
            }else{this.mes-=1; this.dia=this.diasMes(this.mes);}
        }
    }
    //calcula el dia de la semana viendo el residuo de los dias transcurridos
    public int diaSemana(){
        int TransDias = (this.DiasTranscurridos()%7);
        switch (TransDias){
            case 0: return 0;
            case 1: return 1;
            case 2: return 2;
            case 3: return 3;
            case 4: return 4;
            case 5: return 5;
            case 6: return 6;
        }return 0;}
    //Copia la fecha
    public Fecha copia() {
        return new Fecha(this.dia, this.mes, this.anio);//cre una nueva instancia para la clase fecha
    }
    //calcula los dias entre la fecha y la segunda fecha dada
    public int diasEntre(Fecha f1, Fecha f2){
        return (f1.DiasTranscurridos()-f2.DiasTranscurridos());       
    }
    //el dia de mañana sera o la cantidad de dias a posterior
    public void fechaFutura(int nDia){
        for (int i=0; i<nDia; i++){
            this.siguientes();
        }
    }
    //Igual menor y mayor que fecha
    public static boolean igualQue(Fecha f1, Fecha f2){
        if (f1.dia==f2.dia && f1.mes==f2.mes && f1.anio==f2.anio)
            return true;
        return false;
    }
    public static boolean menorQue(Fecha f1, Fecha f2){
        if(f1.anio<=f2.anio){
            if(f1.mes<=f2.mes){
                if(f1.dia<=f2.dia)
                    return true;
            }
        }return false;
    }
    
    public static boolean mayorQue(Fecha f1, Fecha f2){
        if(f1.anio>=f2.anio){
            if(f1.mes>=f2.mes){
                if(f1.dia>=f2.dia)
                    return true;
            }
        }return false;   
    }
    //fecha larga
    public String Larga(){
        String[] Meses ={"0","Enero","Febrero","Marzo","Abril","Mayo",
        "Junio","Julio","Agosto","Setiembre","octubre","Noviembre","Diciembre"};
        String[] Dias = {"Domingo","Lunes","Martes","Miercoles"
        ,"Jueves","Viernes","Sabado"};
        return (Dias[this.diaSemana()]+ " "+this.dia+" de "+Meses[this.mes]+" del "+this.anio);
        
    }
     
    }

