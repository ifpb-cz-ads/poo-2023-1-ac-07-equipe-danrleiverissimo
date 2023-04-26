import java.util.Scanner;

public class CTquestao3 {
    static int NUM_ALUNOS = 10;
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        double[] notas = new double[NUM_ALUNOS];
        double media = 0;

        System.out.println("Digite as notas dos " + NUM_ALUNOS + " alunos:");
        for (int i = 0; i < notas.length; i++) {
            notas[i] = scanner.nextDouble();
            media += notas[i];
        }

        media = media/notas.length;
        System.out.println("A média das notas é: " + media);

        int acimaDaMedia = 0;
        int abaixoDaMedia = 0;
        int exatamenteNaMedia = 0;
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] > media) {
                acimaDaMedia++;
            } else if (notas[i] < media) {
                abaixoDaMedia++;
            } else 
                exatamenteNaMedia++;
        }

        System.out.println("Quantidade de notas");
        System.out.println("\t\t acima da média: " + acimaDaMedia);
        System.out.println("\t\t abaixo da média: " + abaixoDaMedia);
        System.out.println("\t\t exatamente na média: " + exatamenteNaMedia);

        scanner.close();
    }
    
}
