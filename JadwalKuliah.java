import java.util.Scanner;

public class JadwalKuliah {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Masukkan jumlah jadwal kuliah: ");
        int n = input.nextInt();
        input.nextLine(); // buang newline

        String[][] jadwal = new String[n][4];

        inputJadwal(jadwal, n);
        tampilkanSemua(jadwal, n);
        tampilkanBerdasarkanHari(jadwal, n);
        tampilkanBerdasarkanMatkul(jadwal, n);
    }

    // a. Menginput data jadwal kuliah
    static void inputJadwal(String[][] jadwal, int n) {
        System.out.println("\n=== INPUT DATA JADWAL ===");

        for (int i = 0; i < n; i++) {
            System.out.println("\nJadwal ke-" + (i + 1));
            System.out.print("Nama Mata Kuliah : ");
            jadwal[i][0] = input.nextLine();

            System.out.print("Ruang            : ");
            jadwal[i][1] = input.nextLine();

            System.out.print("Hari             : ");
            jadwal[i][2] = input.nextLine();

            System.out.print("Jam              : ");
            jadwal[i][3] = input.nextLine();
        }
    }

    // b. Menampilkan seluruh jadwal dalam bentuk tabel
    static void tampilkanSemua(String[][] jadwal, int n) {

        System.out.println("\n=== SELURUH JADWAL KULIAH ===");
        System.out.println("--------------------------------------------------------------------------");
        System.out.printf("%-25s %-20s %-10s %-15s\n",
                "Nama Mata Kuliah", "Ruang", "Hari", "Jam");
        System.out.println("--------------------------------------------------------------------------");

        for (int i = 0; i < n; i++) {
            System.out.printf("%-25s %-20s %-10s %-15s\n",
                    jadwal[i][0],
                    jadwal[i][1],
                    jadwal[i][2],
                    jadwal[i][3]);
        }
    }

    // c. Menampilkan jadwal berdasarkan hari tertentu
    static void tampilkanBerdasarkanHari(String[][] jadwal, int n) {

        System.out.print("\nMasukkan hari yang ingin dicari: ");
        String hari = input.nextLine();

        boolean ditemukan = false;

        System.out.println("\nJadwal pada hari " + hari + ":");
        for (int i = 0; i < n; i++) {
            if (jadwal[i][2].equalsIgnoreCase(hari)) {
                System.out.println(jadwal[i][0] + " | "
                        + jadwal[i][1] + " | "
                        + jadwal[i][3]);
                ditemukan = true;
            }
        }

        if (!ditemukan) {
            System.out.println("Tidak ada jadwal pada hari tersebut.");
        }
    }

    // d. Menampilkan jadwal berdasarkan nama mata kuliah tertentu
    static void tampilkanBerdasarkanMatkul(String[][] jadwal, int n) {

        System.out.print("\nMasukkan nama mata kuliah yang ingin dicari: ");
        String matkul = input.nextLine();

        boolean ditemukan = false;

        for (int i = 0; i < n; i++) {
            if (jadwal[i][0].equalsIgnoreCase(matkul)) {
                System.out.println("\nDetail Jadwal:");
                System.out.println("Nama Mata Kuliah : " + jadwal[i][0]);
                System.out.println("Ruang            : " + jadwal[i][1]);
                System.out.println("Hari             : " + jadwal[i][2]);
                System.out.println("Jam              : " + jadwal[i][3]);
                ditemukan = true;
            }
        }

        if (!ditemukan) {
            System.out.println("Mata kuliah tidak ditemukan.");
        }
    }
}
