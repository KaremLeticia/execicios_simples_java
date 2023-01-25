import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class exercicio7 {
    public static void main(String[] args) {

        double C, F;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Temperatura em Celsius: ");
        C = teclado.nextDouble();

        F = ((C * 9)/5) + C;

        System.out.println("A temperatura em Fahrenheit é: " + F);


    }
}
