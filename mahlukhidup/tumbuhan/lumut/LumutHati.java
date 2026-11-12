package mahlukhidup.tumbuhan.lumut;

import mahlukhidup.tumbuhan.Lumut;
import mahlukhidup.enums.JenisReproduksiTumbuhan;
import mahlukhidup.enums.TingkatKebutuhan;
import mahlukhidup.enums.JenisPertumbuhan;
import java.util.Set;

public class LumutHati extends Lumut {

    public LumutHati(String nama) {
        super(nama, "Marchantia polymorpha", 0.3, 0.001, Set.of("Tanah Lembab", "Tepi Sungai"),
                JenisReproduksiTumbuhan.KEDUANYA, TingkatKebutuhan.TINGGI,
                TingkatKebutuhan.RENDAH, JenisPertumbuhan.PRIMER);
    }

    @Override
    public void tumbuh() {
        System.out.println(getNama() + " menumbuhkan talus pipih bercabang dikotom yang menjalar di permukaan tanah basah tepi sungai.");
    }

    @Override
    public void berkembangBiak() {
        System.out.println(getNama() + " berkembang biak secara vegetatif melalui gemma cup (piala tunas) dan secara generatif melalui anteridiofor dan arkegoniofor.");
    }

    @Override
    public void bernapas() {
        System.out.println(getNama() + " bernapas melalui porus udara (air pore) pada permukaan atas talus yang menghubungkan ke ruang udara internal.");
    }

    @Override
    public void meresponsRangsangan() {
        System.out.println(getNama() + " merespons percikan air hujan yang menyebarkan gemma dari piala tunasnya ke lokasi baru untuk perkembangbiakan vegetatif.");
    }

    @Override
    public void fotosintesis() {
        System.out.println(getNama() + " melakukan fotosintesis pada lapisan sel berfotosintesis di bawah porus udara pada permukaan talus pipihnya.");
    }

    @Override
    public void menyerapAir() {
        System.out.println(getNama() + " menyerap air melalui rizoid-rizoid halus di permukaan bawah talus dan secara langsung dari tanah basah tepi sungai.");
    }

    @Override
    public void menyerapNutrisi() {
        System.out.println(getNama() + " menyerap nutrisi mineral dari substrat lembab melalui rizoid uniseluler di permukaan bawah talusnya.");
    }
}

