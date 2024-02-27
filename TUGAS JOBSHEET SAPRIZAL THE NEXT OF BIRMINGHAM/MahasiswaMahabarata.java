import java.util.Scanner;

class MahasiswaMahabarata {
    String nama;
    String nim;
    String jenisKelamin;
    double ipk;

    MahasiswaMahabarata(String nama, String nim, String jenisKelamin, double ipk) {
        this.nama = nama;
        this.nim = nim;
        this.jenisKelamin = jenisKelamin;
        this.ipk = ipk;
    }

    void cetakInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Jenis Kelamin: " + jenisKelamin);
        System.out.println("IPK: " + ipk);
    }
}


