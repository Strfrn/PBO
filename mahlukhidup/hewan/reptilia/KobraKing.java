package mahlukhidup.hewan.reptilia;

import mahlukhidup.hewan.Reptilia;
import mahlukhidup.enums.JenisMakanan;
import mahlukhidup.enums.JenisReproduksi;
import java.util.Set;

public class KobraKing extends Reptilia {

    public KobraKing(String nama) {
        super(
                nama,
                "Ophiophagus hannah",
                5,
                6.0,
                Set.of("Hutan", "Rawa"),
                JenisMakanan.KARNIVORA,
                JenisReproduksi.OVIPAR
        );
    }

    @Override
    public void tumbuh() {
        System.out.println(getNama() + " tumbuh menjadi ular berbisa terpanjang di dunia, dapat mencapai panjang hingga 5.5 meter.");
    }

    @Override
    public void berkembangBiak() {
        System.out.println(getNama() + " berkembang biak dengan bertelur 20-40 butir dan menjaga sarang dengan agresif hingga telur menetas.");
    }

    @Override
    public void bernapas() {
        System.out.println(getNama() + " bernapas menggunakan paru-paru tunggal yang memanjang di sepanjang tubuhnya.");
    }

    @Override
    public void meresponsRangsangan() {
        System.out.println(getNama() + " merespons rangsangan dengan mengembangkan tudung leher dan mendesis keras sebagai peringatan sebelum menyerang.");
    }

    @Override
    public void makan() {
        System.out.println(getNama() + " memakan ular lain termasuk ular berbisa, menelan mangsa secara utuh berkat rahang yang dapat membuka sangat lebar.");
    }

    @Override
    public void bergerak() {
        System.out.println(getNama() + " bergerak dengan meluncur tanpa kaki menggunakan kontraksi otot tubuh secara bergelombang di lantai hutan.");
    }

    @Override
    public void bergantiKulit() {
        System.out.println(getNama() + " berganti kulit secara utuh 4-6 kali setahun dengan melepaskan kulit lama dari kepala hingga ekor dalam satu potongan.");
    }
}
