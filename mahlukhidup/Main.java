package mahlukhidup;

import mahlukhidup.hewan.Hewan;
import mahlukhidup.hewan.mamalia.*;
import mahlukhidup.hewan.aves.*;
import mahlukhidup.hewan.reptilia.*;
import mahlukhidup.hewan.amfibi.*;
import mahlukhidup.hewan.pisces.*;

import mahlukhidup.tumbuhan.Tumbuhan;
import mahlukhidup.tumbuhan.angiospermae.*;
import mahlukhidup.tumbuhan.gymnospermae.*;
import mahlukhidup.tumbuhan.lumut.*;
import mahlukhidup.tumbuhan.paku.*;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("=================================================");
        System.out.println("   DEMO HIERARKI MAKHLUK HIDUP (OOP JAVA)");
        System.out.println("=================================================\n");

        // 1. Instansiasi Hewan (Kingdom Animalia)
        List<Hewan> daftarHewan = List.of(
                // Mamalia
                new Kucing("Kucing Persia"),
                new LumbaLumba("Lumba-lumba Hidung Botol"),
                new Kelelawar("Kalong Besar"),
                // Aves
                new Elang("Elang Emas"),
                new Penguin("Penguin Kaisar"),
                new Merpati("Merpati Pos"),
                // Reptilia
                new BuayaMuara("Buaya Muara"),
                new KobraKing("King Kobra"),
                new Komodo("Komodo Dragon"),
                // Amfibi
                new KatakPohon("Katak Pohon Hijau"),
                new Salamander("Salamander Api"),
                new Axolotl("Axolotl Merah Muda"),
                // Pisces
                new IkanHiu("Hiu Putih Besar"),
                new IkanNemo("Ikan Badut"),
                new IkanArwana("Arwana Super Red")
        );

        System.out.println("--- DAFTAR SPESIES HEWAN (ANIMALIA) ---");
        for (Hewan h : daftarHewan) {
            System.out.println("\n[ " + h.getNama() + " (" + h.getNamaIlmiah() + ") ]");
            System.out.println("  Makanan      : " + h.getJenisMakanan());
            System.out.println("  Reproduksi   : " + h.getJenisReproduksi());
            System.out.println("  Habitat      : " + h.getHabitat());
            System.out.print("  Aksi Makan   : "); h.makan();
            System.out.print("  Aksi Bergerak: "); h.bergerak();
        }

        // 2. Instansiasi Tumbuhan (Kingdom Plantae)
        List<Tumbuhan> daftarTumbuhan = List.of(
                // Angiospermae
                new Mawar("Mawar Merah"),
                new Padi("Padi Ciherang"),
                new Mangga("Mangga Harum Manis"),
                // Gymnospermae
                new Pinus("Pinus Sumatera"),
                new PakisHaji("Pakis Haji"),
                new Damar("Pohon Damar"),
                // Lumut
                new LumutDaun("Lumut Daun Segar"),
                new LumutHati("Lumut Hati Payung"),
                new LumutTanduk("Lumut Tanduk Hutan"),
                // Paku
                new PakuSarangBurung("Paku Sarang Burung"),
                new SupliranAir("Kiambang Salvinia"),
                new SemanggiAir("Semanggi Air Sawah")
        );

        System.out.println("\n\n=================================================");
        System.out.println("--- DAFTAR SPESIES TUMBUHAN (PLANTAE) ---");
        for (Tumbuhan t : daftarTumbuhan) {
            System.out.println("\n[ " + t.getNama() + " (" + t.getNamaIlmiah() + ") ]");
            System.out.println("  Pertumbuhan  : " + t.getJenisPertumbuhan());
            System.out.println("  Kebutuhan Air: " + t.getKebutuhanAir());
            System.out.println("  Habitat      : " + t.getHabitat());
            System.out.print("  Fotosintesis : "); t.fotosintesis();
            System.out.print("  Serap Air    : "); t.menyerapAir();
        }

        System.out.println("\n=================================================");
        System.out.println("Semua 27 spesies berhasil di-instantiate & dijalankan!");
        System.out.println("=================================================");

        // 3. Penerapan Collection (HashMap & LinkedList) & Exception Handling
        System.out.println("\n\n=================================================");
        System.out.println("   DEMO PENERAPAN COLLECTION & EXCEPTION HANDLING");
        System.out.println("=================================================");

        PusatKonservasi suaka = new PusatKonservasi("Taman Nasional Konservasi Hayati");

        // Daftarkan semua hewan dan tumbuhan ke katalog (HashMap)
        for (Hewan h : daftarHewan) {
            suaka.daftarkan(h);
        }
        for (Tumbuhan t : daftarTumbuhan) {
            suaka.daftarkan(t);
        }
        System.out.println("Total spesimen terdaftar di katalog: " + suaka.getTotalSpesiesTerdaftar());

        // -----------------------------------------------------------------
        // FITUR 1: HashMap<String, List<Integer>> Evaluasi Skor Vitalitas
        // (Menghitung rata-rata & menampilkan spesimen dengan nilai tertinggi)
        // -----------------------------------------------------------------
        System.out.println("\n>>> FITUR 1: HashMap<String, List<Integer>> Skor Vitalitas Spesimen <<<");
        suaka.catatVitalitas("Komodo Dragon", 95, 90, 92);
        suaka.catatVitalitas("Elang Emas", 88, 92, 96);
        suaka.catatVitalitas("Hiu Putih Besar", 98, 97, 99);
        suaka.catatVitalitas("Kucing Persia", 82, 85, 80);
        suaka.catatVitalitas("Pohon Damar", 75, 80, 78);

        // Menampilkan rata-rata semua spesimen
        suaka.tampilkanSemuaRataRata();

        // Menampilkan spesimen dengan vitalitas tertinggi
        suaka.tampilkanVitalitasTertinggi();

        // -----------------------------------------------------------------
        // FITUR 2: Pencarian dengan Exception Handling (DataTidakDitemukanException)
        // -----------------------------------------------------------------
        System.out.println("\n>>> FITUR 2: Pencarian Spesimen & Custom Exception Handling <<<");

        // Skenario A: Nama makhluk hidup ADA di dalam HashMap
        String namaAda = "Komodo Dragon";
        System.out.println("\n[Skenario 1] Mencari spesimen yang ADA: \"" + namaAda + "\"");
        try {
            MahlukHidup mh = suaka.cariMahlukHidup(namaAda);
            System.out.println("Hasil: Ditemukan -> " + mh.getNama() + " (" + mh.getNamaIlmiah() + ")");
            System.out.println("       Habitat: " + mh.getHabitat());
        } catch (DataTidakDitemukanException e) {
            System.out.println("Exception Tertangkap: " + e.getMessage());
        }

        // Skenario B: Nama makhluk hidup TIDAK ADA di dalam HashMap
        String namaTidakAda = "Kambing Gunung";
        System.out.println("\n[Skenario 2] Mencari spesimen yang TIDAK ADA: \"" + namaTidakAda + "\"");
        try {
            MahlukHidup mh = suaka.cariMahlukHidup(namaTidakAda);
            System.out.println("Hasil: Ditemukan -> " + mh.getNama());
        } catch (DataTidakDitemukanException e) {
            System.out.println("Exception Tertangkap: " + e.getMessage());
        }

        // -----------------------------------------------------------------
        // FITUR 3: LinkedList Antrian Pemeriksaan Medis Satwa (Queue FIFO)
        // -----------------------------------------------------------------
        System.out.println("\n>>> FITUR 3: Antrian Medis Satwa (LinkedList FIFO) <<<");
        suaka.tambahAntrianMedis(daftarHewan.get(0)); // Kucing
        suaka.tambahAntrianMedis(daftarHewan.get(6)); // Buaya Muara
        suaka.tambahAntrianMedis(daftarHewan.get(3)); // Elang

        suaka.prosesAntrianMedis();

        // -----------------------------------------------------------------
        // FITUR 4: HashMap Pengelompokan Habitat
        // -----------------------------------------------------------------
        suaka.tampilkanZonaHabitat();
    }
}

