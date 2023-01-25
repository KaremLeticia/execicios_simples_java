import java.util.Scanner;

public class exercicio10 {
    public static void main(String[] args) {

        double produto, valorparcelamento;
        int parcela = 5;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o valor do produto: ");
        produto = teclado.nextDouble();

        valorparcelamento = produto / 5;

        System.out.println("O valor das parcelas fica é de: " + valorparcelamento+ " reais.");




    }
}
