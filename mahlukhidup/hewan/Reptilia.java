package mahlukhidup.hewan;

import java.util.Set;

public abstract class Reptilia extends Hewan {

    // Constructor
    public Reptilia(
            String nama,
            String namaIlmiah,
            double usia,
            double berat,
            Set<String> habitat,
            JenisMakanan jenisMakanan,
            JenisReproduksi jenisReproduksi
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
    }

    // Method
    public abstract void bergantiKulit();
}