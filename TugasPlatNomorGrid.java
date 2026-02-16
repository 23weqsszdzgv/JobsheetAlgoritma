public class TugasPlatNomorGrid {

    public static void main(String[] args) {

        // Array kode (1 dimensi)
        char[] KODE = {'A','B','D','E','F','G','H','L','N','T'};

        // Array kota (2 dimensi, per huruf)
        char[][] KOTA = {
                {'B','A','N','T','E','N'},
                {'J','A','K','A','R','T','A'},
                {'B','A','N','D','U','N','G'},
                {'C','I','R','E','B','O','N'},
                {'B','O','G','O','R'},
                {'P','E','K','A','L','O','N','G','A','N'},
                {'S','E','M','A','R','A','N','G'},
                {'S','U','R','A','B','A','Y','A'},
                {'M','A','L','A','N','G'},
                {'T','E','G','A','L'}
        };

        System.out.println("==============================================");
        System.out.println("        ARRAY KODE DAN KOTA");
        System.out.println("==============================================");

        for (int i = 0; i < KODE.length; i++) {

            // Cetak kode kiri
            System.out.print("|  " + KODE[i] + "  | ");

            // Cetak huruf kota per kotak
            for (int j = 0; j < KOTA[i].length; j++) {
                System.out.print(" " + KOTA[i][j] + " ");
            }

            System.out.println();
        }

        System.out.println("==============================================");
    }
}
