package mahlukhidup.tumbuhan;
import mahlukhidup.enums.tumbuhan.JenisKepingBiji;
import mahlukhidup.enums.tumbuhan.JenisPertumbuhan;
import mahlukhidup.enums.tumbuhan.JenisReproduksiTumbuhan;
import mahlukhidup.enums.tumbuhan.TingkatKebutuhan;
import java.util.Set;

public abstract class Angiospermae extends Tumbuhan {

    // Atribut
    private JenisKepingBiji jenisKepingBiji;

    // Constructor
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
