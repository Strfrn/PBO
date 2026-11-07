package mahlukhidup.hewan;

import mahlukhidup.enums.hewan.JenisHabitat;
import mahlukhidup.enums.hewan.JenisMakanan;
import mahlukhidup.enums.hewan.JenisReproduksi;
import java.util.Set;

public abstract class Pisces extends Hewan {

    // Atribut
    private JenisHabitat jenisHabitatAir;

    // Constructor
    public Pisces(
            String nama,
            String namaIlmiah,
            double usia,
            double berat,
            Set<String> habitat,
            JenisMakanan jenisMakanan,
            JenisReproduksi jenisReproduksi,
            JenisHabitat jenisHabitatAir
    ) {
        super(
                nama,
                namaIlmiah,
                usia,
                berat,
                habitat,
                jenisMakanan,
                jenisReproduksi
        );

        this.jenisHabitatAir = jenisHabitatAir;
    }

    // Getter
    public JenisHabitat getJenisHabitatAir() {
        return jenisHabitatAir;
    }

    // Setter
    public void setJenisHabitatAir(JenisHabitat jenisHabitatAir) {
        this.jenisHabitatAir = jenisHabitatAir;
    }
}