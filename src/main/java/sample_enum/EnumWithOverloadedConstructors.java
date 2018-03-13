/*
 * Copyright © 2017 Aram Meem Company Limited. All Rights Reserved.
 */

package sample_enum;

public enum EnumWithOverloadedConstructors {
    CONST1(true),
    CONST2(false),
    CONST3(true, "NOT_NULL_STRING");

    private boolean booleanField;

    private final String stringField;

    EnumWithOverloadedConstructors(boolean booleanField) {
        this(booleanField, null);
    }

    EnumWithOverloadedConstructors(boolean booleanField, String stringField) {
        this.booleanField = booleanField;
        if (stringField == null) {
            this.stringField = name();
        } else {
            this.stringField = stringField;
        }
    }

    @Override
    public String toString() {
        return stringField;
    }

    public String getStringField() {
        return stringField;
    }

    public boolean isBooleanField() {
        return booleanField;
    }
}
