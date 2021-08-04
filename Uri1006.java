import java.util.Scanner;
public class Uri1006{
    public static void main(String arg[]){
        Scanner teclado=new Scanner(System.in);
        double A, B, C, MEDIA;
        
        A=teclado.nextDouble();
        B=teclado.nextDouble();
        C=teclado.nextDouble();
        MEDIA=(0.2*A+0.3*B+0.5*C);
        
        System.out.printf("MEDIA = %.1f\n",MEDIA);
    }
}