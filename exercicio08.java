import java.util.Scanner;

public class exercicio08 {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Qual é o valor que você recebe por hora trabalhada: ");
        double pagamento = scan.nextDouble();
        System.out.println("Quantas horas você trabalha por mes: ");
        double hora = scan.nextDouble();

        double resultado = pagamento * hora;
        System.out.println("Seu salario ao final do mês é: " + resultado);


    }


}
