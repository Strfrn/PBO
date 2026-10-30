// INTERFACE: kontrak kemampuan terbang
public interface Terbang {
    void terbang();

    // default method
    default void mendarat() {
        System.out.println("  -> mendarat dengan mulus");
    }
}
