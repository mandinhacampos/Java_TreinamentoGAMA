import java.util.Scanner;

public class Exercicio2{
    public static void main(String args[]){
        Scanner teclado=new Scanner(System.in);
        double ladoQuadrado;
        double baseTriangulo;
        double alturaTriangulo;
        double areaTriangulo;
        double basemenorTrapezio;
        double basemaiorTrapezio;
        double alturaTrapezio;
        double areaTrapezio;

        System.out.println("Vamos calcular a area de um quadrado, por favor, digite um valor correspondente ao tamanho do lado: ");
        ladoQuadrado=teclado.nextDouble();
        ladoQuadrado=ladoQuadrado*ladoQuadrado;
        System.out.println();
        System.out.println("A area do quadrado="+ladoQuadrado);
        System.out.println();
        System.out.println();
        System.out.println("Agora, vamos calcular a area do triangulo. Comecando pela base:");
        baseTriangulo=teclado.nextDouble();
        System.out.println();
        System.out.println("Qual a altura do triangulo?");
        alturaTriangulo=teclado.nextDouble();
        areaTriangulo=(baseTriangulo*alturaTriangulo)/2;
        System.out.println();
        System.out.println();
        System.out.println("A area do triangulo="+areaTriangulo);
        System.out.println();
        System.out.println();
        System.out.println("Por ultimo, vamos calcular a area do trapezio. Comecando pela base menor:");
        basemenorTrapezio=teclado.nextDouble();
        System.out.println();
        System.out.println("A base maior:");
        basemaiorTrapezio=teclado.nextDouble();
        System.out.println();
        System.out.println("A altura do trapezio:");
        alturaTrapezio=teclado.nextDouble();
        areaTrapezio= (basemenorTrapezio+basemaiorTrapezio)*alturaTrapezio/2;
        System.out.println();
        System.out.println();
        System.out.println("A area do trapezio="+areaTrapezio); 

           



   }
}