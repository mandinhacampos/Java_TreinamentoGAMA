import java.util.Scanner;

public class Leitura{
    public static void main(String args[]){
        Scanner teclado=new Scanner(System.in);
        int valorInteiro;
        float valorFloat;
        double valorDouble;

        System.out.println("Digite um valor inteiro");
        valorInteiro=teclado.nextInt();

        System.out.println("Digite um valor decimal com uso de virgula");
        valorDouble=teclado.nextDouble();

        System.out.println("Valor inteiro digitado foi:"+valorInteiro);
        System.out.println("Valor decimal digitado foi:"+valorDouble);


    }
}