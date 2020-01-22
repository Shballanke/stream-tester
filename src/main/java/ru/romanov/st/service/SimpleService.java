package ru.romanov.st.service;

import org.springframework.stereotype.Service;
import ru.romanov.st.item.TestObject1;
import ru.romanov.st.item.TestObject2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

@Service
public class SimpleService implements TestService{
    public void sortByStringValue(List<TestObject1> testObject1List) {
        testObject1List.sort(Comparator.comparing(TestObject1::getStringValue));
    }

    public List<String> getStringList(List<TestObject1> testObject1List) {
        List<String> output = new ArrayList<>();
        for (TestObject1 testObject1 : testObject1List) {
            output.add(testObject1.getStringValue());
        }
        return output;
    }

    public List<TestObject2> copyToOtherList(List<TestObject1> testObject1List) {
        List<TestObject2> output = new ArrayList<>();
        for (TestObject1 testObject1 : testObject1List) {
            TestObject2 testObject2 = new TestObject2();
            testObject2.setDateValue(testObject1.getDateValue());
            testObject2.setLongValue(testObject2.getLongValue());
            testObject2.setStringValue(testObject1.getStringValue());
        }
        return output;
    }
}
