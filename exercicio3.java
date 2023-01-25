import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        double mediacombistivel, km1, km2, kmtotal, litros;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o KM inicial: ");
        km1 = teclado.nextDouble();

        System.out.println("Digite o KM final: ");
        km2 = teclado.nextDouble();

        System.out.println("Infome a quantidade de litros consumidos: ");
        litros = teclado.nextDouble();

        kmtotal = km1 + km1;

        mediacombistivel = kmtotal / litros;

        System.out.println("O total em KM percorridos foi "+kmtotal+ " kilometros.");
        System.out.println("A quantidade de combustível gasto por KM foi de " +mediacombistivel+ " litros");



    }
}
