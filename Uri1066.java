import java.util.Scanner;

public class Uri1066{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int N,Count,qtdPar,qtdImp,qtdNeg,qtdPos;
     
        qtdPar = 0;
        qtdImp = 0;
        qtdNeg = 0;
        qtdPos = 0;
        
        for (Count = 1; Count <= 5; Count++){
           N=teclado.nextInt();

           if (N % 2 == 0){
               qtdPar++;
                }
                else{
                    qtdImp++;
                }
            if (N < 0){
                qtdNeg++;
                }
                else if (N > 0) {  
                qtdPos++;
                }
        }
        System.out.printf("%d valor(es) par(es)\n", qtdPar);
        System.out.printf("%d valor(es) impar(es)\n", qtdImp);
        System.out.printf("%d valor(es) positivo(s)\n", qtdPos);
        System.out.printf("%d valor(es) negativo(s)\n", qtdNeg);
    }
}