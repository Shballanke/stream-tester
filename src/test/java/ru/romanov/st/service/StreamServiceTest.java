package ru.romanov.st.service;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import ru.romanov.st.StApplicationTests;
import ru.romanov.st.item.TestObject1;

import java.util.List;

class StreamServiceTest extends StApplicationTests {
    private static final Logger log = LoggerFactory.getLogger(StApplicationTests.class);

    @Autowired
    StreamService streamService;

    @Test
    void sortByStringValue() {
        log.info("*** Stream service sort by string ***");
        for (int i = 0; i < TEST_COUNT; i++) {
            List<TestObject1> testObject1List = generateTestObjectList(OBJECT_COUNT);
            log.info("Stream service sort by string for: " + getSortByStringTime(testObject1List) + "ns");
        }
    }

    @Test
    void getStringList() {
        log.info("*** Stream service map to string list ***");
        for (int i = 0; i < TEST_COUNT; i++) {
            List<TestObject1> testObject1List = generateTestObjectList(OBJECT_COUNT);
            log.info("Stream service return string list for: " + getStringListTime(testObject1List) + "ns");
        }
    }

    @Test
    void copyToOtherList() {
        log.info("*** Stream service copy objects to other list ***");
        for (int i = 0; i < TEST_COUNT; i++) {
            List<TestObject1> testObject1List = generateTestObjectList(OBJECT_COUNT);
            log.info("Stream service copy objects to other list for: " + getCopyListTime(testObject1List) + "ns");
        }
    }

    private long getSortByStringTime(List<TestObject1> testObject1List) {
        long start = System.nanoTime();
        streamService.sortByStringValue(testObject1List);
        long end = System.nanoTime();
        return end - start;
    }

    private long getStringListTime(List<TestObject1> testObject1List) {
        long start = System.nanoTime();
        streamService.getStringList(testObject1List);
        long end = System.nanoTime();
        return end - start;
    }

    private long getCopyListTime(List<TestObject1> testObject1List) {
        long start = System.nanoTime();
        streamService.copyToOtherList(testObject1List);
        long end = System.nanoTime();
        return end - start;
    }
}