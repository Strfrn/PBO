// LEVEL 3 - IS-A Hewan (dan tidak langsung IS-A MakhlukHidup)
public abstract class Mamalia extends Hewan {
    private int jumlahAnak;

    protected Mamalia(String nama, int umur, String jenisMakanan, int jumlahAnak) {
        super(nama, umur, jenisMakanan);
        this.jumlahAnak = jumlahAnak;
    }

    public int getJumlahAnak() { return jumlahAnak; }

    public void menyusui() {
        System.out.println(getNama() + " menyusui " + jumlahAnak + " anaknya");
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Golongan : Mamalia (berdarah panas, melahirkan)");
    }
}
