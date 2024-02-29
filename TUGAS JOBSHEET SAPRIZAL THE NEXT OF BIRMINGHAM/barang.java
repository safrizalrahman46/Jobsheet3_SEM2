import java.util.Scanner;

public class barang {
    
    String namabarang;
    String jumlahbarang;
    String beratbarang;
    String jaraktempuh;
    double resi;

    barang(String namabarang, String beratbarang,String jumlahbarang, String jaraktempuh, double resi) {
        this.namabarang = namabarang;
        this.jumlahbarang = jumlahbarang;
        this.beratbarang = beratbarang;
        this.jaraktempuh = jaraktempuh;
        this.resi = resi;
    }

    void cetakInfo() {
        System.out.println("namabarang EKSPEDISI : " + namabarang);
        System.out.println("Alamat Kantor Eekpedisi : " + jumlahbarang);
        System.out.println("Nomor Ekspedisi : " + beratbarang);
        System.out.println("KOde Ekdpedisi: " + jaraktempuh);
        System.out.println("resi : " + resi);
    }
}
