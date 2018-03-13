package sample_enum;

public enum EnumWithParsersAndUniqueFieldValues {
    CONST1("String1", -1),
    CONST2("String2", 0),
    CONST3("String3", 1);

    public final String stringField;
    public final int intField;

    EnumWithParsersAndUniqueFieldValues(final String stringField, final int intField) {
        this.stringField = stringField;
        this.intField = intField;
    }

    public static EnumWithParsersAndUniqueFieldValues findByStringField(final String stringField) {
        for (EnumWithParsersAndUniqueFieldValues item : values()) {
            if (stringField.equals(item.stringField))
                return item;
        }
        return null;
    }

    public static int findPosition(String stringField) {
        for (int i = 0; i < values().length; i++) {
            EnumWithParsersAndUniqueFieldValues item = values()[i];
            if (stringField.equals(item.stringField))
                return i;
        }
        return -1;
    }

    public static EnumWithParsersAndUniqueFieldValues findByIntField(final int intField) {
        for (EnumWithParsersAndUniqueFieldValues item : values()) {
            if (intField == item.intField)
                return item;
        }
        return null;
    }

    @Override
    public String toString() {
        return stringField + "_" + intField;
    }

    public static EnumWithParsersAndUniqueFieldValues wrongParserWithoutValuesCall(String someString) {
        return CONST1;
    }

    public String getStringField() {
        return stringField;
    }

    public int getIntField() {
        return intField;
    }
}
