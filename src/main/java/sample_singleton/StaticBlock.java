package sample_singleton;

public class StaticBlock {

    private static StaticBlock instance;

    static {
        try {
            instance = new StaticBlock();
        } catch (Exception e) {
            throw new RuntimeException("Exception occurred in creating singleton instance");
        }
    }

    private StaticBlock() {
    }

    public static StaticBlock getInstance() {
        return instance;
    }
}