package sample_enum;

public enum EnumWithGetterAndParser {
    CONST1("Value1"),
    CONST2("Value2"),
    CONST3("Value3");

    private final String field;

    EnumWithGetterAndParser(String field) {
        this.field = field;
    }

    public String getField() {
        return field;
    }

    public static EnumWithGetterAndParser findByName(String name) {
        for (EnumWithGetterAndParser item : values()) {
            if (item.name().equals(name)) {
                return item;
            }
        }
        return null;
    }

    public static EnumWithGetterAndParser findByField(String value) {
        for (EnumWithGetterAndParser item : values()) {
            if (item.getField().equals(value)) {
                return item;
            }
        }
        return null;
    }
}
