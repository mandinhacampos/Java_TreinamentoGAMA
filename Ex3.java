import java.util.Scanner;

public class Ex3{
    public static void main(String args[]){
        Scanner teclado=new Scanner(System.in);
        double kw, minimo, residencia, consumo;

        System.out.println("Qual o valor (em reais) do salario minimo atual?\n");
        minimo=teclado.nextDouble();
        System.out.println("Qual o consumo em kw atual da residencia?\n");
        residencia=teclado.nextDouble();
        kw=minimo/700;
        System.out.println();
        System.out.println("O valor em reais de cada kw:\n"+ kw);
        System.out.println();
        consumo=kw*residencia;
        System.out.println("O valor em reais a ser pago em sua residencia:\n"+ consumo);
        System.out.println();
        consumo=consumo*0.9;
        System.out.println("Com descontode 10%, o valor em reais a ser pago em sua residencia:\n"+ consumo);
   }
}

