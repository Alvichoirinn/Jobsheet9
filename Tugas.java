import java.util.Scanner;

public class Tugas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input banyaknya elemen
        System.out.print("Masukkan banyaknya elemen: ");
        int n = sc.nextInt();

        // Input nilai tiap elemen
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan elemen ke-" + (i + 1) + ": ");
            array [i] = sc.nextInt();
        }

        // Hitung statistik
        int tertinggi = array[0];
        int terendah = array[0];
        double rataRata = 0;

        for (int nilai : array) {
            if (nilai > tertinggi) {
                tertinggi = nilai;
            }

            if (nilai < terendah) {
                terendah = nilai;
            }

            rataRata += nilai;
        }

        rataRata /= n;

        // Output nilai tertinggi, terendah, dan rata-rata
        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah: " + terendah);
        System.out.println("Nilai rata-rata: " + rataRata);
    }
}
