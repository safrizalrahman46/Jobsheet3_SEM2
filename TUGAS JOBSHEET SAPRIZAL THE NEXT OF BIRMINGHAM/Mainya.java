import java.util.Scanner;


    
public class Mainya {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan jumlah mahasiswa:");
        int jumlahMahasiswa = scanner.nextInt();
        scanner.nextLine(); // Mengonsumsi newline

        MahasiswaMahabarata[] mahasiswas = new MahasiswaMahabarata[jumlahMahasiswa];
        double totalIpk = 0;

        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.println("Masukkan data mahasiswa ke-" + (i + 1) + ":");

            System.out.println("Masukkan nama:");
            String nama = scanner.nextLine();

            System.out.println("Masukkan NIM:");
            String nim = scanner.nextLine();

            System.out.println("Masukkan jenis kelamin:");
            String jenisKelamin = scanner.nextLine();

            System.out.println("Masukkan IPK:");
            double ipk = scanner.nextDouble();
            scanner.nextLine(); // Mengonsumsi newline

            mahasiswas[i] = new MahasiswaMahabarata(nama, nim, jenisKelamin, ipk);
            totalIpk += ipk;
        }

        System.out.println("\nData Mahasiswa:");
        for (MahasiswaMahabarata mahasiswa : mahasiswas) {
            mahasiswa.cetakInfo();
            System.out.println();
        }

        System.out.println("Rata-rata IPK: " + (totalIpk / jumlahMahasiswa));
    }
}
