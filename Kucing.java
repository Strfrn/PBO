// LEVEL 4 - Kucing IS-A Mamalia IS-A Hewan IS-A MakhlukHidup
public class Kucing extends Mamalia {
    private String warnaBulu;

    public Kucing(String nama, int umur, String warnaBulu, int jumlahAnak) {
        super(nama, umur, "ikan", jumlahAnak);
        this.warnaBulu = warnaBulu;
    }

    public String getWarnaBulu() { return warnaBulu; }

    @Override
    public void makan() {
        super.makan();
        System.out.println("  -> sambil mengeong minta tambah");
    }

    @Override
    public void suaraKhas() {
        System.out.println(getNama() + ": Meong~");
    }

    public void mencakar() {
        System.out.println(getNama() + " mencakar sofa");
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Warna bulu : " + warnaBulu);
    }
}
