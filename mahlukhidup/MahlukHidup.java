package mahlukhidup;

import java.util.Collections;
import java.util.LinkedHashSet;
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
        this.habitat = (habitat != null) ? new LinkedHashSet<>(habitat) : new LinkedHashSet<>();
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
        return Collections.unmodifiableSet(habitat);
    }

    public boolean isMasihHidup() {
        return masihHidup;
    }

    // Setters & Mutators
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setBerat(double berat) {
        if (berat > 0) {
            this.berat = berat;
        }
    }

    public void setHabitat(Set<String> habitat) {
        this.habitat = (habitat != null) ? new LinkedHashSet<>(habitat) : new LinkedHashSet<>();
    }

    public void tambahHabitat(String habitatBaru) {
        if (habitatBaru != null && !habitatBaru.trim().isEmpty()) {
            this.habitat.add(habitatBaru);
        }
    }

    public void hapusHabitat(String habitatLama) {
        if (habitatLama != null) {
            this.habitat.remove(habitatLama);
        }
    }

    public boolean adaHabitat(String habitatCari) {
        return this.habitat.contains(habitatCari);
    }
}
