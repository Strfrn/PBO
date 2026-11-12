package mahlukhidup.tumbuhan.gymnospermae;

import mahlukhidup.tumbuhan.Gymnospermae;
import mahlukhidup.enums.JenisStrobilus;
import mahlukhidup.enums.JenisReproduksiTumbuhan;
import mahlukhidup.enums.TingkatKebutuhan;
import mahlukhidup.enums.JenisPertumbuhan;
import java.util.Set;

public class PakisHaji extends Gymnospermae {

    public PakisHaji(String nama) {
        super(nama, "Cycas rumphii", 15, 80.0, Set.of("Hutan Tropis", "Pantai"),
                JenisReproduksiTumbuhan.GENERATIF, TingkatKebutuhan.SEDANG,
                TingkatKebutuhan.TINGGI, JenisPertumbuhan.SEKUNDER, JenisStrobilus.BETINA);
    }

    @Override
    public void tumbuh() {
        System.out.println(getNama() + " menumbuhkan batang pendek kokoh dengan mahkota daun menyirip yang tumbuh melingkar di puncak batang.");
    }

    @Override
    public void berkembangBiak() {
        System.out.println(getNama() + " berkembang biak melalui strobilus betina yang menghasilkan biji besar berwarna merah-oranye di antara daun sporofil.");
    }

    @Override
    public void bernapas() {
        System.out.println(getNama() + " bernapas melalui stomata pada permukaan bawah daun menyirip yang tebal dan kaku.");
    }

    @Override
    public void meresponsRangsangan() {
        System.out.println(getNama() + " merespons rangsangan cahaya dengan mengarahkan pertumbuhan daun mudanya secara perlahan ke sumber cahaya.");
    }

    @Override
    public void fotosintesis() {
        System.out.println(getNama() + " melakukan fotosintesis menggunakan daun majemuk menyirip yang besar dan tersusun dalam roset di puncak batang.");
    }

    @Override
    public void menyerapAir() {
        System.out.println(getNama() + " menyerap air melalui akar coraloid khusus yang juga bersimbiosis dengan sianobakteri pengikat nitrogen.");
    }

    @Override
    public void menyerapNutrisi() {
        System.out.println(getNama() + " menyerap nutrisi dari tanah berpasir pantai dibantu oleh sianobakteri Nostoc pada akar coraloidnya.");
    }
}

