public class Array2 {
    public static void main(String[] args) {
        int[] sequenciaDeNumeros = new int[100];        
        // inicializa cada elemento do array com os números de 1 até 100
        for (int i = 1; i <= 100; i++) {
            sequenciaDeNumeros[i-1] = i;
        }        
        // imprime os elementos do array
        for (int i = 1; i <= 100; i++) {
            System.out.println(sequenciaDeNumeros[i-1]);
        }
    }
}
