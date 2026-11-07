package mahlukhidup.hewan;

import java.util.Set;
import mahlukhidup.enums.hewan.JenisMakanan;
import mahlukhidup.enums.hewan.JenisReproduksi;

public abstract class Aves extends Hewan {

    // Atribut
    private boolean kemampuanTerbang;

    // Constructor
    public Aves(
            String nama,
            String namaIlmiah,
            double usia,
            double berat,
            Set<String> habitat,
            JenisMakanan jenisMakanan,
            JenisReproduksi jenisReproduksi,
            boolean kemampuanTerbang) {
        super(
                nama,
                namaIlmiah,
                usia,
                berat,
                habitat,
                jenisMakanan,
                jenisReproduksi);

        this.kemampuanTerbang = kemampuanTerbang;
    }

    // Getter
    public boolean isKemampuanTerbang() {
        return kemampuanTerbang;
    }

    // Setter
    public void setKemampuanTerbang(boolean kemampuanTerbang) {
        this.kemampuanTerbang = kemampuanTerbang;
    }

}

    