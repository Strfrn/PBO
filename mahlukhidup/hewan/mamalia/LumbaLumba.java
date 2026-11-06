package mahlukhidup.hewan.mamalia;

import mahlukhidup.hewan.Mamalia;
import mahlukhidup.enums.JenisMakanan;
import mahlukhidup.enums.JenisReproduksi;
import mahlukhidup.enums.JenisGigi;
import java.util.Set;

public class LumbaLumba extends Mamalia {

    public LumbaLumba(String nama) {
        super(
                nama,
                "Delphinus delphis",
                5,
                150.0,
                Set.of("Laut", "Samudra"),
                JenisMakanan.KARNIVORA,
                JenisReproduksi.VIVIPAR,
                JenisGigi.KARNIVORA
        );
    }

    @Override
    public void tumbuh() {
        System.out.println(getNama() + " tumbuh pesat di perairan hangat dan mencapai ukuran dewasa dalam 5-7 tahun.");
    }

    @Override
    public void berkembangBiak() {
        System.out.println(getNama() + " berkembang biak secara vivipar dengan masa kehamilan sekitar 12 bulan dan melahirkan satu anak.");
    }

    @Override
    public void bernapas() {
        System.out.println(getNama() + " bernapas menggunakan paru-paru dan harus naik ke permukaan laut secara berkala untuk menghirup udara melalui lubang sembur.");
    }

    @Override
    public void meresponsRangsangan() {
        System.out.println(getNama() + " merespons rangsangan dengan mengeluarkan suara klik dan siulan untuk berkomunikasi menggunakan ekolokasi.");
    }

    @Override
    public void makan() {
        System.out.println(getNama() + " memakan ikan-ikan kecil dan cumi-cumi dengan cara menangkap mangsa secara berkelompok.");
    }

    @Override
    public void bergerak() {
        System.out.println(getNama() + " bergerak dengan berenang lincah menggunakan sirip ekor dan sering melompat di atas permukaan air.");
    }

    @Override
    public void menyusuiAnak() {
        System.out.println(getNama() + " menyusui anaknya di bawah air dengan susu berlemak tinggi selama 18-24 bulan.");
    }
}
