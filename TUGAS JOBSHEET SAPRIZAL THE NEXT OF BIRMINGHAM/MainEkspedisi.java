import java.util.Scanner;

public class MainEkspedisi {
    public static void main(String[] args) {

        
        Scanner scanner = new Scanner(System.in);
        // int jumlahbarang = scanner.nextInt();

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

        
        System.out.println("Masukkan jumlah BArang:");
        int jumlahbarang = scanner.nextInt();
        scanner.nextLine(); 

        barang[] barangs = new barang[jumlahbarang];
        // double resi = 0;


        for (int i = 0; i < jumlahbarang; i++) {
            // barang[] barangs = new barang[jumlahbarang];
        // double resi = 0;
            // Input barang data
            System.out.println("Data Barang untuk Ekspedisi KE =====" + (i + 1) + ":");

            System.out.println("Masukkan nama Barang:");
            String namaBarang = scanner.nextLine();

            System.out.println("Masukkan jumlah Barang:");
            String jumlahBarang = scanner.nextLine();

            System.out.println("Masukkan berat Barang:");
            String beratBarang = scanner.nextLine();

            System.out.println("Masukkan jarak Tempuh:");
            String jarakTempuh = scanner.nextLine();

            System.out.println("Masukkan resi:");
            double resi = scanner.nextDouble();
            scanner.nextLine(); 

            // Create and store barang object
            barangs[i] = new barang(namaBarang, jumlahBarang, beratBarang, jarakTempuh, resi);
        }

        // System.out.println("\nData Ekspedisi:");
        // for (Ekspedisi ekspedisi : ekspedisis) {
        //     ekspedisi.cetakInfo();
        //     System.out.println();
        // }

        System.out.println("\nData Barang:");
        for (barang barang : barangs) {
            barang.cetakInfo();
            System.out.println();
        }

        System.out.println("Rata-rata total Ekspedisi: " + (totalEekspedisi + jumlahbarang));
    // }
        System.out.println("JUMLAH BARANGS: " + (jumlahbarang));
    // }
        }
        
    

    }


    //     System.out.println("Rata-rata total Ekspedisi: " + (totalEekspedisi + jumlahEekspedisi));
    // }

    // }

