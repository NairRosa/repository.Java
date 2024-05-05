import java.util.Scanner;

public class primos {



public static void main (String[] args) {
    int[] number = new int[4];
    

    Scanner novoNumber = new Scanner(System.in);
    System.out.println("Informe o primeiro número:");
    

    for (int i = 0; i < number.length; i++) {
        number[i] = novoNumber.nextInt();
    }  

    for (int i = 0; i < number.length; i++) {
        if (primo(number[i])) {
            System.out.println("O número " + number[i] + " é primo.");
        }

        else {
            System.out.println("O número " + number[i] + " não é primo.");
        }
    } 
    novoNumber.close();
}

public static boolean primo (int n) {
    if (n <= 1) {
        return false;
    }
    for (int i = 2; i <= Math.sqrt(n); i++){
        if (n % i == 0) {
            return false;
        }
    }
    return true;
}

}