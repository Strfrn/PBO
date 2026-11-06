package mahlukhidup.hewan.amfibi;

import mahlukhidup.hewan.Amfibi;
import mahlukhidup.enums.JenisMakanan;
import mahlukhidup.enums.JenisReproduksi;
import java.util.Set;

public class Salamander extends Amfibi {

    public Salamander(String nama) {
        super(
                nama,
                "Salamandra salamandra",
                2,
                0.04,
                Set.of("Hutan Lembab", "Sungai"),
                JenisMakanan.KARNIVORA,
                JenisReproduksi.OVOVIVIPAR
        );
    }

    @Override
    public void tumbuh() {
        System.out.println(getNama() + " tumbuh perlahan dan memiliki kemampuan luar biasa untuk meregenerasi anggota tubuh yang hilang.");
    }

    @Override
    public void berkembangBiak() {
        System.out.println(getNama() + " berkembang biak secara ovovivipar, telur menetas di dalam tubuh induk dan larva dilahirkan dalam kondisi sudah aktif.");
    }

    @Override
    public void bernapas() {
        System.out.println(getNama() + " bernapas melalui kulit lembabnya dan paru-paru sederhana, membutuhkan lingkungan yang selalu basah.");
    }

    @Override
    public void meresponsRangsangan() {
        System.out.println(getNama() + " merespons rangsangan dengan mengeluarkan racun dari kelenjar parotoid di belakang matanya sebagai pertahanan diri.");
    }

    @Override
    public void makan() {
        System.out.println(getNama() + " memakan cacing tanah, siput, dan larva serangga yang ditemukan di bawah bebatuan dan daun-daun basah.");
    }

    @Override
    public void bergerak() {
        System.out.println(getNama() + " bergerak dengan merangkak perlahan menggunakan empat kaki pendek di sepanjang lantai hutan yang lembab.");
    }
}
