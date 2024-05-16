import java.util.Scanner;

public class valorDeX {

    static int[][] matM = new int [2] [2];

    //Método auxiliar, verifica se o numero é dirente de 0
    public static boolean ehDiferenteDeZero (int num) {
    return num != 0;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Primeira entrada do sistema, preenche a matriz
        for (int i = 0; i < matM.length; i++) {
            for (int j = 0; j < matM[0].length; j++) {
                System.out.println("Informe um número:");
                matM[i][j] = sc.nextInt();
            }
        } 

        //Segunda entrada, pede um outro numero 
        System.out.println("Informe o numero surpresa:");
        int numeroSurprise = sc.nextInt();
        
        //Verifica se o numero surpresa(segunda entrada) está na matriz
        if (ehDiferenteDeZero(numeroSurprise) ){

            boolean encontrado = false;

            for (int i = 0; i < matM.length; i++) {
                for (int j = 0; j < matM[0].length; j++) {
                    System.out.println(matM[i][j]);
                    if (numeroSurprise == matM[i][j]) {
                        encontrado = true;
                        break;
                    }
                }
            }
            // Imprimindo a matriz
            if (encontrado) {
                System.out.println("O número surpresa está na matriz:");

            } else {
                System.out.println("O número surpresa não está na matriz:");
            }
        } else {
            System.out.println("O número surpresa é zero.");
        }
        sc.close();

    }

}
