import java.util.Scanner;

public class Uri1001{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int A,B,X;

        //ENTRADA
        A = teclado.nextInt();
        B = teclado.nextInt();

        //PROCESSAMENTO

        X = A + B;

        //SAIDA
        System.out.println("X = " + X);
    }
}