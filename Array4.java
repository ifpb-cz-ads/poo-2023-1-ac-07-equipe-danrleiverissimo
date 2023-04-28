public class Array4 {
    public static void main(String[] args) {
        int[] sequenciaDeNumeros = new int[100];
        // inicializa cada elemento do array com os números de 0 até 99
        for (int i = 0; i < 100; i++) {
            sequenciaDeNumeros[i] = i;
        }        
        // tentativa de acesso a um elemento fora do intervalo válido do array, forçando o lançamento de uma exceção
        for (int i = 0; i < 101; i++) {
            System.out.println(sequenciaDeNumeros[i]);
        }
    }
}
