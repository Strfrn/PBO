package mahlukhidup.hewan.aves;

import mahlukhidup.hewan.Aves;
import mahlukhidup.enums.JenisMakanan;
import mahlukhidup.enums.JenisReproduksi;
import java.util.Set;

public class Elang extends Aves {

    public Elang(String nama) {
        super(
                nama,
                "Aquila chrysaetos",
                3,
                5.0,
                Set.of("Pegunungan", "Hutan"),
                JenisMakanan.KARNIVORA,
                JenisReproduksi.OVIPAR,
                true
        );
    }

    @Override
    public void tumbuh() {
        System.out.println(getNama() + " tumbuh dengan mengembangkan bulu-bulu kuat dan sayap lebar untuk menguasai langit.");
    }

    @Override
    public void berkembangBiak() {
        System.out.println(getNama() + " berkembang biak dengan bertelur di sarang besar di puncak tebing dan mengerami 1-3 telur selama 45 hari.");
    }

    @Override
    public void bernapas() {
        System.out.println(getNama() + " bernapas menggunakan paru-paru dan kantung udara yang efisien untuk mendukung terbang di ketinggian tinggi.");
    }

    @Override
    public void meresponsRangsangan() {
        System.out.println(getNama() + " merespons rangsangan dengan penglihatan tajam yang mampu mendeteksi mangsa dari jarak lebih dari 3 kilometer.");
    }

    @Override
    public void makan() {
        System.out.println(getNama() + " memakan mamalia kecil, ular, dan burung lain yang ditangkap dengan cakar tajamnya saat menukik dari ketinggian.");
    }

    @Override
    public void bergerak() {
        System.out.println(getNama() + " bergerak dengan terbang melayang di arus udara panas dan menukik dengan kecepatan hingga 320 km/jam.");
    }
}
