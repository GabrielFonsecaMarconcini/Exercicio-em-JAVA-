import java.util.Scanner;

public class exercicio10 {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Digete a temperatura em graus Farenheit: ");

        double far = scan.nextDouble();

        double cel = (5 * (far - 32) / 9);
        System.out.println("A temperatura em graus Celsios é : " + cel);


    }
}
