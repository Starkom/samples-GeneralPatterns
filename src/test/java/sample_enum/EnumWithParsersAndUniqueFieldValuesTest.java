package sample_enum;

import org.junit.Test;
import org.junit.Assert;
import org.assertj.core.api.SoftAssertions;
import sample_enum.EnumWithParsersAndUniqueFieldValues;

public class EnumWithParsersAndUniqueFieldValuesTest {

    @Test
    public void test_validate_EnumWithParsersAndUniqueFieldValues_Parser_findByStringField() {
        SoftAssertions sa = new SoftAssertions();
        sa.assertThat(EnumWithParsersAndUniqueFieldValues.findByStringField("String1")).isEqualTo(EnumWithParsersAndUniqueFieldValues.CONST1);
        sa.assertThat(EnumWithParsersAndUniqueFieldValues.findByStringField("String2")).isEqualTo(EnumWithParsersAndUniqueFieldValues.CONST2);
        sa.assertThat(EnumWithParsersAndUniqueFieldValues.findByStringField("String3")).isEqualTo(EnumWithParsersAndUniqueFieldValues.CONST3);
        sa.assertAll();
    }

    @Test
    public void test_validate_EnumWithParsersAndUniqueFieldValues_Parser_findByIntField() {
        SoftAssertions sa = new SoftAssertions();
        sa.assertThat(EnumWithParsersAndUniqueFieldValues.findByIntField(-1)).isEqualTo(EnumWithParsersAndUniqueFieldValues.CONST1);
        sa.assertThat(EnumWithParsersAndUniqueFieldValues.findByIntField(0)).isEqualTo(EnumWithParsersAndUniqueFieldValues.CONST2);
        sa.assertThat(EnumWithParsersAndUniqueFieldValues.findByIntField(1)).isEqualTo(EnumWithParsersAndUniqueFieldValues.CONST3);
        sa.assertAll();
    }

    @Test
    public void test_validate_EnumWithParsersAndUniqueFieldValues_ToString() {
        for (EnumWithParsersAndUniqueFieldValues value : EnumWithParsersAndUniqueFieldValues.values()) {
            String toStringValue = value.toString();
            Assert.assertTrue(toStringValue != null && !toStringValue.isEmpty());
        }
    }

    @Test
    public void test_validate_EnumWithParsersAndUniqueFieldValues_Getters_getStringField() {
        SoftAssertions sa = new SoftAssertions();
        sa.assertThat(EnumWithParsersAndUniqueFieldValues.CONST1.getStringField()).isEqualTo("String1");
        sa.assertThat(EnumWithParsersAndUniqueFieldValues.CONST2.getStringField()).isEqualTo("String2");
        sa.assertThat(EnumWithParsersAndUniqueFieldValues.CONST3.getStringField()).isEqualTo("String3");
        sa.assertAll();
    }

    @Test
    public void test_validate_EnumWithParsersAndUniqueFieldValues_Getters_getIntField() {
        SoftAssertions sa = new SoftAssertions();
        sa.assertThat(EnumWithParsersAndUniqueFieldValues.CONST1.getIntField()).isEqualTo(-1);
        sa.assertThat(EnumWithParsersAndUniqueFieldValues.CONST2.getIntField()).isEqualTo(0);
        sa.assertThat(EnumWithParsersAndUniqueFieldValues.CONST3.getIntField()).isEqualTo(1);
        sa.assertAll();
    }
}
