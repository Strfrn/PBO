package mahlukhidup;

/**
 * Custom Exception ketika data makhluk hidup tidak ditemukan di dalam collection (Map).
 */
public class DataTidakDitemukanException extends Exception {
    public DataTidakDitemukanException(String pesan) {
        super(pesan);
    }
}
