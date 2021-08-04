import java.util.*;

public class Uri1051 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        double salario = teclado.nextDouble();
        double imposto, resto;

        imposto=0;
        resto=0;        
        
        if (salario<=2000.00) {
            System.out.println("Isento");
        } else if (salario>2000.00 && salario<=3000.00){
            resto=salario-2000;
            imposto=resto*0.08;
            System.out.printf("R$ %.2f\n", imposto);
        } else if (salario>3000.00 && salario<=4500.00){
            resto=salario-3000;
            imposto=resto*0.18 + 80;
            System.out.printf("R$ %.2f\n", imposto);
        } else {
            resto=salario-4500;
            imposto=resto*0.28 + 350;
            System.out.printf("R$ %.2f\n", imposto);
        }

    }

}