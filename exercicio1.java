import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {

        int a, b, soma;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite um número:");
        a = teclado.nextInt();
        System.out.println("Digite outro número");
        b = teclado.nextInt();

        soma = a + b;

        System.out.println("A soma entre esses númemros é " + soma);


    }
}
