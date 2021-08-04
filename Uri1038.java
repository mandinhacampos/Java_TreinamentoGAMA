import java.util.Scanner;
public class Uri1038{
    public static void main(String arg[]){
        Scanner teclado=new Scanner(System.in);
        int codigo, quantidade;
        double valor;
        
        codigo=teclado.nextInt();
        quantidade=teclado.nextInt();
        valor=0;
        if (codigo==1) {
            valor=4.00;
        }   
        else if (codigo==2) {
            valor=4.50;
        }
        else if (codigo==3) {
            valor=5.00;
        }
        else if (codigo==4) {
            valor=2.00;
        }
        else {   
                valor=1.50;
        }
        System.out.printf("Total: R$ %.2f\n",(quantidade*valor));
    }
}