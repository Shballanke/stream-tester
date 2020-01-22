package ru.romanov.st;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import ru.romanov.st.item.TestObject1;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
public class StApplicationTests {

    public static final int TEST_COUNT = 10;
    public static final int OBJECT_COUNT = 1000;

    @Test
    void contextLoads() {
    }

    public List<TestObject1> generateTestObjectList(int objectsCount) {
        List<TestObject1> output = new ArrayList<>();
        for (int i = 0; i < objectsCount; i++) {
            output.add(new TestObject1());
        }
        return output;
    }

}
