import java.util.Scanner;

public class exercicio03 {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Entre com o primeiro numero: ");
        int num1 = scan.nextInt();

        System.out.println("Entre com o segundo numero: ");
        int num2 = scan.nextInt();

        int resultado = num1 + num2;
        System.out.println("O resultado da soma é: " + resultado);


    }


}
