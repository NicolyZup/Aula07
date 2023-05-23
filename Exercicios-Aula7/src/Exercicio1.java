import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o peso de peixes pescados:");
        int kilosPeixes = entrada.nextInt();

        if(kilosPeixes>50){
            int excesso = kilosPeixes - 50;
            double multa = excesso * 4;
            System.out.println("O execesso de peso é: "  + excesso);
            System.out.printf("O valor da multa pelo excesso de peso é R$%.2f." , multa);
        } else {
            System.out.println("Não há multa, peso de peixes dentro do permitido.");
        }
    }
}
