public class Continhas{
    public static void main(String args[]){
        int a,b,c;

        a = 10;
        b = 7;

        c = a + b;
        System.out.println("Valor da Soma = " + c);

        c = a - b;
        System.out.println("Valor do Subt = " + c);

        c = a * b;
        System.out.println("Valor do Mult = " + c);

        c = a / b;
        System.out.println("Valor do Divi = " + c);

        c = a % b; // swui u pego o rsto da divisao de 10 por 7
        System.out.println("Valor do resto = " + c);

        float d;
        d =  (float)a / b;
        System.out.println("Valor da divisão Real = " + d);

        d = 10.0f/3;
        System.out.println("Valor da divisão = " + d);
    }
}
