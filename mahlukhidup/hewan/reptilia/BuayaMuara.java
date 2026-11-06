package mahlukhidup.hewan.reptilia;

import mahlukhidup.hewan.Reptilia;
import mahlukhidup.enums.JenisMakanan;
import mahlukhidup.enums.JenisReproduksi;
import java.util.Set;

public class BuayaMuara extends Reptilia {

    public BuayaMuara(String nama) {
        super(
                nama,
                "Crocodylus porosus",
                10,
                450.0,
                Set.of("Sungai", "Muara", "Rawa"),
                JenisMakanan.KARNIVORA,
                JenisReproduksi.OVIPAR
        );
    }

    @Override
    public void tumbuh() {
        System.out.println(getNama() + " tumbuh secara perlahan sepanjang hidupnya dan dapat mencapai panjang hingga 7 meter.");
    }

    @Override
    public void berkembangBiak() {
        System.out.println(getNama() + " berkembang biak dengan bertelur 40-60 butir di sarang yang dibuat dari tumpukan vegetasi di tepi sungai.");
    }

    @Override
    public void bernapas() {
        System.out.println(getNama() + " bernapas menggunakan paru-paru dan mampu menahan napas di bawah air selama lebih dari satu jam saat mengintai mangsa.");
    }

    @Override
    public void meresponsRangsangan() {
        System.out.println(getNama() + " merespons rangsangan dengan sensor tekanan di rahang yang sangat sensitif untuk mendeteksi getaran air dari mangsa.");
    }

    @Override
    public void makan() {
        System.out.println(getNama() + " memakan ikan, mamalia, dan burung dengan cara menyergap mangsa dari bawah air menggunakan gigitan rahang yang sangat kuat.");
    }

    @Override
    public void bergerak() {
        System.out.println(getNama() + " bergerak dengan berenang menggunakan ekor yang kuat di air dan merangkak di daratan dengan perut menempel tanah.");
    }

    @Override
    public void bergantiKulit() {
        System.out.println(getNama() + " berganti kulit secara bertahap dalam potongan-potongan kecil, berbeda dengan ular yang melepas seluruh kulitnya.");
    }
}
