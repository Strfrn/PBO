package mahlukhidup.tumbuhan.paku;

import mahlukhidup.tumbuhan.Paku;
import mahlukhidup.enums.JenisReproduksiTumbuhan;
import mahlukhidup.enums.TingkatKebutuhan;
import mahlukhidup.enums.JenisPertumbuhan;
import java.util.Set;

public class SupliranAir extends Paku {

    public SupliranAir(String nama) {
        super(nama, "Salvinia molesta", 0.2, 0.01, Set.of("Danau", "Kolam"),
                JenisReproduksiTumbuhan.VEGETATIF, TingkatKebutuhan.TINGGI,
                TingkatKebutuhan.TINGGI, JenisPertumbuhan.SEMUSIM);
    }

    @Override
    public void tumbuh() {
        System.out.println(getNama() + " menumbuhkan daun-daun kecil mengapung yang tersusun berhadapan pada batang horizontal di permukaan air.");
    }

    @Override
    public void berkembangBiak() {
        System.out.println(getNama() + " berkembang biak sangat cepat secara vegetatif melalui fragmentasi stolonnya, mampu melipatgandakan populasi dalam waktu singkat.");
    }

    @Override
    public void bernapas() {
        System.out.println(getNama() + " bernapas melalui stomata pada permukaan atas daun mengapung yang tetap kering berkat rambut-rambut hidrofobik.");
    }

    @Override
    public void meresponsRangsangan() {
        System.out.println(getNama() + " merespons permukaan air dengan menjaga posisi mengapung menggunakan rambut-rambut berbentuk kocokan telur pada daunnya.");
    }

    @Override
    public void fotosintesis() {
        System.out.println(getNama() + " melakukan fotosintesis menggunakan daun-daun mengapung berwarna hijau cerah yang mendapat paparan cahaya matahari langsung di permukaan air.");
    }

    @Override
    public void menyerapAir() {
        System.out.println(getNama() + " menyerap air langsung dari permukaan danau atau kolam melalui daun tenggelam yang termodifikasi menjadi seperti akar.");
    }

    @Override
    public void menyerapNutrisi() {
        System.out.println(getNama() + " menyerap nutrisi terlarut seperti nitrogen dan fosfor langsung dari air danau melalui daun-daun tenggelamnya.");
    }
}

