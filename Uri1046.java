import java.util.Scanner;
public class Uri1046{
    public static void main(String arg[]){
        Scanner teclado=new Scanner(System.in);
        int hinicial, hfinal, duracao;
        
        hinicial=teclado.nextInt();
        hfinal=teclado.nextInt();
        
        duracao = 24-(24 + hinicial - hfinal) % 24;

        if (hinicial == hfinal) {
            System.out.println("O JOGO DUROU 24 HORA(S)");
        } else {
            System.out.printf("O JOGO DUROU %d HORA(S)\n", duracao);
        }
    
    }
}