import java.util.Scanner;

public class matrizTransposta {
    static int[][] matA = new int [4][3];
    static int[][] matAt = new int [3][4];

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < matA.length; i++) {
            for (int j = 0; j < matA[0].length; j++) {
                System.out.println("Informe um número para a posição " + i + "," + j + " da matriz A.");
                matA[i][j] = sc.nextInt();
                
            }
        }

        for(int j = 0; j < matAt.length; j++) {
            System.out.println();
            for(int i = 0; i < matAt[0].length; i++) {
                matAt [j][i]= matA [i][j];
                System.out.print(matAt[j][i] + "  ");
            }
        }

        sc.close();
    }
}
