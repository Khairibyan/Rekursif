import java.util.Scanner;

public class Tugas{

    static int totalRekursif(int n, Scanner sc) {
        if (n == 0) {
            return 0;
        } else {
            System.out.print("Masukkan angka ke-" + n + ": ");
            int nilai = sc.nextInt();
            return nilai + totalRekursif(n - 1, sc);
        }
    }

    static int totalIteratif(int n, Scanner sc) {
        int total = 0;
        for (int i = n; i >= 1; i--) {
            System.out.print("Masukkan angka ke-" + i + ": ");
            int nilai = sc.nextInt();
            total += nilai;
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Masukkan jumlah angka yang ingin dihitung (N): ");
        n = sc.nextInt();
        int total = totalRekursif(n, sc);
        System.out.println("Total dari " + n + " angka yang dimasukkan adalah: " + total);
    }
}
