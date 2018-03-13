package sample_enum;

import org.junit.Test;
import org.junit.Assert;
import org.assertj.core.api.SoftAssertions;
import sample_enum.EnumWithOverloadedConstructors;

public class EnumWithOverloadedConstructorsTest {

    @Test
    public void test_validate_EnumWithOverloadedConstructors_ToString() {
        for (EnumWithOverloadedConstructors value : EnumWithOverloadedConstructors.values()) {
            String toStringValue = value.toString();
            Assert.assertTrue(toStringValue != null && !toStringValue.isEmpty());
        }
    }

    @Test
    public void test_validate_EnumWithOverloadedConstructors_Getters_getStringField() {
        SoftAssertions sa = new SoftAssertions();
        sa.assertThat(EnumWithOverloadedConstructors.CONST3.getStringField()).isEqualTo("NOT_NULL_STRING");
        sa.assertAll();
    }

    @Test
    public void test_validate_EnumWithOverloadedConstructors_Getters_isBooleanField() {
        SoftAssertions sa = new SoftAssertions();
        sa.assertThat(EnumWithOverloadedConstructors.CONST1.isBooleanField()).isEqualTo(true);
        sa.assertThat(EnumWithOverloadedConstructors.CONST2.isBooleanField()).isEqualTo(false);
        sa.assertThat(EnumWithOverloadedConstructors.CONST3.isBooleanField()).isEqualTo(true);
        sa.assertAll();
    }
}
