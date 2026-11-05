import java.util.Set;

public abstract class Pisces extends Hewan {

    // Atribut
    private JenisHabitatAir jenisHabitatAir;

    // Constructor
    public Pisces(
            String nama,
            String namaIlmiah,
            double usia,
            double berat,
            Set<String> habitat,
            JenisMakanan jenisMakanan,
            JenisReproduksi jenisReproduksi,
            JenisHabitatAir jenisHabitatAir
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

        this.jenisHabitatAir = jenisHabitatAir;
    }

    // Getter
    public JenisHabitatAir getJenisHabitatAir() {
        return jenisHabitatAir;
    }

    // Setter
    public void setJenisHabitatAir(JenisHabitatAir jenisHabitatAir) {
        this.jenisHabitatAir = jenisHabitatAir;
    }
}