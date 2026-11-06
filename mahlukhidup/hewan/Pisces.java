package mahlukhidup.hewan;

import mahlukhidup.enums.JenisMakanan;
import mahlukhidup.enums.JenisReproduksi;
import mahlukhidup.enums.JenisHabitatAir;

import java.util.Set;

public abstract class Pisces extends Hewan {

    private JenisHabitatAir jenisHabitatAir;

    public Pisces(
            String nama,
            String namaIlmiah,
            double usia,
            double berat,
            Set<String> habitat,
            JenisMakanan jenisMakanan,
            JenisReproduksi jenisReproduksi,
            JenisHabitatAir jenisHabitatAir
    ) {
        super(nama, namaIlmiah, usia, berat, habitat, jenisMakanan, jenisReproduksi);
        this.jenisHabitatAir = jenisHabitatAir;
    }

    // Getter
    public JenisHabitatAir getJenisHabitatAir() {
        return jenisHabitatAir;
    }

    // Setter
    public void setJenisHabitatAir(JenisHabitatAir jenisHabitatAir) {
        this.jenisHabitatAir = jenisHabitatAir;
    }
}
