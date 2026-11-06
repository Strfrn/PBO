package mahlukhidup.tumbuhan;

import mahlukhidup.enums.JenisReproduksiTumbuhan;
import mahlukhidup.enums.TingkatKebutuhan;
import mahlukhidup.enums.JenisPertumbuhan;

import java.util.Set;

public abstract class Lumut extends Tumbuhan {

    private boolean memilikiPembuluhAngkut = false;

    public Lumut(
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

    // Getter
    public boolean isMemilikiPembuluhAngkut() {
        return memilikiPembuluhAngkut;
    }
}
