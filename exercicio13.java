import java.util.Scanner;

public class exercicio13 {
    public static void main(String[] args) {

        int num;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite um número: ");
        num = teclado.nextInt();

        if (num>20){
            System.out.println("número "+num+" é maior que 20");

        }else{
            if (num<20){
                System.out.println("o número é menor que 20");
            }
        }
    }
}
