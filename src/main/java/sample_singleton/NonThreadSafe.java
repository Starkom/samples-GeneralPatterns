package sample_singleton;

public class NonThreadSafe {

    private static NonThreadSafe instance;

    private NonThreadSafe() {
    }

    public static NonThreadSafe getInstance() {
        if (instance == null) {
            instance = new NonThreadSafe();
        }
        return instance;
    }

}
