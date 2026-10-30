// LEVEL 2 - IS-A MakhlukHidup
public abstract class Tumbuhan extends MakhlukHidup {
    private String warnaDaun;

    protected Tumbuhan(String nama, int umur, String warnaDaun) {
        super(nama, umur);
        this.warnaDaun = warnaDaun;
    }

    public String getWarnaDaun() { return warnaDaun; }

    public void fotosintesis() {
        System.out.println(getNama() + " berfotosintesis dengan daun " + warnaDaun);
    }

    @Override
    public void makan() {
        System.out.println(getNama() + " menyerap air dan mineral lewat akar");
    }

    @Override
    public void suaraKhas() {
        System.out.println(getNama() + ": (diam, tumbuhan tidak bersuara)");
    }
}
