package mahlukhidup.hewan.pisces;

import mahlukhidup.hewan.Pisces;
import mahlukhidup.enums.JenisMakanan;
import mahlukhidup.enums.JenisReproduksi;
import java.util.Set;

public class IkanNemo extends Pisces {

    public IkanNemo(String nama) {
        super(
                nama,
                "Amphiprion ocellaris",
                2,
                0.015,
                Set.of("Terumbu Karang", "Laut Tropis"),
                JenisMakanan.OMNIVORA,
                JenisReproduksi.OVIPAR
        );
    }

    @Override
    public void tumbuh() {
        System.out.println(getNama() + " tumbuh kecil dengan panjang maksimal 11 cm dan memiliki kemampuan unik mengubah jenis kelamin dari jantan ke betina.");
    }

    @Override
    public void berkembangBiak() {
        System.out.println(getNama() + " berkembang biak dengan bertelur ratusan butir pada permukaan datar dekat anemon laut, dijaga oleh pejantan hingga menetas.");
    }

    @Override
    public void bernapas() {
        System.out.println(getNama() + " bernapas dengan mengalirkan air melalui insang yang menyerap oksigen terlarut di perairan hangat terumbu karang.");
    }

    @Override
    public void meresponsRangsangan() {
        System.out.println(getNama() + " merespons rangsangan dengan berlindung di antara tentakel anemon laut yang menyengat, berkat lendir pelindung di tubuhnya.");
    }

    @Override
    public void makan() {
        System.out.println(getNama() + " memakan alga, plankton, dan sisa makanan anemon laut dalam hubungan simbiosis mutualisme.");
    }

    @Override
    public void bergerak() {
        System.out.println(getNama() + " bergerak dengan berenang lincah di antara tentakel anemon laut menggunakan sirip dada yang kecil dan cepat.");
    }
}
