package ru.romanov.st.service;

import ru.romanov.st.item.TestObject;

import java.util.List;

public interface TestService {
    void sortByStringValue(List<TestObject> testObjectList);
    List<String> getStringList(List<TestObject> testObjectList);
}
