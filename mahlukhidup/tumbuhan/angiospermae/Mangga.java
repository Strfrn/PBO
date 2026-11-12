package mahlukhidup.tumbuhan.angiospermae;

import mahlukhidup.tumbuhan.Angiospermae;
import mahlukhidup.enums.JenisKepingBiji;
import mahlukhidup.enums.JenisReproduksiTumbuhan;
import mahlukhidup.enums.TingkatKebutuhan;
import mahlukhidup.enums.JenisPertumbuhan;
import java.util.Set;

public class Mangga extends Angiospermae {

    public Mangga(String nama) {
        super(nama, "Mangifera indica", 10, 50.0, Set.of("Hutan Tropis", "Kebun"),
                JenisReproduksiTumbuhan.GENERATIF, TingkatKebutuhan.SEDANG,
                TingkatKebutuhan.TINGGI, JenisPertumbuhan.SEKUNDER, JenisKepingBiji.DIKOTIL);
    }

    @Override
    public void tumbuh() {
        System.out.println(getNama() + " menumbuhkan cabang-cabang besar dengan tajuk rindang yang dapat mencapai ketinggian 40 meter.");
    }

    @Override
    public void berkembangBiak() {
        System.out.println(getNama() + " berkembang biak secara generatif melalui penyerbukan bunga oleh lalat dan lebah pada malai bunga majemuk.");
    }

    @Override
    public void bernapas() {
        System.out.println(getNama() + " bernapas melalui stomata pada permukaan bawah daun tebal dan lentisel pada kulit batangnya yang kasar.");
    }

    @Override
    public void meresponsRangsangan() {
        System.out.println(getNama() + " merespons perubahan musim dengan menggugurkan daun tua dan menumbuhkan tunas muda berwarna kemerahan.");
    }

    @Override
    public void fotosintesis() {
        System.out.println(getNama() + " melakukan fotosintesis menggunakan daun tunggal yang lebar, tebal, dan hijau tua dengan luas permukaan besar.");
    }

    @Override
    public void menyerapAir() {
        System.out.println(getNama() + " menyerap air melalui sistem perakaran tunggang yang dalam dan menyebar luas di tanah tropis.");
    }

    @Override
    public void menyerapNutrisi() {
        System.out.println(getNama() + " menyerap nutrisi berupa magnesium dan besi dari tanah subur tropis melalui mikoriza pada akarnya.");
    }
}

