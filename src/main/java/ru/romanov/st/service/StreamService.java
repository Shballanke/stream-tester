package ru.romanov.st.service;

import org.springframework.stereotype.Service;
import ru.romanov.st.item.TestObject;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class StreamService implements TestService{

    public void sortByStringValue(List<TestObject> testObjectList) {
         testObjectList.stream().sorted(Comparator.comparing(TestObject::getStringValue));

    }

    public List<String> getStringList(List<TestObject> testObjectList) {
        return testObjectList.stream().map(TestObject::getStringValue).collect(Collectors.toList());
    }

}
