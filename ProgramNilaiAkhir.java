import java.util.Scanner;

public class ProgramNilaiAkhir {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("==============================");

        System.out.print("Masukkan Nilai Tugas: ");
        double tugas = sc.nextDouble();
        System.out.print("Masukkan Nilai Kuis: ");
        double kuis = sc.nextDouble();
        System.out.print("Masukkan Nilai UTS: ");
        double uts = sc.nextDouble();
        System.out.print("Masukkan Nilai UAS: ");
        double uas = sc.nextDouble();

        System.out.println("==============================");
        System.out.println("==============================");

        // Validasi nilai
        if (tugas < 0 || tugas > 100 || kuis < 0 || kuis > 100 || uts < 0 || uts > 100 || uas < 0 || uas > 100) {
            System.out.println("nilai tidak valid");
            System.out.println("==============================");
            System.out.println("==============================");
            return;
        }

        // Hitung nilai akhir
        double nilaiAkhir = (0.2 * tugas) + (0.2 * kuis) + (0.3 * uts) + (0.3 * uas);

        // Tentukan nilai huruf
        String nilaiHuruf;
        if (nilaiAkhir >= 85) {
            nilaiHuruf = "A";
        } else if (nilaiAkhir >= 80) {
            nilaiHuruf = "B+";
        } else if (nilaiAkhir >= 70) {
            nilaiHuruf = "B";
        } else if (nilaiAkhir >= 65) {
            nilaiHuruf = "C+";
        } else if (nilaiAkhir >= 60) {
            nilaiHuruf = "C";
        } else if (nilaiAkhir >= 50) {
            nilaiHuruf = "D";
        } else {
            nilaiHuruf = "E";
        }

        System.out.println("nilai akhir : " + nilaiAkhir);
        System.out.println("Nilai Huruf : " + nilaiHuruf);
        System.out.println("==============================");

        // Status kelulusan
        if (nilaiHuruf.equals("A") || nilaiHuruf.equals("B+") || nilaiHuruf.equals("B")
                || nilaiHuruf.equals("C+") || nilaiHuruf.equals("C")) {
            System.out.println("SELAMAT ANDA LULUS");
        } else {
            System.out.println("MAAF ANDA TIDAK LULUS");
        }
    }
}
