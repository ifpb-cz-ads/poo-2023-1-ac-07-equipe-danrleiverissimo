public class Array5CBB_dowhile {
    public static void main(String[] args) {
        String[] dias = {"Segunda", "Terça", "Quarta", "Quinta", "Sexta", "Sábado", "Domingo"};
        int i = 0;

        do {
            System.out.println(dias[i]);
            i++;
        } while (i < dias.length);
    }
}
