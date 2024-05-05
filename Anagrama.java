import java.util.Arrays;
import java.util.Scanner;

    public class Anagrama {
        //Verifica se o tamanho das palavras são iguais
        static boolean saoAnagramas (String palavra1, String palavra2) {
            if (palavra1.length() != palavra2.length()) {
                return false;
            }
        //converte as strings em caracters
        char[] p1 = palavra1.toCharArray();
        char[] p2 = palavra2.toCharArray();
        
        // Ordena os caracters dos arrays
        Arrays.sort(p1);
        Arrays.sort(p2);

        // Compara os arrays ordenados
        return Arrays.equals(p1, p2);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Informe a primeira palavra:");
        String palavra1 = sc.next();
        System.out.println("Informe a segunda palavra:");
        String palavra2 = sc.next();

        boolean resposta = saoAnagramas (palavra1, palavra2);
        if (resposta){
            System.out.println("São anagramas!");
        }
        else {
            System.out.println("Não são anagramas!");
        }
        sc.close();
        }
    }


