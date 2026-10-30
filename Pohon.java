// LEVEL 3 - Pohon IS-A Tumbuhan IS-A MakhlukHidup
public class Pohon extends Tumbuhan {
    private double tinggi; // meter

    public Pohon(String nama, int umur, String warnaDaun, double tinggi) {
        super(nama, umur, warnaDaun);
        this.tinggi = tinggi;
    }

    public void tumbuh(double tambahan) {
        tinggi += tambahan;
        System.out.println(getNama() + " tumbuh, tinggi sekarang " + tinggi + " m");
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Tinggi : " + tinggi + " m");
    }
}
