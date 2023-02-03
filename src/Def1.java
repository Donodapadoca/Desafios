import java.util.Scanner;

public class Def1 {

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
            System.out.println("Ele faz parte da sequencia e aparece: " + v + " vez");
        } else if (v >= 2) {
            System.out.println("Ele faz parte da sequencia e aparece: " + v + " vezes");
        } else {
            System.out.println("Ele não faz parte da sequencia");
        }


        //terceiro desafio



        //quarto desafio

        

        // quinto desafio
        Scanner n = new Scanner(System.in);
        System.out.println("\ndigite seu nome: ");
        String nome = n.next();
        String emon = "";

        for (int i = nome.length() - 1; i >= 0; i--) {
            emon = emon + nome.charAt(i);

        }
        System.out.println(emon);

    }

}
