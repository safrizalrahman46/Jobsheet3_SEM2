import java.util.Scanner;

public class PersegiPanjangDemoSapri {
    public static void main(String[] args) {
        Scanner SAPRIZALSAMPITAK = new Scanner(System.in);

        System.out.println("Masukkan jumlah persegi panjang yang ingin Diinputkan yA MIAW:");
        int jumlahPersegiPanjang = SAPRIZALSAMPITAK.nextInt();
        PersegiPanjang[] ArrayOfPersegiPanjang = new PersegiPanjang[jumlahPersegiPanjang];
        int panjang, lebar;

        for (int i = 0; i < jumlahPersegiPanjang; i++) {
            System.out.println("Persegi PANJANG YANG KEEE -- " + (i + 1));
            
            System.out.println("MASUKKAN PANJANGNYAAA yaw Miaw:");
            panjang = SAPRIZALSAMPITAK.nextInt();
            System.out.println("MASUKKAN LEBAR YA MIAWW:");
            lebar = SAPRIZALSAMPITAK.nextInt();
            ArrayOfPersegiPanjang[i] = new PersegiPanjang(panjang , lebar);
            System.out.println("LuasNya: " + ArrayOfPersegiPanjang[i].hitungLuasnya() + ", KelilingNYAW: " + ArrayOfPersegiPanjang[i].hitungKelilingnya());
        }

        System.out.println("                                            ");
        for (int i = 0; i < jumlahPersegiPanjang; i++) {
            System.out.println("Persegi Panjang ke "+ (i + 1)  +", PANJANGNYAA : " + ArrayOfPersegiPanjang[i].panjang + ", LEBARNYAA : " + ArrayOfPersegiPanjang[i].lebar + " LuasNya: " + ArrayOfPersegiPanjang[i].hitungLuasnya() + ", KelilingNYAW: " + ArrayOfPersegiPanjang[i].hitungKelilingnya());
        }
    }
}
