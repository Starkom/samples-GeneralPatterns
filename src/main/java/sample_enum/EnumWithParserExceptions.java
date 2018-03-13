package sample_enum;

public enum EnumWithParserExceptions {
    png, gif, jpg;

    public static EnumWithParserExceptions parse(final String format) {
        for (final EnumWithParserExceptions type : values()) {
            if (type.name() == format) {
                return type;
            }
        }

        throw new IllegalArgumentException();
    }

    public static EnumWithParserExceptions parse(final int value) {
        for (final EnumWithParserExceptions type : values()) {
            if (type.ordinal() == value) {
                return type;
            }
        }

        throw new IllegalArgumentException();
    }
}