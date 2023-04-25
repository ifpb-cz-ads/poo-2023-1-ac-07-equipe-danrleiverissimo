public class Array1 {
    public static void main(String[] args) {
        int[] sequenciaDeNumeros = new int[100];
        // inicializa cada elemento do array com os números de 0 até 99
        for (int i = 0; i < 100; i++) {
            sequenciaDeNumeros[i] = i;
        }        
        // imprime os elementos do array
        for (int i = 0; i < 100; i++) {
            System.out.println(sequenciaDeNumeros[i]);
        }
    }
}
