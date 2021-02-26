import java.util.Scanner;
public class Triangulo{
    public static void main(String args[]){
        Scanner teclado;
        teclado = new Scanner(System.in);
        
        double a,Ba,Al;

        System.out.println("Digite o valor da base do Triangulo");
        Ba = teclado.nextDouble();

        System.out.println("Digite o valor da altura do Triangulo");
        Al = teclado.nextDouble();

        a = (Ba * Al) / 2;
        System.out.printf("Valor da Area do Triangulo: %.3f\n" , a);
        // usadno printf para poder definir quantidade de caracteres  %.3f (quantidade de caracteres e \n pula 1 linha)
    }
}