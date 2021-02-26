import java.util.Scanner;

public class Uri1065{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int N,C,QP;
     
        QP = 0;
        
        for (C = 1; C <= 5; C++){
           N = teclado.nextInt();
           if ( N % 2 == 0 ){
               QP++;
           }           
        }
        System.out.printf("%d valores pares\n", QP);
    }
}