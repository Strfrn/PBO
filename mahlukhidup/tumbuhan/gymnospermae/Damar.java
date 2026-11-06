package mahlukhidup.tumbuhan.gymnospermae;

import mahlukhidup.tumbuhan.Gymnospermae;
import mahlukhidup.enums.JenisStrobilus;
import mahlukhidup.enums.JenisReproduksiTumbuhan;
import mahlukhidup.enums.TingkatKebutuhan;
import mahlukhidup.enums.JenisPertumbuhan;
import java.util.Set;

public class Damar extends Gymnospermae {

    public Damar(String nama) {
        super(nama, "Agathis dammara", 30, 500.0, Set.of("Hutan Hujan", "Pegunungan"),
                JenisReproduksiTumbuhan.GENERATIF, TingkatKebutuhan.SEDANG,
                TingkatKebutuhan.SEDANG, JenisPertumbuhan.TAHUNAN, JenisStrobilus.JANTAN_DAN_BETINA);
    }

    @Override
    public void tumbuh() {
        System.out.println(getNama() + " menumbuhkan batang raksasa lurus dengan diameter besar dan tajuk piramidal di hutan hujan tropis.");
    }

    @Override
    public void berkembangBiak() {
        System.out.println(getNama() + " berkembang biak melalui strobilus jantan dan betina yang terpisah, menghasilkan biji bersayap yang disebarkan angin.");
    }

    @Override
    public void bernapas() {
        System.out.println(getNama() + " bernapas melalui stomata pada daun tebal berbentuk oval dan lentisel pada kulit batangnya yang menghasilkan resin.");
    }

    @Override
    public void meresponsRangsangan() {
        System.out.println(getNama() + " merespons luka pada batang dengan mengeluarkan getah damar (resin) untuk menutup dan melindungi jaringan yang rusak.");
    }

    @Override
    public void fotosintesis() {
        System.out.println(getNama() + " melakukan fotosintesis menggunakan daun tunggal tebal berbentuk oval dengan kutikula lilin tebal untuk menahan kelembaban.");
    }

    @Override
    public void menyerapAir() {
        System.out.println(getNama() + " menyerap air melalui sistem perakaran yang masif dan dalam, menembus lapisan tanah hutan hujan tropis.");
    }

    @Override
    public void menyerapNutrisi() {
        System.out.println(getNama() + " menyerap nutrisi dari humus tebal lantai hutan hujan melalui jaringan akar yang luas dan mikoriza.");
    }
}

