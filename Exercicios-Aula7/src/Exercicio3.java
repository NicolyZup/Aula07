import java.awt.*;
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe seu salário:");
        int salario = entrada.nextInt();

        double salarioMinimo = salario/1212;

        System.out.printf("Você recebe equivalente a %.1f salario(s) mínimo." , salarioMinimo );
    }
}
