package mahlukhidup.hewan;

import java.util.Set;
import mahlukhidup.enums.hewan.JenisMakanan;
import mahlukhidup.enums.hewan.JenisReproduksi;
import mahlukhidup.enums.hewan.JenisGigi;

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
        super(
                nama,
                namaIlmiah,
                usia,
                berat,
                habitat,
                jenisMakanan,
                jenisReproduksi
        );

        this.jenisGigi = jenisGigi;
    }

    public abstract void menyusuiAnak();

    public JenisGigi getJenisGigi() {
        return jenisGigi;
    }

    public void setJenisGigi(JenisGigi jenisGigi) {
        this.jenisGigi = jenisGigi;
    }
}