import java.util.Scanner;
public class Uri1008{
    public static void main(String arg[]){
        Scanner teclado=new Scanner(System.in);
        int num, horas;
        double salario, salary;
        
        num=teclado.nextInt();
        horas=teclado.nextInt();
        salario=teclado.nextDouble();
        salary=horas*salario;
        
        System.out.println("NUMBER = "+num);
        System.out.printf("SALARY = U$ %.2f\n", salary);
        
    }
}