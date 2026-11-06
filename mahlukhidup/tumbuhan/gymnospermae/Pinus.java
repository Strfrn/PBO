package mahlukhidup.tumbuhan.gymnospermae;

import mahlukhidup.tumbuhan.Gymnospermae;
import mahlukhidup.enums.JenisStrobilus;
import mahlukhidup.enums.JenisReproduksiTumbuhan;
import mahlukhidup.enums.TingkatKebutuhan;
import mahlukhidup.enums.JenisPertumbuhan;
import java.util.Set;

public class Pinus extends Gymnospermae {

    public Pinus(String nama) {
        super(nama, "Pinus merkusii", 20, 200.0, Set.of("Pegunungan", "Hutan Pinus"),
                JenisReproduksiTumbuhan.GENERATIF, TingkatKebutuhan.RENDAH,
                TingkatKebutuhan.TINGGI, JenisPertumbuhan.TAHUNAN, JenisStrobilus.JANTAN_DAN_BETINA);
    }

    @Override
    public void tumbuh() {
        System.out.println(getNama() + " menumbuhkan batang lurus menjulang tinggi dengan kulit kayu tebal bersisik di dataran tinggi pegunungan.");
    }

    @Override
    public void berkembangBiak() {
        System.out.println(getNama() + " berkembang biak melalui strobilus jantan yang melepaskan serbuk sari ke strobilus betina yang menghasilkan biji bersayap.");
    }

    @Override
    public void bernapas() {
        System.out.println(getNama() + " bernapas melalui stomata pada daun jarum yang tersusun dalam berkas, mengurangi kehilangan air di udara dingin.");
    }

    @Override
    public void meresponsRangsangan() {
        System.out.println(getNama() + " merespons rangsangan kekeringan dengan menutup stomata pada daun jarumnya untuk mencegah penguapan berlebih.");
    }

    @Override
    public void fotosintesis() {
        System.out.println(getNama() + " melakukan fotosintesis menggunakan daun berbentuk jarum yang tetap hijau sepanjang tahun (evergreen).");
    }

    @Override
    public void menyerapAir() {
        System.out.println(getNama() + " menyerap air melalui akar tunggang yang menghujam dalam ke tanah pegunungan yang kering dan berbatu.");
    }

    @Override
    public void menyerapNutrisi() {
        System.out.println(getNama() + " menyerap nutrisi dari tanah miskin hara pegunungan dibantu oleh jamur ektomikoriza pada akarnya.");
    }
}

