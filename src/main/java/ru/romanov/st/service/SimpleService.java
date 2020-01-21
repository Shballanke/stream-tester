package ru.romanov.st.service;

import org.springframework.stereotype.Service;
import ru.romanov.st.item.TestObject;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

@Service
public class SimpleService implements TestService{
    public void sortByStringValue(List<TestObject> testObjectList) {
        testObjectList.sort(Comparator.comparing(TestObject::getStringValue));
    }

    public List<String> getStringList(List<TestObject> testObjectList) {
        List<String> output = new ArrayList<>();
        for (TestObject testObject : testObjectList) {
            output.add(testObject.getStringValue());
        }
        return output;
    }
}
