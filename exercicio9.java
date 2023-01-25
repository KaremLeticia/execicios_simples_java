import java.util.Scanner;

public class exercicio9 {
    public static void main(String[] args) {

        double valordepositado, rendimento, juros;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Qual foi o valor que você depositou? ");
        valordepositado = teclado.nextDouble();

        juros = (valordepositado * 0.70) / 100;
        rendimento = valordepositado + juros;

        System.out.println("O valor do rendimento após um mês é de: "+ rendimento+ " reais");

    }
}
