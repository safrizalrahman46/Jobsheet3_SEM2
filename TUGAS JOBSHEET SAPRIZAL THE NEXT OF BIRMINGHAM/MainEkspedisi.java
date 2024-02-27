import java.util.Scanner;

public class MainEkspedisi {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan jumlah Eekspedisi:");
        int jumlahEekspedisi = scanner.nextInt();
        scanner.nextLine(); 

        EkspedisiApalah[] expedisis = new EkspedisiApalah[jumlahEekspedisi];
        double totalEekspedisi = 0;

        for (int i = 0; i < jumlahEekspedisi; i++) {
            System.out.println("Data Ekspedisi KE =====" + (i + 1) + ":");

            System.out.println("Masukkan namaNYA:");
            String nama = scanner.nextLine();

            System.out.println("KANtor EkspedisnYA miaw:");
            String kantorEekspedisi = scanner.nextLine();

            System.out.println("Masukkan Nomor Ekspedisi:");
            String nomorEekspedisi = scanner.nextLine();

            System.out.println("Masukan kodeEKSPEDISINYAW");
            String kodeEekspedisi = scanner.nextLine();

            System.out.println("Masukkan total:");
            double total = scanner.nextDouble();
            scanner.nextLine(); 

            expedisis[i] = new EkspedisiApalah(nama, nomorEekspedisi, kantorEekspedisi, kodeEekspedisi, total);
            totalEekspedisi += total;
        }

        System.out.println("\nData ekspedisiApalah:");
        for (EkspedisiApalah ekspedisiApalah : expedisis) {
            ekspedisiApalah.cetakInfo();
            System.out.println();
        }

        System.out.println("Rata-rata total Ekspedisi: " + (totalEekspedisi + jumlahEekspedisi));
    }

    }

