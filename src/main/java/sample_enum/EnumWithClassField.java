package sample_enum;

import java.util.List;
import java.util.Map;

public enum EnumWithClassField {

    CONST1(Map.class),
    CONST2(List.class);

    private final Class field;

    EnumWithClassField(Class field) {
        this.field = field;
    }

    public Class getField() {
        return field;
    }
}
