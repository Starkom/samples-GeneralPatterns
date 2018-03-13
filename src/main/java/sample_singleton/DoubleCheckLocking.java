package sample_singleton;

public class DoubleCheckLocking {

    private static DoubleCheckLocking instance;

    private DoubleCheckLocking() {
    }

    public static synchronized DoubleCheckLocking getInstance() {
        if (instance == null) {
            synchronized (DoubleCheckLocking.class) {
                if (instance == null) {
                    instance = new DoubleCheckLocking();
                }
            }
        }
        return instance;
    }

}