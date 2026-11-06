package mahlukhidup.tumbuhan;

import mahlukhidup.enums.JenisKepingBiji;
import mahlukhidup.enums.JenisReproduksiTumbuhan;
import mahlukhidup.enums.TingkatKebutuhan;
import mahlukhidup.enums.JenisPertumbuhan;

import java.util.Set;

public abstract class Angiospermae extends Tumbuhan {

    private JenisKepingBiji jenisKepingBiji;

    public Angiospermae(
            String nama,
            String namaIlmiah,
            double usia,
            double berat,
            Set<String> habitat,
            JenisReproduksiTumbuhan jenisReproduksi,
            TingkatKebutuhan kebutuhanAir,
            TingkatKebutuhan kebutuhanCahaya,
            JenisPertumbuhan jenisPertumbuhan,
            JenisKepingBiji jenisKepingBiji
    ) {
        super(
                nama,
                namaIlmiah,
                usia,
                berat,
                habitat,
                jenisReproduksi,
                kebutuhanAir,
                kebutuhanCahaya,
                jenisPertumbuhan
        );

        this.jenisKepingBiji = jenisKepingBiji;
    }

    // Getter
    public JenisKepingBiji getJenisKepingBiji() {
        return jenisKepingBiji;
    }

    // Setter
    public void setJenisKepingBiji(JenisKepingBiji jenisKepingBiji) {
        this.jenisKepingBiji = jenisKepingBiji;
    }
}
