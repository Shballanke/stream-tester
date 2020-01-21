package ru.romanov.st.service;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import ru.romanov.st.StApplicationTests;
import ru.romanov.st.item.TestObject;

import java.util.List;

class StreamServiceTest extends StApplicationTests {
    private static final Logger log = LoggerFactory.getLogger(StApplicationTests.class);

    @Autowired
    StreamService streamService;

    @Test
    void sortByStringValue() {
        for (int i = 0; i < TEST_COUNT; i++) {
            List<TestObject> testObjectList = generateTestObjectList(OBJECT_COUNT);
            log.info("Stream service sort by string for: " + getSortByStringTime(testObjectList) + "ns");
        }
    }

    @Test
    void getStringList() {
        for (int i = 0; i < TEST_COUNT; i++) {
            List<TestObject> testObjectList = generateTestObjectList(OBJECT_COUNT);
            log.info("Stream service return string list for: " + getStringListTime(testObjectList) + "ns");
        }
    }

    private long getSortByStringTime(List<TestObject> testObjectList) {
        long start = System.nanoTime();
        streamService.sortByStringValue(testObjectList);
        long end = System.nanoTime();
        return end - start;
    }

    private long getStringListTime(List<TestObject> testObjectList) {
        long start = System.nanoTime();
        streamService.getStringList(testObjectList);
        long end = System.nanoTime();
        return end - start;
    }
}