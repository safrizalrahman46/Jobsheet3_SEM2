/**
 * EkspedisiApalah
 */
import java.util.Scanner;

public class EkspedisiApalah {

    // String namaEkspedisi;
    String nama;
    String kantorEekspedisi;
    String nomorEekspedisi;
    String kodeEekspedisi;
    double total;

    EkspedisiApalah(String nama, String nomorEekspedisi,String kantorEekspedisi, String kodeEekspedisi, double total) {
        this.nama = nama;
        this.kantorEekspedisi = kantorEekspedisi;
        this.nomorEekspedisi = nomorEekspedisi;
        this.kodeEekspedisi = kodeEekspedisi;
        this.total = total;
    }

    void cetakInfo() {
        System.out.println("Nama EKSPEDISI : " + nama);
        System.out.println("Nomor Ekspedisi : " + nomorEekspedisi);
        System.out.println("Alamat Kantor Eekpedisi : " + kantorEekspedisi);
        System.out.println("KOde Ekdpedisi: " + kodeEekspedisi);
        System.out.println("total : " + total);
    }
}