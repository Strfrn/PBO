package mahlukhidup.hewan;

import mahlukhidup.enums.JenisMakanan;
import mahlukhidup.enums.JenisReproduksi;
import mahlukhidup.enums.JenisGigi;

import java.util.Set;

public abstract class Mamalia extends Hewan {

    private JenisGigi jenisGigi;

    public Mamalia(
            String nama,
            String namaIlmiah,
            double usia,
            double berat,
            Set<String> habitat,
            JenisMakanan jenisMakanan,
            JenisReproduksi jenisReproduksi,
            JenisGigi jenisGigi
    ) {
        super(nama, namaIlmiah, usia, berat, habitat, jenisMakanan, jenisReproduksi);
        this.jenisGigi = jenisGigi;
    }

    public abstract void menyusuiAnak();

    // Getter
    public JenisGigi getJenisGigi() {
        return jenisGigi;
    }

    // Setter
    public void setJenisGigi(JenisGigi jenisGigi) {
        this.jenisGigi = jenisGigi;
    }
}
