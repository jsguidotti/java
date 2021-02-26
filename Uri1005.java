import java.util.Scanner;

public class Uri1005{
    public static void main(String args[]){
       Scanner teclado = new Scanner(System.in);
        
       double A,B,C,M;

       //ENTRADA
        A = teclado.nextDouble() * 2;
        B = teclado.nextDouble() * 3;
        C = teclado.nextDouble() * 5;

       //PROCESSAMENTO
       
       M = (A + B + C) / 3;

        //SAIDA
        System.out.printf("MEDIA = %.5f\n", M);

    }
}