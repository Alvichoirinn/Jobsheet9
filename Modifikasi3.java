import java.util.Scanner;

public class Modifikasi3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa:");

        int jumlahMahasiswa = sc.nextInt();
        int[] nilaiMhs = new int[jumlahMahasiswa];
        double totalLulus = 0;
        double totalTidakLulus = 0;
        int jumlahLulus = 0;
        int jumlahTidakLulus = 0;
        
        for(int i = 0; i < jumlahMahasiswa; i++){
            System.out.print("Masukkan nilai mahasiswa ke-"+(i+1)+ " : ");
            nilaiMhs [i] = sc.nextInt();
            if (nilaiMhs [i] > 70){
                jumlahLulus++;
                totalLulus +=nilaiMhs[i];
            }else {
                jumlahTidakLulus++;
                totalTidakLulus+= nilaiMhs[i];
            }
        }

        double rataLulus = (jumlahLulus==0) ? 0 : totalLulus/jumlahLulus;
        double rataTidakLulus=(jumlahTidakLulus==0) ? 0 : totalTidakLulus/jumlahTidakLulus;
        
        System.out.println("Rata-rata nilai lulus= " + rataLulus);
        System.out.println("Rata-rata nilai tidak lulus= " + rataTidakLulus);
        
    sc.close();
    }
}
