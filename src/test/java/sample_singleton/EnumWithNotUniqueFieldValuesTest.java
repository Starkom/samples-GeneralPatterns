package sample_singleton;

import org.junit.Test;
import org.assertj.core.api.SoftAssertions;
import sample_enum.EnumWithNotUniqueFieldValues;

public class EnumWithNotUniqueFieldValuesTest {

    @Test
    public void test_validate_EnumWithNotUniqueFieldValues_Getters_field1() {
        SoftAssertions sa = new SoftAssertions();
        sa.assertThat(EnumWithNotUniqueFieldValues.ALL_FALSE.field1()).isEqualTo(false);
        sa.assertThat(EnumWithNotUniqueFieldValues.MIXED1.field1()).isEqualTo(true);
        sa.assertThat(EnumWithNotUniqueFieldValues.MIXED2.field1()).isEqualTo(false);
        sa.assertThat(EnumWithNotUniqueFieldValues.ALL_TRUE.field1()).isEqualTo(true);
        sa.assertAll();
    }

    @Test
    public void test_validate_EnumWithNotUniqueFieldValues_Getters_field2() {
        SoftAssertions sa = new SoftAssertions();
        sa.assertThat(EnumWithNotUniqueFieldValues.ALL_FALSE.field2()).isEqualTo(false);
        sa.assertThat(EnumWithNotUniqueFieldValues.MIXED1.field2()).isEqualTo(false);
        sa.assertThat(EnumWithNotUniqueFieldValues.MIXED2.field2()).isEqualTo(true);
        sa.assertThat(EnumWithNotUniqueFieldValues.ALL_TRUE.field2()).isEqualTo(true);
        sa.assertAll();
    }

    @Test
    public void test_validate_EnumWithNotUniqueFieldValues_Getters_field3() {
        SoftAssertions sa = new SoftAssertions();
        sa.assertThat(EnumWithNotUniqueFieldValues.ALL_FALSE.field3()).isEqualTo(false);
        sa.assertThat(EnumWithNotUniqueFieldValues.MIXED1.field3()).isEqualTo(false);
        sa.assertThat(EnumWithNotUniqueFieldValues.MIXED2.field3()).isEqualTo(false);
        sa.assertThat(EnumWithNotUniqueFieldValues.ALL_TRUE.field3()).isEqualTo(true);
        sa.assertAll();
    }
}
