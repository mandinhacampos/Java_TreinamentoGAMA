import java.util.Scanner;
public class Uri1018{
    public static void main(String arg[]){
        Scanner teclado=new Scanner(System.in);
        int n, n100, n50, n20, n10, n5, n2, n1;
        
        n=teclado.nextInt();
        System.out.println(n);
        n100=(n/100);
        n=n%100;
        n50=(n/50);
        n=n%50;
        n20=(n/20);
        n=n%20;
        n10=(n/10);
        n=n%10;
        n5=(n/5);
        n=n%5;
        n2=(n/2);
        n1=n%2;
        
        
        System.out.println(n100 + " nota(s) de R$ 100,00");
        System.out.println(n50 + " nota(s) de R$ 50,00");
        System.out.println(n20 + " nota(s) de R$ 20,00");
        System.out.println(n10 + " nota(s) de R$ 10,00");
        System.out.println(n5 + " nota(s) de R$ 5,00");
        System.out.println(n2 + " nota(s) de R$ 2,00");
        System.out.println(n1 + " nota(s) de R$ 1,00");
    }
}