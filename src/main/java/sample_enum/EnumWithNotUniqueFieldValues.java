/*
 * Copyright © 2017 Aram Meem Company Limited.  All Rights Reserved.
 */

package sample_enum;

public enum EnumWithNotUniqueFieldValues {
    ALL_FALSE(false, false, false),
    MIXED1(true, false, false),
    MIXED2(false, true, false),
    ALL_TRUE(true, true, true);

    private final boolean field1;
    private final boolean field2;
    private final boolean field3;

    EnumWithNotUniqueFieldValues(boolean field1, boolean field2, boolean field3) {
        this.field1 = field1;
        this.field2 = field2;
        this.field3 = field3;
    }

    public boolean field1() {
        return field1;
    }

    public boolean field2() {
        return field2;
    }

    public boolean field3() {
        return field3;
    }

    public static EnumWithNotUniqueFieldValues wrongParser(boolean field1) {
        for(EnumWithNotUniqueFieldValues item : values()) {
            if (item.field1 == field1) {
                return item;
            }
        }
        return null;
    }
}
