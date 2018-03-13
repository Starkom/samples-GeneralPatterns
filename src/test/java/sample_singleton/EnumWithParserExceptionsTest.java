package sample_singleton;

import org.junit.Test;
import sample_enum.EnumWithParserExceptions;

public class EnumWithParserExceptionsTest {

    @Test(expected = IllegalArgumentException.class)
    public void test_validate_EnumWithParserExceptions_ParserByStringException_parse() {
        EnumWithParserExceptions.parse("Brazilian Space Agency");
    }

    @Test(expected = IllegalArgumentException.class)
    public void test_validate_EnumWithParserExceptions_ParserByIntException_parse() {
        EnumWithParserExceptions.parse(2147483647);
    }
}
