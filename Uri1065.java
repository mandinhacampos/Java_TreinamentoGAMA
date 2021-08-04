import java.util.*;

public class Uri1065 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int positivos, negativos, impares, pares;

        pares=0;
        impares=0;
        positivos=0;
        negativos=0;
        
        for (int contagem=1; contagem <6 ; contagem++){
            int num = teclado.nextInt();
            if(num%2==0){
                pares++;
            } else if(num%2!=0){
                impares++;
            }else if(num<0){
                negativos++;
            } else if(num>0){
                positivos++;
            } else {
                System.out.println("Zero");
            }
            
        }

        System.out.println(pares + " valor(es) par(es)");
        System.out.println(impares + " valor(es) impar(es)");
        System.out.println(positivos + " valor(es) positivo(s)");
        System.out.println(negativos + " valor(es) negativo(s)");
    }

}