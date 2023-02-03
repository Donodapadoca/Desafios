import java.util.Scanner;
import java.text.DecimalFormat;

public class Desafios {

    public static void main(String[] args) {
        int k = 0, soma = 0;

        // primeiro desafio
        for (int ind = 13; ind > k; k = k + 1) {
            soma += k;

        }

        System.out.printf("o valor do 1º desafio é: " + soma);
        System.out.println("\n");
        // segundo desafio
        int a = 1, b = 0, c = 0, v = 0, i2;

        Scanner d2 = new Scanner(System.in);

        System.out.println("Digite um valor de 1 a 100 para o 2º desafio:");
        i2 = d2.nextInt();

        for (int i = 0; i < 100; i++) {

            c = a;
            a = a + b;
            b = c;

            if (i2 == c) {
                v++;
            }

        }
        if (v == 1) {
            System.out.println("Ele faz parte da sequencia Fibonacci e aparece: " + v + " vez");
        } else if (v >= 2) {
            System.out.println("Ele faz parte da sequencia Fibonacci e aparece: " + v + " vezes");
        } else {
            System.out.println("Ele não faz parte da sequencia Fibonacci");
        }

        // terceiro desafio
        // Não consegui realizar o terceiro desafio.

        // quarto desafio

        double sp = 67836.43, rj = 36678.66, mg = 29229.88, es = 27165.48, outros = 19849.53;
        double total = sp + rj + mg + es + outros;
        double spp = sp / total, rjp = rj / total, mgp = mg / total, esp = es / total, outrosp = outros / total;

        DecimalFormat dformat = new DecimalFormat("#.00%");

        System.out.println("\nAs porcentagens dos faturamentos são:");
        System.out.println("São Paulo representa " + dformat.format(spp) + " do faturamento mensal");
        System.out.println("Rio de Janeiro representa " + dformat.format(rjp) + " do faturamento mensal");
        System.out.println("Minas Gerais representa " + dformat.format(mgp) + " do faturamento mensal");
        System.out.println("Espirito Santo representa " + dformat.format(esp) + " do faturamento mensal");
        System.out.println("Outros Estados representam " + dformat.format(outrosp) + " do faturamento mensal");

        // quinto desafio
        Scanner n = new Scanner(System.in);
        System.out.printf("\ndigite seu nome para:");
        String nome = n.next();
        String emon = "";

        for (int i = nome.length() - 1; i >= 0; i--) {
            emon = emon + nome.charAt(i);

        }
        System.out.println("seu nome ao contrario fica: " + emon);

    }

}
