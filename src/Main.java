import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PilhaInt pilha = new PilhaInt();
        pilha.init();

        System.out.print("Digite um número: ");
        int numero = sc.nextInt();

        if (numero == 0) {
            System.out.println("Binário: 0");
            return;
        }

        int temp = numero;
        while (temp > 0) {
            int resto = temp % 2;
            pilha.push(resto);
            temp = temp / 2;
        }

        System.out.print("O número " + numero + " em binário é --> ");
        while (pilha.isEmpty()) {
            System.out.print(pilha.pop());
        }
        System.out.println();
    }
}