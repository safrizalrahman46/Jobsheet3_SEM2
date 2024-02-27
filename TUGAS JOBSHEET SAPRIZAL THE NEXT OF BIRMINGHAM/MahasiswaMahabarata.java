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
        System.out.println("NamaNYA MIAW: " + nama);
        System.out.println("NIM NYA: " + nim);
        System.out.println("Jenis Kelamin Tidak BOLEH GENERAL: " + jenisKelamin);
        System.out.println("IPK HARUS BAGUS: " + ipk);
    }
}


