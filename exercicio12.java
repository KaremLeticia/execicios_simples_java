import java.util.Scanner;

public class exercicio12  {
    public static void main(String[] args) {

        double raio, PI=3.14, area;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o valor do raio: ");
        raio = teclado.nextDouble();

        area = PI* (raio * raio);

        System.out.println("A area do círculo é: "+ area);

    }
}
