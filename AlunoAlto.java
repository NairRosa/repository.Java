
import java.util.Scanner;

public class AlunoAlto {
        static String[] nome = new String[50];
        static int[] ra = new int[50];
        static float[] altura = new float[50];
    
        static float maisAlto = 0;
        static int iAtual = 0;

    public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Informe o primeiro número:");
    for (int i= 0; i < 50; i++){
        nome[i] = sc.next();
        ra[i] = sc.nextInt();
        altura[i] = sc.nextFloat();
    }
    sc.close();
    System.out.println(iAtual);

    for (int j = 0; j < 50; j++){
        if (altura[j] > maisAlto) {
            maisAlto = altura[j];
            iAtual = j;
        }
        
    }

    System.out.println(iAtual);
    }


}