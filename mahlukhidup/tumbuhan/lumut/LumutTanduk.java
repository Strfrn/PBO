package mahlukhidup.tumbuhan.lumut;

import mahlukhidup.tumbuhan.Lumut;
import mahlukhidup.enums.JenisReproduksiTumbuhan;
import mahlukhidup.enums.TingkatKebutuhan;
import mahlukhidup.enums.JenisPertumbuhan;
import java.util.Set;

public class LumutTanduk extends Lumut {

    public LumutTanduk(String nama) {
        super(nama, "Anthoceros punctatus", 0.4, 0.001, Set.of("Tanah Lembab", "Hutan"),
                JenisReproduksiTumbuhan.KEDUANYA, TingkatKebutuhan.TINGGI,
                TingkatKebutuhan.RENDAH, JenisPertumbuhan.PRIMER);
    }

    @Override
    public void tumbuh() {
        System.out.println(getNama() + " menumbuhkan sporofit berbentuk tanduk panjang yang tumbuh terus-menerus dari meristem basal pada talus roset.");
    }

    @Override
    public void berkembangBiak() {
        System.out.println(getNama() + " berkembang biak melalui spora yang dilepaskan saat kapsul berbentuk tanduk membelah dari ujung ke pangkal secara bertahap.");
    }

    @Override
    public void bernapas() {
        System.out.println(getNama() + " bernapas melalui stomata pada sporofit berbentuk tanduk dan secara difusi pada permukaan talus gametofit.");
    }

    @Override
    public void meresponsRangsangan() {
        System.out.println(getNama() + " merespons tingkat cahaya dengan mengatur koloni sianobakteri Nostoc di dalam talusnya untuk membantu fiksasi nitrogen.");
    }

    @Override
    public void fotosintesis() {
        System.out.println(getNama() + " melakukan fotosintesis menggunakan kloroplas tunggal besar di setiap sel talus, unik di antara tumbuhan darat.");
    }

    @Override
    public void menyerapAir() {
        System.out.println(getNama() + " menyerap air melalui permukaan talus roset yang tipis dan menempel erat pada tanah lembab lantai hutan.");
    }

    @Override
    public void menyerapNutrisi() {
        System.out.println(getNama() + " menyerap nutrisi dari tanah hutan dan memperoleh nitrogen tambahan dari sianobakteri Nostoc simbiotik di dalam talusnya.");
    }
}

