import java.util.Scanner;
public class Uri1041{
    public static void main(String arg[]){
        Scanner teclado=new Scanner(System.in);
        double x, y;
        
        x=teclado.nextDouble();
        y=teclado.nextDouble();
        
        if (x==0 && y==00) {
            System.out.println("Origem");
        }   
        else if (y==0 && x!=0) {
            System.out.println("Eixo X");
        }
        else if (x>0 && y>0) {
            System.out.println("Q1");
        }
        else if (x<0 && y>0) {
            System.out.println("Q2");
        }
        else if (x<0 && y<0) {
            System.out.println("Q3");
        }
        else if (x>0 && y<0) {
            System.out.println("Q4");
        }
        else {   
            System.out.println("Eixo Y");
        }
    
    }
}