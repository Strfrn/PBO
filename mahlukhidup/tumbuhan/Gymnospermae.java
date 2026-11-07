package mahlukhidup.tumbuhan;
import mahlukhidup.enums.tumbuhan.JenisStrobilus;
import mahlukhidup.enums.tumbuhan.JenisPertumbuhan;
import mahlukhidup.enums.tumbuhan.JenisReproduksiTumbuhan;
import mahlukhidup.enums.tumbuhan.TingkatKebutuhan;
import java.util.Set;

public abstract class Gymnospermae extends Tumbuhan {

    // Atribut
    private JenisStrobilus jenisStrobilus;

    // Constructor
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
