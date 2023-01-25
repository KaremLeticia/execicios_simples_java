import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {

        String nome;
        double n1, n2, n3, media;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Nome do Aluno: ");
        nome = teclado.next();

        System.out.println("Digite a nota da primeira prova: ");
        n1 = teclado.nextDouble();

        System.out.println("Digite a nota da segunda prova: ");
        n2 = teclado.nextDouble();

        System.out.println("Digite a nota da terceita prova: ");
        n3 = teclado.nextDouble();

        media = (n1+n2+n3)/3;

        System.out.println(" A média aritimética de " +nome+ " é " + media);






    }
}
