package mahlukhidup.tumbuhan.lumut;

import mahlukhidup.tumbuhan.Lumut;
import mahlukhidup.enums.JenisReproduksiTumbuhan;
import mahlukhidup.enums.TingkatKebutuhan;
import mahlukhidup.enums.JenisPertumbuhan;
import java.util.Set;

public class LumutDaun extends Lumut {

    public LumutDaun(String nama) {
        super(nama, "Funaria hygrometrica", 0.5, 0.001, Set.of("Tanah Lembab", "Bebatuan"),
                JenisReproduksiTumbuhan.KEDUANYA, TingkatKebutuhan.TINGGI,
                TingkatKebutuhan.RENDAH, JenisPertumbuhan.PRIMER);
    }

    @Override
    public void tumbuh() {
        System.out.println(getNama() + " menumbuhkan gametofit tegak berdaun kecil yang membentuk bantalan hijau lebat di permukaan tanah lembab.");
    }

    @Override
    public void berkembangBiak() {
        System.out.println(getNama() + " berkembang biak secara generatif melalui spora yang dilepaskan dari kapsul sporangium pada tangkai seta, dan secara vegetatif melalui fragmentasi.");
    }

    @Override
    public void bernapas() {
        System.out.println(getNama() + " bernapas melalui seluruh permukaan tubuhnya karena tidak memiliki stomata sejati, pertukaran gas terjadi secara difusi langsung.");
    }

    @Override
    public void meresponsRangsangan() {
        System.out.println(getNama() + " merespons kelembaban dengan melengkungkan tangkai seta (higroskopis) untuk melepaskan spora saat udara kering.");
    }

    @Override
    public void fotosintesis() {
        System.out.println(getNama() + " melakukan fotosintesis menggunakan filoid (daun semu) tipis selapis sel yang efisien menyerap cahaya redup.");
    }

    @Override
    public void menyerapAir() {
        System.out.println(getNama() + " menyerap air langsung melalui seluruh permukaan tubuhnya secara osmosis karena tidak memiliki akar sejati.");
    }

    @Override
    public void menyerapNutrisi() {
        System.out.println(getNama() + " menyerap nutrisi mineral terlarut dari air hujan dan embun yang mengalir di permukaan tanah lembab.");
    }
}

