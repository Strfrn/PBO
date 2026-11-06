package mahlukhidup.tumbuhan;

import mahlukhidup.enums.JenisStrobilus;
import mahlukhidup.enums.JenisReproduksiTumbuhan;
import mahlukhidup.enums.TingkatKebutuhan;
import mahlukhidup.enums.JenisPertumbuhan;

import java.util.Set;

public abstract class Gymnospermae extends Tumbuhan {

    private JenisStrobilus jenisStrobilus;

    public Gymnospermae(
            String nama,
            String namaIlmiah,
            double usia,
            double berat,
            Set<String> habitat,
            JenisReproduksiTumbuhan jenisReproduksi,
            TingkatKebutuhan kebutuhanAir,
            TingkatKebutuhan kebutuhanCahaya,
            JenisPertumbuhan jenisPertumbuhan,
            JenisStrobilus jenisStrobilus
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

        this.jenisStrobilus = jenisStrobilus;
    }

    // Getter
    public JenisStrobilus getJenisStrobilus() {
        return jenisStrobilus;
    }

    // Setter
    public void setJenisStrobilus(JenisStrobilus jenisStrobilus) {
        this.jenisStrobilus = jenisStrobilus;
    }
}
