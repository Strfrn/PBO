package mahlukhidup.hewan.reptilia;

import mahlukhidup.hewan.Reptilia;
import mahlukhidup.enums.JenisMakanan;
import mahlukhidup.enums.JenisReproduksi;
import java.util.Set;

public class Komodo extends Reptilia {

    public Komodo(String nama) {
        super(
                nama,
                "Varanus komodoensis",
                8,
                70.0,
                Set.of("Pulau Komodo", "Savana"),
                JenisMakanan.KARNIVORA,
                JenisReproduksi.OVIPAR
        );
    }

    @Override
    public void tumbuh() {
        System.out.println(getNama() + " tumbuh menjadi kadal terbesar di dunia dengan panjang mencapai 3 meter dan berat hingga 90 kg.");
    }

    @Override
    public void berkembangBiak() {
        System.out.println(getNama() + " berkembang biak dengan bertelur 15-30 butir di lubang tanah dan mengeraminya selama 7-8 bulan.");
    }

    @Override
    public void bernapas() {
        System.out.println(getNama() + " bernapas menggunakan paru-paru dan mengatur suhu tubuh dengan berjemur di bawah sinar matahari pagi.");
    }

    @Override
    public void meresponsRangsangan() {
        System.out.println(getNama() + " merespons rangsangan dengan menjulurkan lidah bercabang untuk mendeteksi bau mangsa dari jarak hingga 10 kilometer.");
    }

    @Override
    public void makan() {
        System.out.println(getNama() + " memakan rusa, babi hutan, dan kerbau dengan menggigit mangsa dan membiarkan bakteri serta bisa di air liurnya melemahkan korban.");
    }

    @Override
    public void bergerak() {
        System.out.println(getNama() + " bergerak dengan berjalan lamban di atas empat kaki tetapi mampu berlari cepat hingga 20 km/jam saat menyerang mangsa.");
    }

    @Override
    public void bergantiKulit() {
        System.out.println(getNama() + " berganti kulit secara bertahap dalam kepingan-kepingan kecil selama proses pertumbuhan berlangsung.");
    }
}
