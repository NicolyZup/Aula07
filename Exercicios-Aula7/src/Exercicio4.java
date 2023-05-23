import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe sua idade completa em anos, meses e dias respectivamente (ex: 3 anos, 2 meses e 15 dias):");
        int anos = entrada.nextInt();

        System.out.println("meses:");
        int meses = entrada.nextInt();

        System.out.println("dias:");
        int dias = entrada.nextInt();

        long diasAnos = anos * 365;
        int diasMeses = meses * 30;

        long resultado = diasAnos + diasMeses + dias;

        System.out.println("Sua idade total em dias é: " + resultado);
    }
}
