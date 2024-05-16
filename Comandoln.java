public class Comandoln {
    public static void main(String args[]) {
        Comandoln mc = new Comandoln();

        if (args.length == 0) mc.parabens();
        else if (args.length == 1) mc.parabens(args[0]);
        else if (args.length == 2) mc.parabens(args[0], args[1]);
        else mc.parabens(args);
    }

    void parabens() {
        System.out.println("Parabéns pra você!");
    }

    void parabens(String nome) {
        System.out.println("Parabéns pra você!, " + nome + "!");

    }

    void parabens(String nome, String idade) {
        System.out.println("Parabéns pra você!, " + nome + "! Você completou " + idade + " anos");
    }

    void parabens (String[] nomes) {
        System.out.println("Parabéns pra você: ");
        for(int i = 0; i < nomes.length ; i++) {
            System.out.println(nomes[i]);
        }

    }
}
