import java.util.Scanner;

public class exercicio11 {
    public static void main(String[] args) {

        double precodecusto, acresssimo, valordevenda;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Escreva o valor de custo de um produto: ");
        precodecusto = teclado.nextDouble();

        System.out.println("Escreva a porcetagem de acrescimo ao valor do produto: ");
        acresssimo = teclado.nextDouble();

        valordevenda = (precodecusto * acresssimo) / 100 + precodecusto ;

        System.out.println("O valor de venda vai ser de: " + valordevenda+ " reais");
    }
}
