import java.util.Scanner;

public class exercicio09 {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Digite a temperatura em Farenheint: ");
        double farenheint = scan.nextDouble();
        double Celsius = (5 * (farenheint - 32) / 9);
        System.out.println("A temperatura é de " + Celsius + "Graus Celcius");


    }


}
