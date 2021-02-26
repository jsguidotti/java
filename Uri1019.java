import java.util.Scanner;

public class Uri1019{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int N,H,M,S;
        int resto; //variavel para pegar o resto 
              

        //ENTRADA
        N = teclado.nextInt();
        
        
        //PROCESSAMENTO
        H = N / 3600; //aqui eu pego o quociente da divisão
        resto = N % 3600; //aqui eu pego o resto

        M = resto / 60;
        S = resto % 60;
       
        //SAIDA
        System.out.println(H +":"+ M +":"+ S);
    }
}    