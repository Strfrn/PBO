package mahlukhidup.tumbuhan.angiospermae;

import mahlukhidup.tumbuhan.Angiospermae;
import mahlukhidup.enums.JenisKepingBiji;
import mahlukhidup.enums.JenisReproduksiTumbuhan;
import mahlukhidup.enums.TingkatKebutuhan;
import mahlukhidup.enums.JenisPertumbuhan;
import java.util.Set;

public class Mawar extends Angiospermae {

    public Mawar(String nama) {
        super(nama, "Rosa hybrida", 1, 0.5, Set.of("Taman", "Dataran Tinggi"),
                JenisReproduksiTumbuhan.GENERATIF, TingkatKebutuhan.SEDANG,
                TingkatKebutuhan.TINGGI, JenisPertumbuhan.TAHUNAN, JenisKepingBiji.DIKOTIL);
    }

    @Override
    public void tumbuh() {
        System.out.println(getNama() + " menumbuhkan batang berduri dan tunas-tunas baru di setiap ruas batangnya.");
    }

    @Override
    public void berkembangBiak() {
        System.out.println(getNama() + " berkembang biak secara generatif melalui penyerbukan bunga oleh serangga seperti lebah.");
    }

    @Override
    public void bernapas() {
        System.out.println(getNama() + " bernapas melalui stomata pada daun majemuknya, menyerap O2 dan melepaskan CO2 di malam hari.");
    }

    @Override
    public void meresponsRangsangan() {
        System.out.println(getNama() + " merespons rangsangan cahaya dengan mengarahkan pertumbuhan bunganya ke arah sinar matahari (fototropisme).");
    }

    @Override
    public void fotosintesis() {
        System.out.println(getNama() + " melakukan fotosintesis menggunakan daun majemuk bergerigi yang tersusun menyirip.");
    }

    @Override
    public void menyerapAir() {
        System.out.println(getNama() + " menyerap air melalui sistem perakaran tunggang yang menyebar di dalam tanah gembur.");
    }

    @Override
    public void menyerapNutrisi() {
        System.out.println(getNama() + " menyerap nutrisi berupa nitrogen dan fosfor dari tanah subur melalui rambut-rambut akarnya.");
    }
}

