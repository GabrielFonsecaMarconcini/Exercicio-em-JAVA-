import java.util.Scanner;

public class exercicio14 {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com o tamanho do arquivo em MB: ");
        double tamarquivo = scan.nextDouble();
        System.out.println("Insira a velocidade da sus internet em Mbps: ");
        double velointer = scan.nextDouble();

        double tempdow=tamarquivo/velointer;

        System.out.println("Tempo estimado para Dowload em segundos é de: "+tempdow);









    }
}
