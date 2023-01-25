import java.util.Scanner;

public class exercicio15 {
    public static void main(String[] args) {

        int x,y;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite um número: ");
        x = teclado.nextInt();

        System.out.print("Digite outro número: ");
        y = teclado.nextInt();


        if (x>y){
            System.out.println(x + "..." + y);

        }else {
            if (y>x){
                System.out.println(y + "..." + x);
            }
        }

    }
}
