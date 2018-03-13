package sample_enum;

import java.util.Arrays;

public interface OuterWithEnum {

    void methodWithEnumParam(String key, InnerEnum bucketType);

    void methodWithEnumParam(InnerEnum bucketType);

    enum InnerEnum {
        ENUM_CONST_1("Data1"),
        ENUM_CONST_2("Data2"),
        ENUM_CONST_3("Data3");

        private final String name;
        private final String finalField = "finalString";
        private String nonFinalFieldWithoutSetter = null;
        private String nonFinalFieldWithSetter = null;

        InnerEnum(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public String getFinalField() {
            return finalField;
        }

        public String getNonFinalFieldWithoutSetter() {
            return nonFinalFieldWithoutSetter;
        }

        public String getNonFinalFieldWithSetter() {
            return nonFinalFieldWithSetter;
        }

        public void setNonFinalFieldWithSetter(String nonFinalFieldWithSetter) {
            this.nonFinalFieldWithSetter = nonFinalFieldWithSetter;
        }

        public static InnerEnum parseNameClassic(String name) {
            for (InnerEnum enumType : InnerEnum.values()) {
                if (enumType.name.equals(name)) {
                    return enumType;
                }
            }
            throw new IllegalArgumentException();
        }

        public static InnerEnum parseNameLambda(String name) {
            return Arrays.stream(values()).filter(i -> i.name.equals(name)).findFirst()
                    .orElseThrow(IllegalArgumentException::new);
        }
    }
}
