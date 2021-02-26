import java.util.Scanner;

public class Uri1014{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int dist;
        double fuel, Cons;

        //ENTRADA
        dist = teclado.nextInt();
        fuel = teclado.nextDouble();
      
        
        //PROCESSAMENTO

        Cons = dist / fuel;

        //SAIDA
        System.out.printf("%.3f km/l\n",Cons);
    }
}