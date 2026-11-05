package mahlukhidup.hewan;

public abstract class Mamalia extends Hewan {

    private JenisGigi jenisGigi;

    public Mamalia(
            // Parameter dari MahlukHidup dan mahlukhidup.hewan.Hewan
            JenisGigi jenisGigi
    ) {
        super(/* parameter mahlukhidup.hewan.Hewan */);
        this.jenisGigi = jenisGigi;
    }

    public abstract void menyusuiAnak();

    // Getter dan setter
}