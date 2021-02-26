import java.util.Scanner;

public class Uri1017{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int Temp,Velo;
        double Dist,Comb;
      

        //ENTRADA
        Temp = teclado.nextInt();
        Velo = teclado.nextInt();
      
        
        //PROCESSAMENTO
        Dist = (Temp * Velo);
        Comb = (Dist / 12);

        //SAIDA
        System.out.printf("%.3f\n",Comb);
    }
}    