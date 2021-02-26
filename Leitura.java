// Primeira coisa importar a biblioteca ou componente de leitura de dados
import java.util.Scanner;
public class Leitura{
    public static void main(String args[]){
        //criar o componente, informando que ele irá ler do teclado
        Scanner teclado;
        teclado = new Scanner(System.in);

        int a;
        double b;

        System.out.println("Digite o valor inteiro");
        a = teclado.nextInt();
        System.out.println("Voce digitou = " + a);

        System.out.println("Digite o valor Real");
        b = teclado.nextDouble();
        System.out.println("Voce digitou = " + b);

    }
}