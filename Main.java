import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // CLASS & OBJECT
        Kucing tom = new Kucing("Tom", 3, "abu-abu", 4);
        Burung kenari = new Burung("Kenari", 2, 15.5);
        Pohon mangga = new Pohon("Mangga", 10, "hijau tua", 6.5);

        // COLLECTION + UPCASTING: semua subclass disimpan sebagai MakhlukHidup
        ArrayList<MakhlukHidup> daftar = new ArrayList<>();
        daftar.add(tom);
        daftar.add(kenari);
        daftar.add(mangga);

        // POLYMORPHISM: satu loop, perilaku beda tiap objek
        System.out.println("=== Rutinitas ===");
        for (MakhlukHidup m : daftar) {
            m.bernapas();
            m.makan();
            m.suaraKhas();
            if (m instanceof Terbang) {          // pengecekan interface
                ((Terbang) m).terbang();
                ((Terbang) m).mendarat();
            }
            System.out.println();
        }

        System.out.println("=== Data Makhluk Hidup ===");
        for (MakhlukHidup m : daftar) {
            m.tampilkanInfo();
            System.out.println("-----");
        }

        // OVERLOADING
        System.out.println("=== Overloading makan() ===");
        tom.makan();
        tom.makan("daging ayam");
        tom.makan("whiskas", 2);

        // Method khusus subclass
        System.out.println("\n=== Method khusus subclass ===");
        tom.mencakar();
        tom.menyusui();
        mangga.fotosintesis();
        mangga.tumbuh(0.5);

        // UPCASTING / DOWNCASTING
        MakhlukHidup m = tom;                 // upcast
        if (m instanceof Kucing) {
            Kucing k = (Kucing) m;            // downcast
            System.out.println("\nDowncast berhasil, warna bulu: " + k.getWarnaBulu());
        }

        // EXCEPTION HANDLING + ENCAPSULATION
        System.out.println("\n=== Validasi umur ===");
        try {
            tom.setUmur(-5);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Umur Tom tetap " + tom.getUmur());
        }

        // STATIC & FINAL
        System.out.println("\nJumlah makhluk dibuat : " + MakhlukHidup.getJumlahMakhluk());
        System.out.println("Konstanta KERAJAAN    : " + MakhlukHidup.KERAJAAN);
        System.out.println("toString              : " + tom);
    }
}
