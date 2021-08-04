import java.util.Scanner;
public class Uri1002{
    public static void main(String arg[]){
        Scanner teclado=new Scanner(System.in);
        double area, n, raio;
        
        n=3.14159;
        raio=teclado.nextDouble();
        area=n*raio*raio;
        
        System.out.printf("A=%.4f\n",area);
    }
}