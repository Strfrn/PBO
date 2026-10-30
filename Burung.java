// LEVEL 3 - Burung IS-A Hewan, dan IMPLEMENTS interface Terbang
public class Burung extends Hewan implements Terbang {
    private double panjangSayap; // cm

    public Burung(String nama, int umur, double panjangSayap) {
        super(nama, umur, "biji-bijian");
        this.panjangSayap = panjangSayap;
    }

    @Override
    public void makan() {
        System.out.println(getNama() + " mematuk " + getJenisMakanan());
    }

    @Override
    public void suaraKhas() {
        System.out.println(getNama() + ": Cuit cuit!");
    }

    @Override
    public void terbang() {
        System.out.println(getNama() + " terbang dengan sayap " + panjangSayap + " cm");
    }
}
