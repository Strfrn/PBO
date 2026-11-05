public abstract class Mamalia extends Hewan {

    private JenisGigi jenisGigi;

    public Mamalia(
            // Parameter dari MahlukHidup dan Hewan
            JenisGigi jenisGigi
    ) {
        super(/* parameter Hewan */);
        this.jenisGigi = jenisGigi;
    }

    public abstract void menyusuiAnak();

    // Getter dan setter
}