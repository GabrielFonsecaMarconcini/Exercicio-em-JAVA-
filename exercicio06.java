import java.util.Scanner;

public class exercicio06 {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com o raio do circulo: ");
        double raio = scan.nextDouble();
        Object math;
        double area = Math.PI * Math.pow(raio, 2);
        System.out.println("A area do circulo é: " + area);


    }


}
