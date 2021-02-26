import java.util.Scanner;

public class Uri1046{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int in, fi;
        int Tempo;
                
        //ENTRADA
        in = teclado.nextInt();
        fi = teclado.nextInt();
        
        //PROCESSAMENTO

        if (fi <= in) {
            fi+=24;
            System.out.printf("O JOGO DUROU %d HORA(S)",fi-in);
        }
        else if (in == fi) {
            System.out.printf("O JOGO DUROU 24 HORA(S)");
        }
        else {
            System.out.printf("O JOGO DUROU %d HORA(S)",fi-in);
        }
    }
}    