package estruturasderepeticaoearrays.teste;

public class Teste {
    public static void main(String[] args) {
        /*
         * int num = 5, count = 1;
         * while (count <= 3) {
         * ++count;
         * num += count;
         * }
         * System.out.println(num);
         */

        /*
         * int num = 5, count = 1;
         * do {
         * num += count;
         * System.out.println(num);
         * } while (count <= 3);
         */

        // LOOPING INFINITO
        /*
         * int num = 5, count = 1;
         * do {
         * num += count;
         * System.out.println(num);
         * } while (count <= 3);
         */

        // 012
        int i, num = 5;
        for (i = 0; i < 3; i++) {
            num += i;
            System.out.print(i);
        }

    }

}
