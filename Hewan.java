// LEVEL 2 - IS-A MakhlukHidup
public abstract class Hewan extends MakhlukHidup {
    private String jenisMakanan;

    protected Hewan(String nama, int umur, String jenisMakanan) {
        super(nama, umur);      // SUPER constructor
        this.jenisMakanan = jenisMakanan;
    }

    public String getJenisMakanan() { return jenisMakanan; }

    // OVERRIDING
    @Override
    public void makan() {
        System.out.println(getNama() + " makan " + jenisMakanan);
    }

    // OVERLOADING: nama sama, parameter beda
    public void makan(String makanan) {
        System.out.println(getNama() + " makan " + makanan + " (bukan makanan biasa)");
    }

    public void makan(String makanan, int porsi) {
        System.out.println(getNama() + " makan " + porsi + " porsi " + makanan);
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();  // SUPER method
        System.out.println("Makanan : " + jenisMakanan);
    }
}
