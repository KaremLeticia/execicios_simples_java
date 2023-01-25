import java.util.Scanner;

public class exercicio6 {
    public static void main(String[] args) {

         int a, b, c;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite um valor para A:");
        a = teclado.nextInt();

        System.out.println("Digite um valor para B:");
        b = teclado.nextInt();

        c = a;
        a = b;
        b = c;

        System.out.println("Agora o valor de A é: " + a);
        System.out.println("E o valor de B é: " + b);



    }
}
