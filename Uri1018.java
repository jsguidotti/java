import java.util.Scanner;

public class Uri1018{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int N; //Valor do Saque
        int q100, q50, q20,q10,q5,q2,q1; //Quantidade de Cedulas
        int resto;


        //ENTRADA
        N = teclado.nextInt();
        
        //PROCESSAMENTO
        q100  = N / 100; //tomando o exemplo 576 q100 = 556 /100 = 5
        resto = N % 100; //resto = 576 % 100 = 76

        q50   = resto / 50; //76 / 50 = 2
        resto = resto % 50; //resto = 76 % 50 = 76

        q20   = resto / 20; //tomando o exemplo 576 q100 = 556 /100 = 5
        resto = resto % 20; //resto = 576 % 100 = 76

        q10   = resto / 10; //tomando o exemplo 576 q100 = 556 /100 = 5
        resto = resto % 10; //resto = 576 % 100 = 76

        q5    = resto / 5;  //tomando o exemplo 576 q100 = 556 /100 = 5
        resto = resto % 5;  //resto = 576 % 100 = 76

        q2    = resto / 2;  //tomando o exemplo 576 q100 = 556 /100 = 5
        resto = resto % 2;  //resto = 576 % 100 = 76
        
        q1    = resto;

        //SAIDA
        System.out.println(N);
        System.out.println(q100 + " nota(s) de R$ 100,00");
        System.out.println(q50  + " nota(s) de R$ 50,00");
        System.out.println(q20  + " nota(s) de R$ 20,00");
        System.out.println(q10  + " nota(s) de R$ 10,00");
        System.out.println(q5   + " nota(s) de R$ 5,00");
        System.out.println(q2   + " nota(s) de R$ 2,00");
        System.out.println(q1   + " nota(s) de R$ 1,00");
    }
}    