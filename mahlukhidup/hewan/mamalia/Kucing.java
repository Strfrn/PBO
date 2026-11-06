package mahlukhidup.hewan.mamalia;

import mahlukhidup.hewan.Mamalia;
import mahlukhidup.enums.JenisMakanan;
import mahlukhidup.enums.JenisReproduksi;
import mahlukhidup.enums.JenisGigi;
import java.util.Set;

public class Kucing extends Mamalia {

    public Kucing(String nama) {
        super(
                nama,
                "Felis catus",
                2,
                4.5,
                Set.of("Rumah", "Hutan"),
                JenisMakanan.KARNIVORA,
                JenisReproduksi.VIVIPAR,
                JenisGigi.KARNIVORA
        );
    }

    @Override
    public void tumbuh() {
        System.out.println(getNama() + " tumbuh dengan cepat selama tahun pertama kehidupannya.");
    }

    @Override
    public void berkembangBiak() {
        System.out.println(getNama() + " berkembang biak secara vivipar dan dapat melahirkan 3-5 anak kucing dalam sekali kehamilan.");
    }

    @Override
    public void bernapas() {
        System.out.println(getNama() + " bernapas menggunakan paru-paru dengan ritme tenang saat beristirahat.");
    }

    @Override
    public void meresponsRangsangan() {
        System.out.println(getNama() + " merespons rangsangan dengan menggerakkan telinga dan mengembangkan kumis untuk mendeteksi getaran.");
    }

    @Override
    public void makan() {
        System.out.println(getNama() + " memakan daging dan mencabik mangsa menggunakan cakar dan gigi tajamnya.");
    }

    @Override
    public void bergerak() {
        System.out.println(getNama() + " bergerak dengan berlari gesit dan melompat tinggi untuk menangkap mangsa.");
    }

    @Override
    public void menyusuiAnak() {
        System.out.println(getNama() + " menyusui anak-anaknya dengan susu yang kaya protein selama 6-8 minggu pertama.");
    }
}
