public class continhas{
    public static void main(String args []){
        int a, b, c;

        a=23;
        b=2;
        c=a+b;

        System.out.println("valor da soma = "+c);

        c=a-b;
        System.out.println("valor da subtracao = "+c);

        c=a*b;
        System.out.println("valor da multiplicacao = "+c);
        System.out.println();
        System.out.println("==== agora continhas quebradas ====");
        System.out.println();
        System.out.println("valor da multiplicacao = "+c);

        float x, y, z;

        x=137;
        y=2.8f;
        z=x/y;
        System.out.println("valor da divisao = "+z);
        System.out.printf("formatado 1 %2.2f\n",z);
        System.out.printf("formatado 2 %3.3f\n",z);

    }
}   