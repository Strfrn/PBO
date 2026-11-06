package mahlukhidup.hewan.aves;

import mahlukhidup.hewan.Aves;
import mahlukhidup.enums.JenisMakanan;
import mahlukhidup.enums.JenisReproduksi;
import java.util.Set;

public class Merpati extends Aves {

    public Merpati(String nama) {
        super(
                nama,
                "Columba livia",
                2,
                0.3,
                Set.of("Perkotaan", "Pedesaan"),
                JenisMakanan.HERBIVORA,
                JenisReproduksi.OVIPAR,
                true
        );
    }

    @Override
    public void tumbuh() {
        System.out.println(getNama() + " tumbuh dengan cepat dan sudah bisa terbang dalam 4-6 minggu setelah menetas.");
    }

    @Override
    public void berkembangBiak() {
        System.out.println(getNama() + " berkembang biak dengan bertelur 2 butir dan mengeraminya secara bergantian antara jantan dan betina selama 17-19 hari.");
    }

    @Override
    public void bernapas() {
        System.out.println(getNama() + " bernapas menggunakan sistem paru-paru dan kantung udara yang memungkinkan aliran udara searah untuk terbang jarak jauh.");
    }

    @Override
    public void meresponsRangsangan() {
        System.out.println(getNama() + " merespons rangsangan dengan kemampuan navigasi magnetis yang luar biasa untuk menemukan jalan pulang dari jarak ratusan kilometer.");
    }

    @Override
    public void makan() {
        System.out.println(getNama() + " memakan biji-bijian, kacang-kacangan, dan buah-buahan kecil yang ditemukan di tanah.");
    }

    @Override
    public void bergerak() {
        System.out.println(getNama() + " bergerak dengan terbang stabil menggunakan kepakan sayap berirama dan dapat mencapai kecepatan 77 km/jam.");
    }
}
