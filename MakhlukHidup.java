// LEVEL 1 - ABSTRACT CLASS (abstraction)
public abstract class MakhlukHidup {
    // ENCAPSULATION: atribut private
    private String nama;
    private int umur;

    // STATIC: dimiliki kelas, bukan objek
    private static int jumlahMakhluk = 0;
    // FINAL: konstanta
    public static final String KERAJAAN = "Biologi";

    // CONSTRUCTOR
    public MakhlukHidup(String nama, int umur) {
        this.nama = nama;       // THIS
        setUmur(umur);          // validasi lewat setter
        jumlahMakhluk++;
    }

    public String getNama() { return nama; }
    public int getUmur() { return umur; }

    public void setUmur(int umur) {
        if (umur < 0) {
            throw new IllegalArgumentException("Umur tidak boleh negatif: " + umur);
        }
        this.umur = umur;
    }

    public static int getJumlahMakhluk() { return jumlahMakhluk; }

    // FINAL METHOD: tidak boleh di-override
    public final void bernapas() {
        System.out.println(nama + " sedang bernapas");
    }

    // ABSTRACT METHOD: wajib di-override subclass
    public abstract void makan();
    public abstract void suaraKhas();

    public void tampilkanInfo() {
        System.out.println("Nama : " + nama);
        System.out.println("Umur : " + umur + " tahun");
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "[" + nama + ", " + umur + " th]";
    }
}
