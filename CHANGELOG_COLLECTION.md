# Laporan Penerapan Java Collection Framework & Exception Handling pada Proyek MahlukHidup

Dokumen ini merangkum seluruh penambahan dan pembaruan kode pada proyek **MahlukHidup** untuk memenuhi kriteria tugas praktikum (Collection & Exception Handling) yang disesuaikan secara langsung dengan domain makhluk hidup.

---

## 1. Konsep & Fitur yang Diterapkan

Sesuai instruksi soal:
1. **Sistem Evaluasi Metrik menggunakan `HashMap<String, List<Integer>>`**:
   - Memetakan nama makhluk hidup ke riwayat skor evaluasi vitalitas / kondisi fisik (bisa memiliki lebih dari satu skor).
   - Menghitung rata-rata nilai vitalitas setiap makhluk hidup (`hitungRataRataVitalitas`).
   - Menemukan dan menampilkan makhluk hidup dengan rata-rata tertinggi (`tampilkanVitalitasTertinggi`).
2. **Pencarian Data dengan Custom Exception Handling**:
   - Menggunakan `HashMap<String, MahlukHidup>`.
   - Method `cariMahlukHidup(String nama)` yang melempar `DataTidakDitemukanException` jika nama makhluk hidup yang dicari tidak ada dalam Map.
   - Diuji dengan skenario nama yang ada (misal: `"Komodo Dragon"`) dan nama yang tidak ada (misal: `"Kambing Gunung"`).
3. **Penerapan `LinkedList` (Queue FIFO)**:
   - Antrian pemeriksaan medis satwa di suaka/konservasi (`tambahAntrianMedis` menggunakan `addLast` dan `prosesAntrianMedis` menggunakan `pollFirst`).
4. **Penerapan `HashMap<String, List<MahlukHidup>>`**:
   - Pengelompokan seluruh 27 spesies makhluk hidup secara otomatis berdasarkan zona habitatnya (Hutan, Danau, Laut, Sawah, dsb).

---

## 2. Rincian File yang Ditambahkan & Dimodifikasi

### A. Custom Exception: `mahlukhidup/DataTidakDitemukanException.java` (BARU)
```java
package mahlukhidup;

public class DataTidakDitemukanException extends Exception {
    public DataTidakDitemukanException(String pesan) {
        super(pesan);
    }
}
```

### B. Pusat Konservasi: `mahlukhidup/PusatKonservasi.java` (BARU)
Mengelola data koleksi untuk objek `MahlukHidup`:
- `Map<String, MahlukHidup> dataMahlukHidup`: Registry katalog spesimen.
- `Map<String, List<Integer>> riwayatVitalitas`: Implementasi `HashMap<String, List<Integer>>` untuk pencatatan skor vitalitas, perhitungan rata-rata, dan pencarian nilai tertinggi.
- `LinkedList<Hewan> antrianPemeriksaan`: Antrian medis satwa (Queue FIFO).
- `Map<String, List<MahlukHidup>> zonaHabitat`: Distribusi spesies per habitat.

### C. Pembaruan Runner: `mahlukhidup/Main.java`
- Bagian 1 (Daftar Hewan) dan Bagian 2 (Daftar Tumbuhan) **tidak diubah/dimodifikasi sama sekali**.
- Bagian 3 ditambahkan di baris paling bawah untuk menjalankan demonstrasi:
  1. Pengisian skor vitalitas, kalkulasi rata-rata, dan penampilan spesimen terbaik (`Hiu Putih Besar` dengan rata-rata 98.00).
  2. Pengujian `cariMahlukHidup()` dengan try-catch menangani skenario data ditemukan vs data tidak ditemukan (`DataTidakDitemukanException`).
  3. Pemrosesan antrian medis `LinkedList`.
  4. Penampilan data agregasi habitat.

---

## 3. Cara Menjalankan Program

Jalankan perintah berikut di terminal:
```bash
javac mahlukhidup/Main.java
java mahlukhidup.Main
```

### Cuplikan Output Bagian Demo Collection:
```text
=================================================
   DEMO PENERAPAN COLLECTION & EXCEPTION HANDLING
=================================================
Total spesimen terdaftar di katalog: 27

>>> FITUR 1: HashMap<String, List<Integer>> Skor Vitalitas Spesimen <<<
Daftar Skor & Rata-Rata Vitalitas/Kondisi Spesimen:
- Kucing Persia          : Skor = [82, 85, 80]    | Rata-rata = 82.33
- Komodo Dragon          : Skor = [95, 90, 92]    | Rata-rata = 92.33
- Elang Emas             : Skor = [88, 92, 96]    | Rata-rata = 92.00
- Pohon Damar            : Skor = [75, 80, 78]    | Rata-rata = 77.67
- Hiu Putih Besar        : Skor = [98, 97, 99]    | Rata-rata = 98.00

Spesimen dengan Rata-Rata Vitalitas Tertinggi:
Nama      : Hiu Putih Besar
Rata-rata : 98.00
Riwayat   : [98, 97, 99]

>>> FITUR 2: Pencarian Spesimen & Custom Exception Handling <<<

[Skenario 1] Mencari spesimen yang ADA: "Komodo Dragon"
Hasil: Ditemukan -> Komodo Dragon (Varanus komodoensis)
       Habitat: [Pulau Komodo, Savana]

[Skenario 2] Mencari spesimen yang TIDAK ADA: "Kambing Gunung"
Exception Tertangkap: Data makhluk hidup dengan nama "Kambing Gunung" tidak ditemukan dalam sistem!

>>> FITUR 3: Antrian Medis Satwa (LinkedList FIFO) <<<
  [+ Antrian] Kucing Persia masuk ke antrian pemeriksaan.
  [+ Antrian] Buaya Muara masuk ke antrian pemeriksaan.
  [+ Antrian] Elang Emas masuk ke antrian pemeriksaan.

--- Memproses Antrian Pemeriksaan Medis (LinkedList FIFO) ---
  1. Memeriksa Kucing Persia (Felis catus)
     Berat: 4.5 kg | Makanan: KARNIVORA
     Respons: Kucing Persia merespons rangsangan dengan menggerakkan telinga dan mengembangkan kumis untuk mendeteksi getaran.
  2. Memeriksa Buaya Muara (Crocodylus porosus)
     Berat: 450.0 kg | Makanan: KARNIVORA
     Respons: Buaya Muara merespons rangsangan dengan sensor tekanan di rahang yang sangat sensitif untuk mendeteksi getaran air dari mangsa.
  3. Memeriksa Elang Emas (Aquila chrysaetos)
     Berat: 5.0 kg | Makanan: KARNIVORA
     Respons: Elang Emas merespons rangsangan dengan penglihatan tajam yang mampu mendeteksi mangsa dari jarak lebih dari 3 kilometer.
```
