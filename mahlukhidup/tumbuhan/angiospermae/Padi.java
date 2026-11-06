package mahlukhidup.tumbuhan.angiospermae;

import mahlukhidup.tumbuhan.Angiospermae;
import mahlukhidup.enums.JenisKepingBiji;
import mahlukhidup.enums.JenisReproduksiTumbuhan;
import mahlukhidup.enums.TingkatKebutuhan;
import mahlukhidup.enums.JenisPertumbuhan;
import java.util.Set;

public class Padi extends Angiospermae {

    public Padi(String nama) {
        super(nama, "Oryza sativa", 0.5, 0.1, Set.of("Sawah", "Dataran Rendah"),
                JenisReproduksiTumbuhan.GENERATIF, TingkatKebutuhan.TINGGI,
                TingkatKebutuhan.TINGGI, JenisPertumbuhan.SEMUSIM, JenisKepingBiji.MONOKOTIL);
    }

    @Override
    public void tumbuh() {
        System.out.println(getNama() + " menumbuhkan anakan-anakan baru dari ruas batang utama membentuk rumpun yang lebat.");
    }

    @Override
    public void berkembangBiak() {
        System.out.println(getNama() + " berkembang biak secara generatif melalui penyerbukan sendiri pada malai bunga yang muncul dari pelepah daun.");
    }

    @Override
    public void bernapas() {
        System.out.println(getNama() + " bernapas melalui stomata pada permukaan daun panjangnya dan melalui aerenkima pada akar yang terendam air.");
    }

    @Override
    public void meresponsRangsangan() {
        System.out.println(getNama() + " merespons rangsangan gravitasi dengan mengarahkan akarnya ke bawah (geotropisme positif) di lahan sawah berlumpur.");
    }

    @Override
    public void fotosintesis() {
        System.out.println(getNama() + " melakukan fotosintesis secara efisien menggunakan daun sempit panjang bertulang daun sejajar khas monokotil.");
    }

    @Override
    public void menyerapAir() {
        System.out.println(getNama() + " menyerap air dalam jumlah besar melalui akar serabut yang terendam di genangan sawah.");
    }

    @Override
    public void menyerapNutrisi() {
        System.out.println(getNama() + " menyerap nutrisi berupa kalium dan silika dari tanah sawah berlumpur melalui akar serabutnya.");
    }
}

