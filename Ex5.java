import java.util.Scanner;

public class Ex5{
    public static void main(String args[]){
        Scanner teclado=new Scanner(System.in);
        double distancia, velocidade, litros, tempo;

        System.out.println("Quanto tempo durara sua viagem (em horas)?\n");
        tempo=teclado.nextDouble();
        System.out.println("Qual a velocidade media da sua viagem (em km/h)?\n");
        velocidade=teclado.nextDouble();

        distancia=velocidade*tempo;
        litros=distancia/12;

        System.out.println("Voce percorrera " + distancia + " quilometros, consumindo "+ litros +" litros de combustivel.\n");




           }
}

