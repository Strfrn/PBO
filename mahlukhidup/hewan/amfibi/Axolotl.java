package mahlukhidup.hewan.amfibi;

import mahlukhidup.hewan.Amfibi;
import mahlukhidup.enums.JenisMakanan;
import mahlukhidup.enums.JenisReproduksi;
import java.util.Set;

public class Axolotl extends Amfibi {

    public Axolotl(String nama) {
        super(
                nama,
                "Ambystoma mexicanum",
                3,
                0.15,
                Set.of("Danau", "Air Tawar"),
                JenisMakanan.KARNIVORA,
                JenisReproduksi.OVIPAR
        );
    }

    @Override
    public void tumbuh() {
        System.out.println(getNama() + " tumbuh unik dengan mempertahankan bentuk larva sepanjang hidupnya (neoteni) tanpa mengalami metamorfosis penuh.");
    }

    @Override
    public void berkembangBiak() {
        System.out.println(getNama() + " berkembang biak dengan bertelur 100-1000 butir yang menempel pada tanaman air dan menetas dalam 2 minggu.");
    }

    @Override
    public void bernapas() {
        System.out.println(getNama() + " bernapas menggunakan insang luar bercabang yang menonjol di sisi kepalanya, sekaligus melalui kulit dan paru-paru primitif.");
    }

    @Override
    public void meresponsRangsangan() {
        System.out.println(getNama() + " merespons rangsangan dengan meregenerasi bagian tubuh yang terluka, termasuk otak, jantung, dan anggota gerak secara sempurna.");
    }

    @Override
    public void makan() {
        System.out.println(getNama() + " memakan cacing, larva serangga, dan ikan kecil dengan cara menyedot mangsa ke dalam mulut menggunakan tekanan vakum.");
    }

    @Override
    public void bergerak() {
        System.out.println(getNama() + " bergerak dengan berenang perlahan menggunakan ekor pipih dan berjalan di dasar danau dengan empat kaki mungilnya.");
    }
}
