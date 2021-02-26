import java.util.Scanner;

public class Uri1008{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int Num, qtdHoras;
        float ValorHora, Salario;

        //ENTRADA
        Num = teclado.nextInt();
        qtdHoras = teclado.nextInt();
        ValorHora = teclado.nextFloat();
        
        //PROCESSAMENTO

        Salario = qtdHoras * ValorHora;

        //SAIDA
        System.out.println("NUMBER = " + Num);
        System.out.printf("SALARY = U$ %.2f\n", Salario);
    }
}