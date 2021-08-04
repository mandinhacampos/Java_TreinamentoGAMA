import java.util.*;

public class Uri1067 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int num = teclado.nextInt();
                
        for (int contagem=1; contagem<=12 ; contagem++){
            if(contagem%2!=0){
               System.out.println(num+contagem); 
            }
            
        }

    }

}