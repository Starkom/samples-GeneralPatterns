package sample_singleton;

import org.junit.Test;
import org.assertj.core.api.SoftAssertions;
import sample_enum.OuterWithEnum;

public class OuterWithEnumTest {

    @Test
    public void test_validate_OuterWithEnumInnerEnum_Getters_getName() {
        SoftAssertions sa = new SoftAssertions();
        sa.assertThat(OuterWithEnum.InnerEnum.ENUM_CONST_1.getName()).isEqualTo("Data1");
        sa.assertThat(OuterWithEnum.InnerEnum.ENUM_CONST_2.getName()).isEqualTo("Data2");
        sa.assertThat(OuterWithEnum.InnerEnum.ENUM_CONST_3.getName()).isEqualTo("Data3");
        sa.assertAll();
    }

    @Test
    public void test_validate_OuterWithEnumInnerEnum_Getters_getFinalField() {
        SoftAssertions sa = new SoftAssertions();
        sa.assertThat(OuterWithEnum.InnerEnum.ENUM_CONST_1.getFinalField()).isEqualTo("finalString");
        sa.assertThat(OuterWithEnum.InnerEnum.ENUM_CONST_2.getFinalField()).isEqualTo("finalString");
        sa.assertThat(OuterWithEnum.InnerEnum.ENUM_CONST_3.getFinalField()).isEqualTo("finalString");
        sa.assertAll();
    }

    @Test
    public void test_validate_OuterWithEnumInnerEnum_Getters_getNonFinalFieldWithoutSetter() {
        SoftAssertions sa = new SoftAssertions();
        sa.assertThat(OuterWithEnum.InnerEnum.ENUM_CONST_1.getNonFinalFieldWithoutSetter()).isEqualTo(null);
        sa.assertThat(OuterWithEnum.InnerEnum.ENUM_CONST_2.getNonFinalFieldWithoutSetter()).isEqualTo(null);
        sa.assertThat(OuterWithEnum.InnerEnum.ENUM_CONST_3.getNonFinalFieldWithoutSetter()).isEqualTo(null);
        sa.assertAll();
    }

    @Test(expected = IllegalArgumentException.class)
    public void test_validate_OuterWithEnumInnerEnum_ParserByStringException_parseNameClassic() {
        OuterWithEnum.InnerEnum.parseNameClassic("Enterprise");
    }

    @Test
    public void test_validate_OuterWithEnumInnerEnum_Parser_parseNameClassic() {
        SoftAssertions sa = new SoftAssertions();
        sa.assertThat(OuterWithEnum.InnerEnum.parseNameClassic("Data1")).isEqualTo(OuterWithEnum.InnerEnum.ENUM_CONST_1);
        sa.assertThat(OuterWithEnum.InnerEnum.parseNameClassic("Data2")).isEqualTo(OuterWithEnum.InnerEnum.ENUM_CONST_2);
        sa.assertThat(OuterWithEnum.InnerEnum.parseNameClassic("Data3")).isEqualTo(OuterWithEnum.InnerEnum.ENUM_CONST_3);
        sa.assertAll();
    }

    @Test
    public void test_validate_OuterWithEnumInnerEnum_Parser_parseNameLambda() {
        SoftAssertions sa = new SoftAssertions();
        sa.assertThat(OuterWithEnum.InnerEnum.parseNameLambda("Data1")).isEqualTo(OuterWithEnum.InnerEnum.ENUM_CONST_1);
        sa.assertThat(OuterWithEnum.InnerEnum.parseNameLambda("Data2")).isEqualTo(OuterWithEnum.InnerEnum.ENUM_CONST_2);
        sa.assertThat(OuterWithEnum.InnerEnum.parseNameLambda("Data3")).isEqualTo(OuterWithEnum.InnerEnum.ENUM_CONST_3);
        sa.assertAll();
    }
}
