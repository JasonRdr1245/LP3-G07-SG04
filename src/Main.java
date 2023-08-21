import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Intro with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
 
        int vida,r p ;
        bool e an fl=false;
        vida=0;  
        Scanner sc=new Scanner(System.in);
        do {
            vida++;    
            Sy s tem.out.println("Vida:"+vida+"\t¿Cual es el numero secreto?");
            rp =sc .n extInt();
            if(rp= = 1234)
                 fl=t r ue;
        
        }while  ( vida<3 && !fl);;
        if (fl==true)
            System.out.println("Adivinaste");
        else
            System.out.println("ups,perdiste");
    }
}
//dfhfdhfhfh