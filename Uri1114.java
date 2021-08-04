import java.util.*;

public class Uri1114 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int senha = teclado.nextInt();
        
                    
        while (senha!=2002){
                
        	System.out.println("Senha invalida");
            senha = teclado.nextInt();      	
        }

        System.out.println("Acesso Permitido");

    }

}