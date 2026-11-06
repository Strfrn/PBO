package mahlukhidup.hewan;

import mahlukhidup.MahlukHidup;
import mahlukhidup.enums.JenisMakanan;
import mahlukhidup.enums.JenisReproduksi;

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

    // Getters
    public JenisMakanan getJenisMakanan() {
        return jenisMakanan;
    }

    public JenisReproduksi getJenisReproduksi() {
        return jenisReproduksi;
    }

    // Setters
    public void setJenisMakanan(JenisMakanan jenisMakanan) {
        this.jenisMakanan = jenisMakanan;
    }

    public void setJenisReproduksi(JenisReproduksi jenisReproduksi) {
        this.jenisReproduksi = jenisReproduksi;
    }
}
