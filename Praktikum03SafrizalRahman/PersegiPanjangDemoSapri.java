public class PersegiPanjangDemoSapri {
    
    // 1. Deklarasi Class danm
    public static void main(String[] args) {
        PersegiPanjang[] arrayOfPersegiPanjang = new PersegiPanjang[3];

        arrayOfPersegiPanjang[0] = new PersegiPanjang();
        arrayOfPersegiPanjang[0].panjang = 110;
        arrayOfPersegiPanjang[0].lebar =30 ;
        
        arrayOfPersegiPanjang[1] = new PersegiPanjang();
        arrayOfPersegiPanjang[1].panjang = 80;
        arrayOfPersegiPanjang[1].lebar =50 ;
        
        arrayOfPersegiPanjang[2] = new PersegiPanjang();
        arrayOfPersegiPanjang[2].panjang = 100;
        arrayOfPersegiPanjang[2].lebar =20 ;

        System.out.println("Persegi Panjang ke 1 , PANJANGNYAA : " + arrayOfPersegiPanjang[0].panjang + ", LEBARNYAA : " + arrayOfPersegiPanjang[0].lebar) ;
        
        System.out.println("Persegi Panjang ke 2 , PANJANGNYAA : " + arrayOfPersegiPanjang[1].panjang + ", LEBARNYAA : " + arrayOfPersegiPanjang[1].lebar) ;
        
        System.out.println("Persegi Panjang ke 3 , PANJANGNYAA : " + arrayOfPersegiPanjang[2].panjang + ", LEBARNYAA : " + arrayOfPersegiPanjang[2].lebar) ;
        
        
    }
}
