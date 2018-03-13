package sample_enum;

public class MethodWithEnumParam {
    private static void doNothing(int i){}

    public static void jpg() {
        doNothing(0);
    }

    public static void png() {
        doNothing(1);
    }

    public static void gif() {
        doNothing(2);
    }

    public static void doSomething(EnumWithParserExceptions format) {
        switch(format) {
            case jpg: jpg(); break;
            case png: png(); break;
            case gif: gif();
        }
    }
}
