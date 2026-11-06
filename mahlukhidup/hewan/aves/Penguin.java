package mahlukhidup.hewan.aves;

import mahlukhidup.hewan.Aves;
import mahlukhidup.enums.JenisMakanan;
import mahlukhidup.enums.JenisReproduksi;
import java.util.Set;

public class Penguin extends Aves {

    public Penguin(String nama) {
        super(
                nama,
                "Aptenodytes forsteri",
                4,
                30.0,
                Set.of("Antartika", "Laut"),
                JenisMakanan.KARNIVORA,
                JenisReproduksi.OVIPAR,
                false
        );
    }

    @Override
    public void tumbuh() {
        System.out.println(getNama() + " tumbuh dengan mengembangkan lapisan bulu tebal dan lemak subkutan untuk bertahan di suhu ekstrem Antartika.");
    }

    @Override
    public void berkembangBiak() {
        System.out.println(getNama() + " berkembang biak dengan bertelur satu butir yang dierami oleh pejantan di atas kakinya selama musim dingin kutub.");
    }

    @Override
    public void bernapas() {
        System.out.println(getNama() + " bernapas menggunakan paru-paru yang mampu menahan napas selama 20 menit saat menyelam ke kedalaman laut.");
    }

    @Override
    public void meresponsRangsangan() {
        System.out.println(getNama() + " merespons rangsangan dengan mengenali suara pasangan dan anaknya di antara ribuan penguin di koloni.");
    }

    @Override
    public void makan() {
        System.out.println(getNama() + " memakan ikan, cumi-cumi, dan krill yang ditangkap saat menyelam hingga kedalaman 500 meter.");
    }

    @Override
    public void bergerak() {
        System.out.println(getNama() + " bergerak dengan berjalan terhuyung di darat dan berenang cepat di laut menggunakan sayap sebagai sirip.");
    }
}
