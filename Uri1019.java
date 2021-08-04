import java.util.Scanner;
public class Uri1019{
    public static void main(String arg[]){
        Scanner teclado=new Scanner(System.in);
        int tempo, horas, segundos, minutos;
        
        tempo=teclado.nextInt();
        segundos=(tempo) %60;
        minutos=(tempo/60) %60;
        horas=(tempo/3600);
        
        
        System.out.println(String.format ("%d:%d:%d", horas, minutos, segundos));
    }
}