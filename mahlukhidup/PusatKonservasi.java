package mahlukhidup;

import mahlukhidup.hewan.Hewan;

import java.util.*;

/**
 * Sistem Pengelolaan & Konservasi Makhluk Hidup.
 * Menerapkan Java Collection Framework (HashMap & LinkedList)
 * serta Exception Handling (DataTidakDitemukanException).
 */
public class PusatKonservasi {

    private String namaPusat;

    // 1. HashMap<String, MahlukHidup> untuk registrasi & pencarian cepat spesimen
    private Map<String, MahlukHidup> dataMahlukHidup;

    // 2. HashMap<String, List<Integer>> memetakan nama makhluk hidup ke riwayat skor vitalitas / populasi
    //    (Fungsi: menghitung rata-rata dan mencari spesimen dengan rata-rata tertinggi)
    private Map<String, List<Integer>> riwayatVitalitas;

    // 3. LinkedList<Hewan> untuk antrian pemeriksaan medis satwa (Queue FIFO)
    private LinkedList<Hewan> antrianPemeriksaan;

    // 4. HashMap<String, List<MahlukHidup>> untuk pengelompokan berdasarkan zona habitat
    private Map<String, List<MahlukHidup>> zonaHabitat;

    public PusatKonservasi(String namaPusat) {
        this.namaPusat = namaPusat;
        this.dataMahlukHidup = new HashMap<>();
        this.riwayatVitalitas = new HashMap<>();
        this.antrianPemeriksaan = new LinkedList<>();
        this.zonaHabitat = new HashMap<>();
    }

    // =========================================================================
    // BAGIAN A: REGISTRASI & PENCARIAN MAKLUK HIDUP (DENGAN CUSTOM EXCEPTION)
    // =========================================================================

    /**
     * Mendaftarkan makhluk hidup ke katalog Map dan mengelompokkan ke habitat.
     */
    public void daftarkan(MahlukHidup mh) {
        dataMahlukHidup.put(mh.getNama(), mh);

        for (String hab : mh.getHabitat()) {
            zonaHabitat.computeIfAbsent(hab, k -> new ArrayList<>()).add(mh);
        }
    }

    /**
     * Mencari makhluk hidup berdasarkan nama pada HashMap.
     * Melempar DataTidakDitemukanException jika nama tidak ada dalam Map.
     */
    public MahlukHidup cariMahlukHidup(String nama) throws DataTidakDitemukanException {
        if (!dataMahlukHidup.containsKey(nama)) {
            throw new DataTidakDitemukanException("Data makhluk hidup dengan nama \"" + nama + "\" tidak ditemukan dalam sistem!");
        }
        return dataMahlukHidup.get(nama);
    }

    // =========================================================================
    // BAGIAN B: PENGELOLAAN METRIK DENGAN HashMap<String, List<Integer>>
    // (Menghitung rata-rata & mencari nilai rata-rata tertinggi)
    // =========================================================================

    /**
     * Menambahkan riwayat skor vitalitas/kesehatan untuk spesimen.
     */
    public void catatVitalitas(String nama, Integer... skor) {
        riwayatVitalitas.computeIfAbsent(nama, k -> new ArrayList<>()).addAll(Arrays.asList(skor));
    }

    /**
     * Menghitung nilai rata-rata dari riwayat vitalitas spesimen.
     */
    public double hitungRataRataVitalitas(String nama) {
        List<Integer> listSkor = riwayatVitalitas.get(nama);
        if (listSkor == null || listSkor.isEmpty()) {
            return 0.0;
        }
        int total = 0;
        for (int s : listSkor) {
            total += s;
        }
        return (double) total / listSkor.size();
    }

    /**
     * Menampilkan rata-rata skor vitalitas untuk semua spesimen yang dicatat.
     */
    public void tampilkanSemuaRataRata() {
        System.out.println("Daftar Skor & Rata-Rata Vitalitas/Kondisi Spesimen:");
        for (Map.Entry<String, List<Integer>> entry : riwayatVitalitas.entrySet()) {
            String nama = entry.getKey();
            double rataRata = hitungRataRataVitalitas(nama);
            System.out.printf("- %-22s : Skor = %-15s | Rata-rata = %.2f\n", nama, entry.getValue(), rataRata);
        }
    }

    /**
     * Menampilkan spesimen yang memiliki rata-rata skor vitalitas tertinggi.
     */
    public void tampilkanVitalitasTertinggi() {
        if (riwayatVitalitas.isEmpty()) {
            System.out.println("Belum ada data skor vitalitas yang dicatat.");
            return;
        }

        String spesimenTertinggi = null;
        double skorTertinggi = -1.0;

        for (String nama : riwayatVitalitas.keySet()) {
            double rataRata = hitungRataRataVitalitas(nama);
            if (rataRata > skorTertinggi) {
                skorTertinggi = rataRata;
                spesimenTertinggi = nama;
            }
        }

        System.out.println("\nSpesimen dengan Rata-Rata Vitalitas Tertinggi:");
        System.out.printf("Nama      : %s\n", spesimenTertinggi);
        System.out.printf("Rata-rata : %.2f\n", skorTertinggi);
        System.out.printf("Riwayat   : %s\n", riwayatVitalitas.get(spesimenTertinggi));
    }

    // =========================================================================
    // BAGIAN C: ANTRIAN PEMERIKSAAN MEDIS SATWA (LinkedList FIFO)
    // =========================================================================

    /**
     * Memasukkan hewan ke antrian medis (LinkedList addLast).
     */
    public void tambahAntrianMedis(Hewan hewan) {
        antrianPemeriksaan.addLast(hewan);
        System.out.println("  [+ Antrian] " + hewan.getNama() + " masuk ke antrian pemeriksaan.");
    }

    /**
     * Memproses pemeriksaan medis hewan satu per satu (LinkedList pollFirst).
     */
    public void prosesAntrianMedis() {
        System.out.println("\n--- Memproses Antrian Pemeriksaan Medis (LinkedList FIFO) ---");
        int nomor = 1;
        while (!antrianPemeriksaan.isEmpty()) {
            Hewan pasien = antrianPemeriksaan.pollFirst();
            System.out.println("  " + nomor + ". Memeriksa " + pasien.getNama() + " (" + pasien.getNamaIlmiah() + ")");
            System.out.println("     Berat: " + pasien.getBerat() + " kg | Makanan: " + pasien.getJenisMakanan());
            System.out.print("     Respons: ");
            pasien.meresponsRangsangan();
            nomor++;
        }
    }

    // =========================================================================
    // BAGIAN D: DISTRIBUSI HABITAT (HashMap<String, List<MahlukHidup>>)
    // =========================================================================

    public void tampilkanZonaHabitat() {
        System.out.println("\n--- Distribusi Spesies Berdasarkan Habitat (HashMap<String, List>) ---");
        for (Map.Entry<String, List<MahlukHidup>> entry : zonaHabitat.entrySet()) {
            System.out.println("\nZona Habitat: " + entry.getKey() + " (" + entry.getValue().size() + " spesies)");
            for (MahlukHidup mh : entry.getValue()) {
                System.out.println("  - " + mh.getNama() + " (" + mh.getNamaIlmiah() + ")");
            }
        }
    }

    public int getTotalSpesiesTerdaftar() {
        return dataMahlukHidup.size();
    }

    public String getNamaPusat() {
        return namaPusat;
    }
}
