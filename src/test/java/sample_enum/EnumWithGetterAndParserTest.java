package sample_enum;

import org.junit.Test;
import org.assertj.core.api.SoftAssertions;
import sample_enum.EnumWithGetterAndParser;

public class EnumWithGetterAndParserTest {

    @Test
    public void test_validate_EnumWithGetterAndParser_Getters_getField() {
        SoftAssertions sa = new SoftAssertions();
        sa.assertThat(EnumWithGetterAndParser.CONST1.getField()).isEqualTo("Value1");
        sa.assertThat(EnumWithGetterAndParser.CONST2.getField()).isEqualTo("Value2");
        sa.assertThat(EnumWithGetterAndParser.CONST3.getField()).isEqualTo("Value3");
        sa.assertAll();
    }

    @Test
    public void test_validate_EnumWithGetterAndParser_Parser_findByField() {
        SoftAssertions sa = new SoftAssertions();
        sa.assertThat(EnumWithGetterAndParser.findByField("Value1")).isEqualTo(EnumWithGetterAndParser.CONST1);
        sa.assertThat(EnumWithGetterAndParser.findByField("Value2")).isEqualTo(EnumWithGetterAndParser.CONST2);
        sa.assertThat(EnumWithGetterAndParser.findByField("Value3")).isEqualTo(EnumWithGetterAndParser.CONST3);
        sa.assertAll();
    }
}
