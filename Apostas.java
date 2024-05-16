import java.util.Scanner;

public class Apostas {
    static int [][] apostas = new int [2][2];
    static int [][] resultado = new int [2][2];

    static int vencedor (int[][] apostas, int [][] resultado) {
        int vencedor = 0;
        for (int i = 0; i < apostas.length; i++) {
            for (int j = 0; j < apostas[0].length; j++) { 
                if (apostas[i][j] == 1 && resultado[i][j] == 1) {
                    System.out.println("Vencedores:  " + apostas[i][j]);
                    vencedor++;
                } else {
                    System.out.println("Perdedores:  " + apostas[i][j]);

               }
            }
        }

        return vencedor;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < apostas.length; i++) {
            for (int j = 0; j < apostas[0].length; j++) {
                System.out.println("Digite 1 para apostar, e 0 para não apostar: " + i + ", " + j + ".");
                apostas[i][j] = sc.nextInt();
                if (apostas[i][j] != 0 && apostas[i][j] != 1) {
                    System.out.println("Digite um número válido.");
                    break;
                }
            }
        }

        for (int i = 0; i < resultado.length; i++) {
            for (int j = 0; j < resultado[0].length; j++) {
                System.out.println("Informe 1 para as posições ganharadoras, e 0 para as posições perdedoras: ");
                resultado[i][j] = sc.nextInt();
                if (resultado[i][j] != 0 && resultado[i][j] != 1) {
                    System.out.println("Digite um número válido.");
                    break;
                }
            }
        }

        vencedor(apostas, resultado);

        int totalDeVencedores = vencedor(apostas, resultado);
        System.out.println( "O total de vencedore é: " + totalDeVencedores);

        sc.close();
    }
}
