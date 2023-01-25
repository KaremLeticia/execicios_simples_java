import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        String nome;
        double salariofixo, salariofinal, comissao, vendas;

        Scanner sc = new Scanner(System.in);

        System.out.println("Nome do Vendedor: ");
        nome = sc.next();

        System.out.println("Salário inicial do vendedor: ");
        salariofixo = sc.nextDouble();

        System.out.println("Informe o seu total de vendas esse mês: ");
        vendas = sc.nextInt();

        comissao = (15 * vendas) / 100;
        salariofinal = comissao + salariofixo;

        System.out.println("Nome do vendedor: " + nome);
        System.out.println("Salário inicial: " + salariofixo);
        System.out.println("Seu salário final devido a comissão por venda é de: " + salariofinal);



    }
}
