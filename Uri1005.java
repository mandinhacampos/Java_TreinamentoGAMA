import java.util.Scanner;
public class Uri1005{
    public static void main(String arg[]){
        Scanner teclado=new Scanner(System.in);
        double a, b, MEDIA;
        
        a=teclado.nextDouble();
        b=teclado.nextDouble();
        MEDIA=(0.35*a+0.75*b)/1.1;
        
        System.out.println("MEDIA = "+MEDIA);
        System.out.printf("MEDIA = %.5f\n",MEDIA);
    }
}