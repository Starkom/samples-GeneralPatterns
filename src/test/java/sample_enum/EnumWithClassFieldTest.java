package sample_enum;

import java.util.List;
import java.util.Map;
import org.junit.Test;
import org.assertj.core.api.SoftAssertions;
import sample_enum.EnumWithClassField;

public class EnumWithClassFieldTest {

    @Test
    public void test_validate_EnumWithClassField_Getters_getField() {
        SoftAssertions sa = new SoftAssertions();
        sa.assertThat(EnumWithClassField.CONST1.getField()).isEqualTo(Map.class);
        sa.assertThat(EnumWithClassField.CONST2.getField()).isEqualTo(List.class);
        sa.assertAll();
    }
}
