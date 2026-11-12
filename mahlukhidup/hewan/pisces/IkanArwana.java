package mahlukhidup.hewan.pisces;

import mahlukhidup.hewan.Pisces;
import mahlukhidup.enums.JenisMakanan;
import mahlukhidup.enums.JenisReproduksi;
import java.util.Set;

public class IkanArwana extends Pisces {

    public IkanArwana(String nama) {
        super(
                nama,
                "Scleropages formosus",
                5,
                7.0,
                Set.of("Sungai", "Danau"),
                JenisMakanan.KARNIVORA,
                JenisReproduksi.OVIPAR
        );
    }

    @Override
    public void tumbuh() {
        System.out.println(getNama() + " tumbuh dengan mengembangkan sisik besar berkilau keemasan dan tubuh memanjang yang anggun hingga 90 cm.");
    }

    @Override
    public void berkembangBiak() {
        System.out.println(getNama() + " berkembang biak dengan bertelur dan pejantan mengerami telur di dalam mulutnya (mouthbrooder) selama beberapa minggu.");
    }

    @Override
    public void bernapas() {
        System.out.println(getNama() + " bernapas melalui insang dan mampu mengambil oksigen tambahan dari udara di permukaan air menggunakan gelembung renang.");
    }

    @Override
    public void meresponsRangsangan() {
        System.out.println(getNama() + " merespons rangsangan dengan melompat tinggi ke permukaan air untuk menangkap serangga dan hewan kecil di atas air.");
    }

    @Override
    public void makan() {
        System.out.println(getNama() + " memakan serangga, katak kecil, dan ikan lain yang ditangkap dari permukaan air dengan rahang atas yang kuat.");
    }

    @Override
    public void bergerak() {
        System.out.println(getNama() + " bergerak dengan berenang tenang di permukaan air menggunakan sirip punggung dan sirip dubur yang panjang.");
    }
}
