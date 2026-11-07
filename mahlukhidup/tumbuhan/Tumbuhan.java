package mahlukhidup.tumbuhan;
import mahlukhidup.enums.tumbuhan.JenisPertumbuhan;
import mahlukhidup.enums.tumbuhan.JenisReproduksiTumbuhan;
import mahlukhidup.enums.tumbuhan.TingkatKebutuhan;
import mahlukhidup.MahlukHidup;

import java.util.Set;

public abstract class Tumbuhan extends MahlukHidup {

    private JenisReproduksiTumbuhan jenisReproduksi;
    private TingkatKebutuhan kebutuhanAir;
    private TingkatKebutuhan kebutuhanCahaya;
    private JenisPertumbuhan jenisPertumbuhan;

    public Tumbuhan(
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
        super(nama, namaIlmiah, usia, berat, habitat);

        this.jenisReproduksi = jenisReproduksi;
        this.kebutuhanAir = kebutuhanAir;
        this.kebutuhanCahaya = kebutuhanCahaya;
        this.jenisPertumbuhan = jenisPertumbuhan;
    }

    public abstract void fotosintesis();
    public abstract void menyerapAir();
    public abstract void menyerapNutrisi();

    public JenisReproduksiTumbuhan getJenisReproduksi() {
        return jenisReproduksi;
    }

    public void setJenisReproduksi(JenisReproduksiTumbuhan jenisReproduksi) {
        this.jenisReproduksi = jenisReproduksi;
    }

    public TingkatKebutuhan getKebutuhanAir() {
        return kebutuhanAir;
    }

    public void setKebutuhanAir(TingkatKebutuhan kebutuhanAir) {
        this.kebutuhanAir = kebutuhanAir;
    }

    public TingkatKebutuhan getKebutuhanCahaya() {
        return kebutuhanCahaya;
    }

    public void setKebutuhanCahaya(TingkatKebutuhan kebutuhanCahaya) {
        this.kebutuhanCahaya = kebutuhanCahaya;
    }

    public JenisPertumbuhan getJenisPertumbuhan() {
        return jenisPertumbuhan;
    }

    public void setJenisPertumbuhan(JenisPertumbuhan jenisPertumbuhan) {
        this.jenisPertumbuhan = jenisPertumbuhan;
    }
}