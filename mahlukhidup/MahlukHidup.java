package mahlukhidup;

import java.util.Set;

public abstract class MahlukHidup {

    // Atribut
    private String nama;
    private String namaIlmiah;
    private double usia;
    private double berat;
    private Set<String> habitat;
    private boolean masihHidup;

    // Constructor
    public MahlukHidup(
            String nama,
            String namaIlmiah,
            double usia,
            double berat,
            Set<String> habitat
    ) {
        this.nama = nama;
        this.namaIlmiah = namaIlmiah;
        this.usia = usia;
        this.berat = berat;
        this.habitat = habitat;
        this.masihHidup = true;
    }

    // Abstract Methods
    public abstract void tumbuh();

    public abstract void berkembangBiak();

    public abstract void bernapas();

    public abstract void meresponsRangsangan();

    // Concrete Methods
    public void mati() {
        this.masihHidup = false;
        System.out.println(nama + " telah mati.");
    }

    public void tambahUsia(double tahun) {
        if (tahun > 0 && masihHidup) {
            this.usia += tahun;
        }
    }

    // Getters
    public String getNama() {
        return nama;
    }

    public String getNamaIlmiah() {
        return namaIlmiah;
    }

    public double getUsia() {
        return usia;
    }

    public double getBerat() {
        return berat;
    }

    public Set<String> getHabitat() {
        return habitat;
    }

    public boolean isMasihHidup() {
        return masihHidup;
    }

    // Setters
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setBerat(double berat) {
        if (berat > 0) {
            this.berat = berat;
        }
    }

    public void setHabitat(Set<String> habitat) {
        this.habitat = habitat;
    }
}
