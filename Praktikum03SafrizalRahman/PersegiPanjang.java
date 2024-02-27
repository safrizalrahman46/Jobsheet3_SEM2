public class PersegiPanjang {
    public int panjang;
    public int lebar;
    // public String jumlahpersegipanjang;
    
    ///MODIFFIKASION
    public void cetakInfo() {
        System.out.println("Panjang: " + panjang + ", Lebar: " + lebar);
    }

    public PersegiPanjang (int pp, int ll) {
        panjang = pp;
        lebar   = ll;
    }

    public int hitungLuasnya(){ 
        return panjang * lebar;
    }

    
    public int hitungKelilingnya(){ 
        return 2 * (panjang + lebar) ;
    }
}
