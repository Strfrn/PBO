package mahlukhidup.tumbuhan.paku;

import mahlukhidup.tumbuhan.Paku;
import mahlukhidup.enums.JenisReproduksiTumbuhan;
import mahlukhidup.enums.TingkatKebutuhan;
import mahlukhidup.enums.JenisPertumbuhan;
import java.util.Set;

public class SemanggiAir extends Paku {

    public SemanggiAir(String nama) {
        super(nama, "Marsilea crenata", 0.3, 0.02, Set.of("Sawah", "Rawa"),
                JenisReproduksiTumbuhan.KEDUANYA, TingkatKebutuhan.TINGGI,
                TingkatKebutuhan.SEDANG, JenisPertumbuhan.PRIMER);
    }

    @Override
    public void tumbuh() {
        System.out.println(getNama() + " menumbuhkan daun berempat anak daun menyerupai semanggi yang muncul dari rizoma menjalar di dasar perairan dangkal.");
    }

    @Override
    public void berkembangBiak() {
        System.out.println(getNama() + " berkembang biak secara vegetatif melalui rizoma menjalar dan secara generatif melalui sporokarp yang mengandung spora di dasar air.");
    }

    @Override
    public void bernapas() {
        System.out.println(getNama() + " bernapas melalui stomata pada permukaan daun yang mengapung di atas air serta melalui aerenkima pada tangkai daunnya.");
    }

    @Override
    public void meresponsRangsangan() {
        System.out.println(getNama() + " merespons perubahan tinggi air dengan memanjangkan tangkai daun agar tetap mengapung di permukaan sawah atau rawa.");
    }

    @Override
    public void fotosintesis() {
        System.out.println(getNama() + " melakukan fotosintesis menggunakan empat anak daun yang mengembang rata di permukaan air untuk menangkap cahaya matahari secara optimal.");
    }

    @Override
    public void menyerapAir() {
        System.out.println(getNama() + " menyerap air melalui akar-akar halus pada rizoma yang terendam di lumpur dasar sawah dan rawa.");
    }

    @Override
    public void menyerapNutrisi() {
        System.out.println(getNama() + " menyerap nutrisi dari lumpur sawah yang kaya mineral melalui akar-akar adventif pada setiap ruas rizomanya.");
    }
}

