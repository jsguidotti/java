import java.util.Scanner;
public class Cubo{
    public static void main(String args[]){
        Scanner teclado;
        teclado = new Scanner(System.in);
        
        int vl,la,lb,lc;

        System.out.println("Digite o valor da Lado A do Cubo");
        la = teclado.nextInt();

        System.out.println("Digite o valor da Lado B do Cubo");
        lb = teclado.nextInt();

        System.out.println("Digite o valor da Lado C do Cubo");
        lc = teclado.nextInt();

        vl = la * lb * lc;
        System.out.println("Volume Total do Cubo = " + vl);

    }
}