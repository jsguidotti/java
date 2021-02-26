import java.util.Scanner;

public class Uri1070{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int X;

        //X é ponto d epartida        
        X = teclado.nextInt();

        if ( ini % 2 == 0) {
            X++;
        }      
        for (int cont = 1; cont <= 6; cont++) {
            System.out.println(X);
              X = X +2;  
            }
            
        }
        
      
        
    }
}