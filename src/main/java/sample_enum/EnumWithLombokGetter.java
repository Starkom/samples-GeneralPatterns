/*
 * Copyright © 2017 Aram Meem Company Limited. All Rights Reserved.
 */

package sample_enum;

//import lombok.Getter;

public enum EnumWithLombokGetter {
    CONST1,
    CONST2(true),
    CONST3;

//    @Getter
    private boolean field = false;

    EnumWithLombokGetter() {
    }

    EnumWithLombokGetter(boolean field) {
        this.field = field;
    }
}
