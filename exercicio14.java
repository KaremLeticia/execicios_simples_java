import java.util.Scanner;

public class exercicio14 {
    public static void main(String[] args) {

        int num1, num2;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite um número: ");
        num1 = teclado.nextInt();
        System.out.print("Digite mais um número: ");
        num2 = teclado.nextInt();

        if (num1<num2){
            System.out.println("o número "+ num1+ " é o menor número");

        } else{
            if (num1>num2){
                System.out.println("o número "+num2+ " é o menor número");
            }

        }


    }
}
