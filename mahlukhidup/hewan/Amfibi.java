package mahlukhidup.hewan;

import mahlukhidup.enums.JenisMakanan;
import mahlukhidup.enums.JenisReproduksi;

import java.util.Set;

public abstract class Amfibi extends Hewan {

    public Amfibi(
            String nama,
            String namaIlmiah,
            double usia,
            double berat,
            Set<String> habitat,
            JenisMakanan jenisMakanan,
            JenisReproduksi jenisReproduksi
    ) {
        super(nama, namaIlmiah, usia, berat, habitat, jenisMakanan, jenisReproduksi);
    }
}
