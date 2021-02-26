import java.util.Scanner;
public class Quadrado{
    public static void main(String args[]){
        Scanner teclado;
        teclado = new Scanner(System.in);
        
        double a,la;

        //Entrada
        System.out.println("Digite o valor Lateral do Quadrado");
        la = teclado.nextDouble();

        //Processamento
        a = la * la;
        System.out.println("Valor da Area de um Quadrado = " + a);

    }
}