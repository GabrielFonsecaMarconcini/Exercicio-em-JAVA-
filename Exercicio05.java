import java.util.Scanner;
import java.util.stream.StreamSupport;

public class Exercicio05 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println(" Entre com a quantidade de metros:");
        double metros = scan.nextDouble();


        double cm = metros * 100;
        System.out.println(metros + " Metros é igual a " + cm + " Centimetros");

    }

}







