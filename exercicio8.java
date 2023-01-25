import java.util.Scanner;

public class exercicio8 {
    public static void main(String[] args) {

        double  dolar, cotasao, conversao;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Quantidade de dolares para conversão: ");
        dolar = teclado.nextDouble();

        System.out.println("Digite a cotação do dolar ");
        cotasao = teclado.nextDouble();

        conversao = dolar * cotasao;

        System.out.println( +dolar+ " dolares é igual a " + conversao+ " reais");

    }
}
