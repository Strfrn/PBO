package mahlukhidup.hewan;

public abstract class Hewan extends MahlukHidup {

    private JenisMakanan jenisMakanan;
    private JenisReproduksi jenisReproduksi;

    public Hewan(
            String nama,
            String namaIlmiah,
            double usia,
            double berat,
            Set<String> habitat,
            JenisMakanan jenisMakanan,
            JenisReproduksi jenisReproduksi
    ) {
        super(nama, namaIlmiah, usia, berat, habitat);

        this.jenisMakanan = jenisMakanan;
        this.jenisReproduksi = jenisReproduksi;
    }

    public abstract void makan();
    public abstract void bergerak();

    // Getters dan setters
}