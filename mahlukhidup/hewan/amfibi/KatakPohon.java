package mahlukhidup.hewan.amfibi;

import mahlukhidup.hewan.Amfibi;
import mahlukhidup.enums.JenisMakanan;
import mahlukhidup.enums.JenisReproduksi;
import java.util.Set;

public class KatakPohon extends Amfibi {

    public KatakPohon(String nama) {
        super(
                nama,
                "Rhacophorus reinwardtii",
                1,
                0.05,
                Set.of("Hutan Hujan", "Pohon"),
                JenisMakanan.KARNIVORA,
                JenisReproduksi.OVIPAR
        );
    }

    @Override
    public void tumbuh() {
        System.out.println(getNama() + " tumbuh melalui metamorfosis dari berudu air menjadi katak dewasa yang hidup di pepohonan.");
    }

    @Override
    public void berkembangBiak() {
        System.out.println(getNama() + " berkembang biak dengan bertelur di sarang busa yang ditempelkan pada daun di atas genangan air agar berudu jatuh ke air saat menetas.");
    }

    @Override
    public void bernapas() {
        System.out.println(getNama() + " bernapas melalui paru-paru dan kulit lembabnya yang tipis, memungkinkan pertukaran gas langsung dengan lingkungan.");
    }

    @Override
    public void meresponsRangsangan() {
        System.out.println(getNama() + " merespons rangsangan dengan mengubah warna tubuh dan mengeluarkan suara panggilan nyaring di malam hari untuk menarik pasangan.");
    }

    @Override
    public void makan() {
        System.out.println(getNama() + " memakan serangga kecil seperti nyamuk, lalat, dan semut yang ditangkap dengan lidah lengket yang sangat cepat.");
    }

    @Override
    public void bergerak() {
        System.out.println(getNama() + " bergerak dengan melompat antar dahan menggunakan bantalan jari yang lengket dan selaput kaki untuk meluncur di udara.");
    }
}
