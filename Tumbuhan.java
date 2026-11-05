import java.util.Set;

public abstract class Tumbuhan extends MahlukHidup {

    private JenisReproduksiTumbuhan jenisReproduksi;
    private TingkatKebutuhan kebutuhanAir;
    private TingkatKebutuhan kebutuhanCahaya;
    private JenisPertumbuhan jenisPertumbuhan;

    public Tumbuhan(
            String nama,
            String namaIlmiah,
            double usia,
            double berat,
            Set<String> habitat,
            JenisReproduksiTumbuhan jenisReproduksi,
            TingkatKebutuhan kebutuhanAir,
            TingkatKebutuhan kebutuhanCahaya,
            JenisPertumbuhan jenisPertumbuhan
    ) {
        super(nama, namaIlmiah, usia, berat, habitat);

        this.jenisReproduksi = jenisReproduksi;
        this.kebutuhanAir = kebutuhanAir;
        this.kebutuhanCahaya = kebutuhanCahaya;
        this.jenisPertumbuhan = jenisPertumbuhan;
    }

    public abstract void fotosintesis();
    public abstract void menyerapAir();
    public abstract void menyerapNutrisi();

    // Getters dan setters
}