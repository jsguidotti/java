import java.util.Scanner;
public class Trapezio{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        
        float ar,Bma,Bme,Al;

        System.out.print("Digite o valor da Base Maior do Trapezio");
        Bma = teclado.nextFloat();

        System.out.print("Digite o valor da Base Menor do Trapezio");
        Bme = teclado.nextFloat();

        System.out.println("Digite o valor da Altura do Trapezio");
        Al = teclado.nextFloat();

        ar = (Bma + Bme)* Al / 2;
        System.out.printf("Valor da Area do Trapezio %.2f e Altura /5.2f Vale %.2f\n" , Bma, Bme, Al , ar);

    }
}