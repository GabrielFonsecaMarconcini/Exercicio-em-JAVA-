import java.util.Scanner;

public class exercicio13 {

    public static void main (String[]args){

        Scanner scan =new Scanner(System.in);

        System.out.println("Qual seu pagamento por hora: ");
        double ph= scan.nextDouble();
        System.out.println("Qual o numero de horas trabalhadas no mês: ");
        double ht= scan.nextDouble();




        double salariobruto= (ph*ht);
        double inss=(salariobruto/100)*8;
        double sind=(salariobruto/100)*5;
        double ir=(salariobruto/100)*11;
        double totaldescontos=inss+sind+ir;
        double salarioliquido=salariobruto-totaldescontos;

        System.out.println("Seu Salario Bruto é: " +salariobruto);

        System.out.println("Desconto INSS: " +inss);
        System.out.println("Desconto Sindicato: " +sind);
        System.out.println("Desconto IR: " +ir);
        System.out.println("Total Descontos: " +totaldescontos);
        System.out.println("Salario Linquido: " +salarioliquido);




    }




}
