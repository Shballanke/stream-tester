package ru.romanov.st.service;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import ru.romanov.st.StApplicationTests;
import ru.romanov.st.item.TestObject;

import java.util.List;

class SimpleServiceTest extends StApplicationTests {
    private static final Logger log = LoggerFactory.getLogger(StApplicationTests.class);

    @Autowired
    SimpleService simpleService;

    @Test
    void sortByStringValue() {
        for (int i = 0; i < TEST_COUNT; i++) {
            List<TestObject> testObjectList = generateTestObjectList(OBJECT_COUNT);
            log.info("Simple service sort by string for: " + getSortByStringTime(testObjectList) + "ns");
        }
    }

    @Test
    void getStringList() {
        for (int i = 0; i < TEST_COUNT; i++) {
            List<TestObject> testObjectList = generateTestObjectList(OBJECT_COUNT);
            log.info("Simple service return string list for: " + getStringListTime(testObjectList) + "ns");
        }
    }

    private long getSortByStringTime(List<TestObject> testObjectList) {
        long start = System.nanoTime();
        simpleService.sortByStringValue(testObjectList);
        long end = System.nanoTime();
        return end - start;
    }

    private long getStringListTime(List<TestObject> testObjectList) {
        long start = System.nanoTime();
        simpleService.getStringList(testObjectList);
        long end = System.nanoTime();
        return end - start;
    }
}