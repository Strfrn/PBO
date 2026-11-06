package mahlukhidup.hewan.pisces;

import mahlukhidup.hewan.Pisces;
import mahlukhidup.enums.JenisMakanan;
import mahlukhidup.enums.JenisReproduksi;
import mahlukhidup.enums.JenisHabitatAir;
import java.util.Set;

public class IkanHiu extends Pisces {

    public IkanHiu(String nama) {
        super(
                nama,
                "Carcharodon carcharias",
                15,
                1100.0,
                Set.of("Laut", "Samudra"),
                JenisMakanan.KARNIVORA,
                JenisReproduksi.OVOVIVIPAR,
                JenisHabitatAir.AIR_LAUT
        );
    }

    @Override
    public void tumbuh() {
        System.out.println(getNama() + " tumbuh lambat dan terus bertambah besar sepanjang hidupnya, dapat mencapai panjang 6 meter.");
    }

    @Override
    public void berkembangBiak() {
        System.out.println(getNama() + " berkembang biak secara ovovivipar, embrio menetas di dalam rahim dan memakan telur lain sebelum dilahirkan.");
    }

    @Override
    public void bernapas() {
        System.out.println(getNama() + " bernapas dengan mengalirkan air laut melalui insang dan harus terus berenang agar air melewati insangnya.");
    }

    @Override
    public void meresponsRangsangan() {
        System.out.println(getNama() + " merespons rangsangan dengan organ ampullae of Lorenzini yang mendeteksi medan listrik lemah dari detak jantung mangsa.");
    }

    @Override
    public void makan() {
        System.out.println(getNama() + " memakan anjing laut, ikan besar, dan penyu dengan gigitan kuat dari barisan gigi tajam yang terus tumbuh berganti.");
    }

    @Override
    public void bergerak() {
        System.out.println(getNama() + " bergerak dengan berenang cepat menggunakan sirip ekor berbentuk bulan sabit dan tubuh hidrodinamis yang efisien.");
    }
}
