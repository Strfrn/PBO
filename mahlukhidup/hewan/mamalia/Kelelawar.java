package mahlukhidup.hewan.mamalia;

import mahlukhidup.hewan.Mamalia;
import mahlukhidup.enums.JenisMakanan;
import mahlukhidup.enums.JenisReproduksi;
import mahlukhidup.enums.JenisGigi;
import java.util.Set;

public class Kelelawar extends Mamalia {

    public Kelelawar(String nama) {
        super(
                nama,
                "Pteropus vampyrus",
                1,
                0.8,
                Set.of("Gua", "Hutan"),
                JenisMakanan.HERBIVORA,
                JenisReproduksi.VIVIPAR,
                JenisGigi.HERBIVORA
        );
    }

    @Override
    public void tumbuh() {
        System.out.println(getNama() + " tumbuh dengan cepat dan mulai belajar terbang dalam beberapa minggu setelah lahir.");
    }

    @Override
    public void berkembangBiak() {
        System.out.println(getNama() + " berkembang biak secara vivipar dan biasanya melahirkan satu anak yang bergantung pada induknya selama berbulan-bulan.");
    }

    @Override
    public void bernapas() {
        System.out.println(getNama() + " bernapas menggunakan paru-paru dengan laju pernapasan yang meningkat drastis saat terbang.");
    }

    @Override
    public void meresponsRangsangan() {
        System.out.println(getNama() + " merespons rangsangan dengan menggunakan ekolokasi ultrasonik untuk mendeteksi objek di kegelapan malam.");
    }

    @Override
    public void makan() {
        System.out.println(getNama() + " memakan buah-buahan dan nektar bunga, berperan penting sebagai penyerbuk tanaman di hutan tropis.");
    }

    @Override
    public void bergerak() {
        System.out.println(getNama() + " bergerak dengan terbang menggunakan membran sayap yang terbentang di antara jari-jarinya, aktif di malam hari.");
    }

    @Override
    public void menyusuiAnak() {
        System.out.println(getNama() + " menyusui anaknya sambil bergantung terbalik di langit-langit gua dengan susu kaya nutrisi.");
    }
}
