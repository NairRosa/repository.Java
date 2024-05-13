import java.util.Scanner;

public class classificacaoDeNumeros {

    static int quantidadeNumeros;
    static int pares = 0;
    static int impares = 0;
    static int multiplosDeCinco = 0;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Pede ao usuário a quantidade de números a serem classificados
        do {
            System.out.println("Quantos números você deseja classificar?");
            quantidadeNumeros = sc.nextInt();
            if (quantidadeNumeros <= 0) {
                System.out.println("Por favor, informe um número positivo.");
            }
        } while (quantidadeNumeros <= 0);

        System.out.println("Informe " + quantidadeNumeros + " números inteiros positivos:");

        // For para controlar a quantidade de números
        for (int i = 0; i < quantidadeNumeros; i++) {
            int numero;
            // Do-while executa pelo menos uma vez, garantindo que haja pelo menos uma entrada
            do {
                numero = sc.nextInt();
                // Condições para classificação dos números
                if (numero <= 0) {
                    System.out.println("Por favor, informe um número inteiro positivo.");
                } else {
                    if (numero % 2 == 0) {
                        pares++;
                    } else {
                        impares++;
                    }
                    if (numero % 5 == 0) {
                        multiplosDeCinco++;
                    }
                }
            } while (numero <= 0);
        }

        System.out.println("Quantidade de números ímpares: " + impares);
        System.out.println("Quantidade de números pares: " + pares);
        System.out.println("Quantidade de números múltiplos de cinco: " + multiplosDeCinco);

        sc.close();
        
    }
}