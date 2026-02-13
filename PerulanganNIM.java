import java.util.Scanner;

public class PerulanganNIM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input NIM: ");
        String nim = sc.nextLine();

        int n = Integer.parseInt(nim.substring(nim.length() - 2));
        if (n < 10) {
            n += 10;
        }

        System.out.println("maka n=" + n);
        System.out.print("Output: ");

        for (int i = 1; i <= n; i++) {
            // 10 dan 15 tidak dicetak
            if (i == 10 || i == 15) {
                continue;
            }

            if (i % 3 == 0) {
                System.out.print("# ");
            } else if (i % 2 == 0) {
                System.out.print(i + " ");
            } else {
                System.out.print("* ");
            }
        }
    }
}
