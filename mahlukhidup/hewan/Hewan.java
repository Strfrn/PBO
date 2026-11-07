package mahlukhidup.hewan;
import mahlukhidup.MahlukHidup;
import mahlukhidup.enums.hewan.JenisMakanan;
import mahlukhidup.enums.hewan.JenisReproduksi;
import java.util.Set;

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

    public JenisMakanan getJenisMakanan() {
        return jenisMakanan;
    }

    public void setJenisMakanan(JenisMakanan jenisMakanan) {
        this.jenisMakanan = jenisMakanan;
    }

    public JenisReproduksi getJenisReproduksi() {
        return jenisReproduksi;
    }

    public void setJenisReproduksi(JenisReproduksi jenisReproduksi) {
        this.jenisReproduksi = jenisReproduksi;
    }
}