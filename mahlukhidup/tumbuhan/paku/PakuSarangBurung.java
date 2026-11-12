package mahlukhidup.tumbuhan.paku;

import mahlukhidup.tumbuhan.Paku;
import mahlukhidup.enums.JenisReproduksiTumbuhan;
import mahlukhidup.enums.TingkatKebutuhan;
import mahlukhidup.enums.JenisPertumbuhan;
import java.util.Set;

public class PakuSarangBurung extends Paku {

    public PakuSarangBurung(String nama) {
        super(nama, "Asplenium nidus", 2, 3.0, Set.of("Hutan Hujan", "Pohon"),
                JenisReproduksiTumbuhan.VEGETATIF, TingkatKebutuhan.TINGGI,
                TingkatKebutuhan.SEDANG, JenisPertumbuhan.PRIMER);
    }

    @Override
    public void tumbuh() {
        System.out.println(getNama() + " menumbuhkan daun (frond) panjang berbentuk lanset yang tersusun roset membentuk sarang di batang pohon inang.");
    }

    @Override
    public void berkembangBiak() {
        System.out.println(getNama() + " berkembang biak secara vegetatif melalui tunas adventif dan spora yang terbentuk pada sorus di bawah permukaan daun.");
    }

    @Override
    public void bernapas() {
        System.out.println(getNama() + " bernapas melalui stomata pada permukaan bawah daun frond besar yang tipis dan berkilau.");
    }

    @Override
    public void meresponsRangsangan() {
        System.out.println(getNama() + " merespons kelembaban udara tinggi di kanopi hutan dengan memperluas pertumbuhan daun untuk menangkap lebih banyak air.");
    }

    @Override
    public void fotosintesis() {
        System.out.println(getNama() + " melakukan fotosintesis menggunakan daun frond lebar dan tipis yang efisien menyerap cahaya redup di bawah kanopi hutan.");
    }

    @Override
    public void menyerapAir() {
        System.out.println(getNama() + " menyerap air hujan dan embun yang tertampung dalam roset daun berbentuk sarang serta melalui akar epifit yang menempel pada pohon.");
    }

    @Override
    public void menyerapNutrisi() {
        System.out.println(getNama() + " menyerap nutrisi dari serasah daun dan humus yang terkumpul di dalam roset sarangnya sebagai tumbuhan epifit.");
    }
}

