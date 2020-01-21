package ru.romanov.st;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import ru.romanov.st.item.TestObject;
import ru.romanov.st.service.StreamService;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
public class StApplicationTests {

    public static final int TEST_COUNT = 10;
    public static final int OBJECT_COUNT = 1000;

    @Test
    void contextLoads() {
    }

    public List<TestObject> generateTestObjectList(int objectsCount) {
        List<TestObject> output = new ArrayList<>();
        for (int i = 0; i < objectsCount; i++) {
            output.add(new TestObject());
        }
        return output;
    }

}
