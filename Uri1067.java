import java.util.Scanner;

public class Uri1067{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int X;
        int ini;
        
        X = teclado.nextInt();
             
        for (ini = 1; ini <= X; ini++) {
            if ( ini % 2 != 0){
                System.out.printf("%d\n", ini);
            }
            
        }
        
      
        
    }
}