package ru.romanov.st.service;

import org.springframework.stereotype.Service;
import ru.romanov.st.item.TestObject1;
import ru.romanov.st.item.TestObject2;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class StreamService implements TestService{

    public void sortByStringValue(List<TestObject1> testObject1List) {
         testObject1List.stream().sorted(Comparator.comparing(TestObject1::getStringValue));

    }

    public List<String> getStringList(List<TestObject1> testObject1List) {
        return testObject1List.stream().map(TestObject1::getStringValue).collect(Collectors.toList());
    }

    public List<TestObject2> copyToOtherList(List<TestObject1> testObject1List) {
        List<TestObject2> output = testObject1List.stream().map(testObject1 -> {
            TestObject2 testObject2 = new TestObject2();
            testObject2.setDateValue(testObject1.getDateValue());
            testObject2.setLongValue(testObject2.getLongValue());
            testObject2.setStringValue(testObject1.getStringValue());
            return testObject2;

        }).collect(Collectors.toList());
        return output;
    }
}
