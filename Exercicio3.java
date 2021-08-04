import java.util.Scanner;

public class Ex3{
    public static void main(String args[]){
        Scanner teclado=new Scanner(System.in);
        double kw, minimo, residencia, consumo;

        System.out.println("Qual o valor (em reais) do salario minimo atual? %2.2f\n");
        minimo=teclado.nextDouble();
        System.out.println("Qual o consumo em kw atual da residencia? %2.2f\n");
        residencia=teclado.nextDouble();
        kw=minimo/700;

        System.out.println("O valor em reais de cada kw: %2.2f\n"+ kw);

        consumo=kw*residencia;
        System.out.println("O valor em reais a ser pago em sua residencia: %2.2f\n"+ consumo);
    
        consumo=consumo*0,9;
        System.out.println("Com descontode 10%, o valor em reais a ser pago em sua residencia: %2.2f\n"+ consumo);
   }
}

