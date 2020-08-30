package duke;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

public class DeadlineTest {
    @Test
    public void toString_test_formattedString() {
        Task t = new Deadline("test", true, LocalDate.parse("2020-03-19"));
        assertEquals("[D][✓] test (by: Mar 19 2020)", t.toString());
    }
}
