import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int A, B, som, sub, mult, div;

        System.out.println("Digite um número:");
        A = teclado.nextInt();
        System.out.println("Digite outro número");
        B = teclado.nextInt();

        som = A + B;
        System.out.println("A soma entre os  números é: " + som);

        sub = A - B;
        System.out.println("A subtração entre os  números é: " + sub);

        mult = A * B;
        System.out.println("A multiplicação entre os  números é: " + mult);

        div = A / B;
        System.out.println("A divisão entre os  números é: " + div);


    }
}
