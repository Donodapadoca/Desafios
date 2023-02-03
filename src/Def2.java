import java.util.Scanner;

public class Def2 {
    public static void main(String[] args) {

        int a = 1, b = 0, c = 0, v = 0, i2;
        // segundo desafio
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
            System.out.printf("Ele faz parte da sequencia e aparece: " + v + " vez");
        } else if (v >= 2) {
            System.out.printf("Ele faz parte da sequencia e aparece: " + v + " vezes");
        } else {
            System.out.printf("Ele não faz parte da sequencia");
        }

    }

}
