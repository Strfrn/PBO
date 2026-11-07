package mahlukhidup.tumbuhan;
import mahlukhidup.enums.tumbuhan.JenisPertumbuhan;
import mahlukhidup.enums.tumbuhan.JenisReproduksiTumbuhan;
import mahlukhidup.enums.tumbuhan.TingkatKebutuhan;
import java.util.Set;

public abstract class Paku extends Tumbuhan {

    // Constructor
    public Paku(
            String nama,
            String namaIlmiah,
            double usia,
            double berat,
            Set<String> habitat,
            JenisReproduksiTumbuhan jenisReproduksi,
            TingkatKebutuhan kebutuhanAir,
            TingkatKebutuhan kebutuhanCahaya,
            JenisPertumbuhan jenisPertumbuhan
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
    }
}
