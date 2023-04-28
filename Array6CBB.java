import java.util.Scanner;
public class Array6CBB {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        int[] numeros = new int[10];
        int maior = Integer.MIN_VALUE; 
        //inicializando 'maior' com o menor valor inteiro possível, para que o primeiro valor do usuário seja armazenado como maior

        System.out.println("Digite 10 números inteiros:");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = scanner.nextInt();
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
        }
        System.out.println();

        System.out.println("imprimindo todos os valores digitados: ");
        for (int i = 0; i < numeros.length; i++){
            if(i != numeros.length - 1) 
                System.out.print(numeros[i] + ", ");
            else 
                System.out.println(numeros [i] + ".");
        }
        System.out.println();
        
        System.out.println("o maior numero digitado foi " + maior);
        scanner.close();
    }
}
