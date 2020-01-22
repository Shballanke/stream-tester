package ru.romanov.st.service;

import ru.romanov.st.item.TestObject1;

import java.util.List;

public interface TestService {
    void sortByStringValue(List<TestObject1> testObject1List);
    List<String> getStringList(List<TestObject1> testObject1List);
}
